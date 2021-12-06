package telas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import pecas.Objeto;

public class Main {
	
	private static Jogador j1 = new Jogador(0); //branco
	private static Jogador j2 = new Jogador(1); //preto
	private static Jogador jogadorAtual;
	private static Jogador vencedor;
	private static Lugar[][] tabuleiro = new Lugar[8][8];
	private static Objeto pecaAtual;
	private static String jogadas="";
	private static int rever=0;
	
	public static int getRever() {
		return rever;
	}

	public static boolean setRever(int flag) throws FileNotFoundException {
		if(flag==1) {
			if(simulaJogo()) {
				setJogadores("Branco","Preto");
				rever=1;
				return true;
			}
			return false;
		} else {
			rever=0;
			return true;
		}
		
	}
	
	public static void setpecaAtual(int x, int y) {
		pecaAtual=tabuleiro[y][x].getPeca();
	}
	
	public static void setJogadores(String nome1, String nome2) {
		Jogador jo1 = new Jogador(0); 
		Jogador jo2 = new Jogador(1); 
		jo1.setNome(nome1);
		jo2.setNome(nome2); 
		
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				tabuleiro[i][j]=new Lugar();
			
		for(int i=0;i<16;i++) {
			Objeto peca=jo1.getPecas().get(i);
			if(peca!=null) {
				tabuleiro[peca.getY()][peca.getX()].colocaPeca(peca);
			}
		}
		
		for(int i=0;i<16;i++) {
			Objeto peca=jo2.getPecas().get(i);
			if(peca!=null) {
				tabuleiro[peca.getY()][peca.getX()].colocaPeca(peca);
			}
		}
		j1=jo1;
		j2=jo2;
		jogadorAtual=j1;
	}
	
	public static int vez() {
		return jogadorAtual.getCor();
	}
	
	public static void imprimeTabuleiro() {
		for(int i=0;i<8;i++) {
			System.out.print("\n");
			for(int j=0;j<8;j++) {
				if(tabuleiro[i][j].getPeca()==null) {
					System.out.print("- ");
				} else {
					System.out.print(tabuleiro[i][j].getPeca().getCor() + " ");
				}
			}
		}
		System.out.print("\n");
	}
	
	public static String getNome(int cor) {
		if(cor==0) {
			return j1.getNome();
		} else {
			return j2.getNome();
		}
	}
	
	public static int getX(int cor,int index) {
		if(cor==0) {
			return j1.getPecas().get(index).getPosTabX(-1);
		} else {
			return j2.getPecas().get(index).getPosTabX(-1);
		}
	}
	
	public static int getY(int cor,int index) {
		if(cor==0) {
			return j1.getPecas().get(index).getPosTabY(-1);
		} else {
			return j2.getPecas().get(index).getPosTabY(-1);
		}
	}
	
	public static boolean movimentoPeca(int x, int y) {
		if(xeque(-1,-1)) {
			if(!impedeXeque(x,y)) {
				return false;
			}
		} 
//		if(pecaAtual.getNome().equals("rb") || pecaAtual.getNome().equals("rp")) {
//			if(pecaAtual.movimento(tabuleiro, x, y,0) || Math.abs(pecaAtual.getX()-x)>1) {
//				
//			}
//		}
		if(pecaAtual.movimento(tabuleiro, x, y,0)) {
			if(getRever()==0) {
				registraMovimento(pecaAtual.getX(),pecaAtual.getY(),0);
			}
			
			if(tabuleiro[y][x].getPeca()==null) {
				pecaAtual.move(tabuleiro, x, y);
				if(getRever()==0) {
					registraMovimento(x,y,1);
				}
				
				pecaAtual.setFlagMovimento(1);
				if(jogadorAtual.getCor()==0) {
					jogadorAtual=j2;
				} else {
					jogadorAtual=j1;
				}
				return true;
			} else {
				pecaAtual.captura(tabuleiro, x, y);
				
				if(getRever()==0) {
					registraMovimento(x,y,1);
				}
				
				pecaAtual.setFlagMovimento(1);
				if(jogadorAtual.getCor()==0) {
					jogadorAtual=j2;
				} else {
					jogadorAtual=j1;
				}
				return true;
			}
		}
		return false;
	}
	
	public static boolean movimentosPossiveis(int x, int y) {
		return pecaAtual.movimento(tabuleiro, x, y, 0);
	}
	
	public static boolean validaPeca(int x, int y) {
		if(tabuleiro[y][x].getPeca()==null) {
			return false;
		}
		if(tabuleiro[y][x].getPeca().getCor()==jogadorAtual.getCor()) {
			pecaAtual=tabuleiro[y][x].getPeca();
			return true;
			
		} else {
			return false;
		}
	}
	
	public static boolean pecaCapturada(String nome) {
		for(Objeto p : j1.getPecas()) {
			if(p.isCapturada() && nome.equals(p.getNome()))
				return true;
		}
		for(Objeto p : j2.getPecas()) {
			if(p.isCapturada() && nome.equals(p.getNome()))
				return true;
		}
		return false;
	}
	
	public static void desiste() {
		if(jogadorAtual.getCor()==0) {
			vencedor=j2;
		} else {
			vencedor=j1;
		}
	}
	
	public static String getVencedor() throws IOException {
		registraPartida();
		return vencedor.getNome();
	}
	
	public static boolean xeque(int toX, int toY) {
		int x;
		int y;
		if(jogadorAtual.getCor()==0) {
			Objeto rei = j1.getPecas().get(15);
			if(toX!=-1) {
				x=toX;
				y=toY;
			} else {
				x=rei.getX();
				y=rei.getY();
			}
			for(Objeto p : j2.getPecas()) {
				if(!p.isCapturada() && p.movimento(tabuleiro,x,y,1)) {
					return true;
				}
			}
		} else {
			Objeto rei = j2.getPecas().get(15);
			if(toX!=-1) {
				x=toX;
				y=toY;
			} else {
				x=rei.getX();
				y=rei.getY();
			}
			for(Objeto p : j1.getPecas()) {
				if(!p.isCapturada() && p.movimento(tabuleiro,x,y,1)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean xequeMate() {
		int flag=0;
		if(jogadorAtual.getCor()==0) {
			Objeto rei = j1.getPecas().get(15);
			for(Objeto p : j2.getPecas()) {
				if(!p.isCapturada() && p.movimento(tabuleiro,rei.getX(),rei.getY(),1)) {
					if(!rei.movimento(tabuleiro,rei.getX()+1,rei.getY(), 1)   && !rei.movimento(tabuleiro,rei.getX(),rei.getY()+1, 1)   &&
					   !rei.movimento(tabuleiro,rei.getX()-1,rei.getY(), 1)   && !rei.movimento(tabuleiro,rei.getX(),rei.getY()-1, 1)   &&
					   !rei.movimento(tabuleiro,rei.getX()+1,rei.getY()+1, 1) && !rei.movimento(tabuleiro,rei.getX()-1,rei.getY()-1, 1) &&
					   !rei.movimento(tabuleiro,rei.getX()+1,rei.getY()-1, 1) && !rei.movimento(tabuleiro,rei.getX()-1,rei.getY()+1, 1) ) {
						for(Objeto o : j1.getPecas()) {
							if(!o.isCapturada() && o.movimento(tabuleiro,p.getX(),p.getY(),1)) {
								return false;
							}
						}
					} else {
						flag++;
					}
				} else {
					flag++;
				}
			}
			if(flag==16) {
				return false;
			}
			vencedor=j2;
		} else {
			Objeto rei = j2.getPecas().get(15);
			for(Objeto p : j1.getPecas()) {
				if(!p.isCapturada() && p.movimento(tabuleiro,rei.getX(),rei.getY(),1)) {
					if(!rei.movimento(tabuleiro,rei.getX()+1,rei.getY(), 1)   && !rei.movimento(tabuleiro,rei.getX(),rei.getY()+1, 1)   &&
					   !rei.movimento(tabuleiro,rei.getX()-1,rei.getY(), 1)   && !rei.movimento(tabuleiro,rei.getX(),rei.getY()-1, 1)   &&
					   !rei.movimento(tabuleiro,rei.getX()+1,rei.getY()+1, 1) && !rei.movimento(tabuleiro,rei.getX()-1,rei.getY()-1, 1) &&
					   !rei.movimento(tabuleiro,rei.getX()+1,rei.getY()-1, 1) && !rei.movimento(tabuleiro,rei.getX()-1,rei.getY()+1, 1) ) {
						for(Objeto o : j2.getPecas()) {
							if(!o.isCapturada() && o.movimento(tabuleiro,p.getX(),p.getY(),1)) {
								return false;
							}
						}
					} else {
						flag++;
					}
				} else {
					flag++;
				}
			}
			if(flag==16) {
				return false;
			}
			vencedor=j1;
		}
		return true;
	}
	
	public static boolean impedeXeque(int x, int y) {
        if(pecaAtual.movimento(tabuleiro, x, y,0)) {
        	if(tabuleiro[y][x].getPeca()==null) {
        		pecaAtual.move(tabuleiro, x, y);
        		if(xeque(-1,-1)) {
                    pecaAtual.volta(tabuleiro,0);
                    return false;
                }
        		pecaAtual.volta(tabuleiro,0);
        	} else {
        		pecaAtual.captura(tabuleiro, x, y);
        		if(xeque(-1,-1)) {
	                pecaAtual.volta(tabuleiro,1);
	                return false;
	            }
        		pecaAtual.volta(tabuleiro,1);
        	}
            return true;
        }
        return false;
    }
	
	public static void registraMovimento(int x, int y, int flag) {
		char letra = (char) (x + 65);
		char numero = (char) (y + 48);
		System.out.print("\n"+letra+" "+numero+"\n");
		jogadas+=letra;
		jogadas+=numero;
		if(flag==0) {
			jogadas+=">";
		} else {
			jogadas+=" ";
		}
	}
	
	public static void registraPartida() throws IOException {
		FileWriter writer = new FileWriter("Jogo.txt");
		writer.write(jogadas);
		writer.close();
	}
	
	public static boolean simulaJogo() throws FileNotFoundException {
		try {
			@SuppressWarnings("resource")
			Scanner useDelimiter = new Scanner(new File("Jogo.txt"), "UTF-8").useDelimiter("\\A");
			jogadas = useDelimiter.next();
			System.out.print(jogadas);
			return true;
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Nenhum jogo registrado","JOGO XASTREZ",JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		
	}
	
	public static boolean simula() {
		int x,y;
		int toX,toY;
		
		if(jogadas.length()>1) {
			while(true) {
				if(jogadas.charAt(0)==' ') {
					jogadas=jogadas.substring(1);
					break;
				}
				if(jogadas.charAt(0)=='>') 
					jogadas=jogadas.substring(1);
				x = jogadas.charAt(0) - 65;
				y = jogadas.charAt(1) - 48;
				jogadas=jogadas.substring(2);
				setpecaAtual(x,y);
				if(jogadas.charAt(0)=='>') {
					jogadas=jogadas.substring(1);
					toX = jogadas.charAt(0) - 65;
					toY = jogadas.charAt(1) - 48;
					jogadas=jogadas.substring(2);
					movimentoPeca(toX,toY);
				}
				System.out.print(jogadas);
			}
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		TelaZero.main(null);	
	}
}
