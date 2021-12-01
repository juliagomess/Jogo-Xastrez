package telas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
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

	public static void setRever(int jogo) throws FileNotFoundException {
		rever = jogo;
		setJogadores("1","2");
		simulaJogo();
	}
	
	public static void setpecaAtual(int x, int y) {
		pecaAtual=tabuleiro[y][x].getPeca();
	}
	
	public static void setJogadores(String nome1, String nome2) {
		j1.setNome(nome1);
		j2.setNome(nome2); 
		
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				tabuleiro[i][j]=new Lugar();
			
		for(int i=0;i<16;i++) {
			Objeto peca=j1.getPecas().get(i);
			if(peca!=null) {
				tabuleiro[peca.getY()][peca.getX()].colocaPeca(peca);
			}
		}
		
		for(int i=0;i<16;i++) {
			Objeto peca=j2.getPecas().get(i);
			if(peca!=null) {
				tabuleiro[peca.getY()][peca.getX()].colocaPeca(peca);
			}
		}
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
			if(jogadorAtual.getCor()==0) {
				jogadorAtual=j2;
			} else {
				jogadorAtual=j1;
			}
			return true;
		} else {
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
            pecaAtual.move(tabuleiro, x, y);
            if(xeque(-1,-1)) {
                pecaAtual.volta(tabuleiro);
                return false;
            }
            pecaAtual.setFlagMovimento(1);
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
	
	public static void simulaJogo() throws FileNotFoundException {
		Scanner useDelimiter = new Scanner(new File("Jogo.txt"), "UTF-8").useDelimiter("\\A");
		jogadas = useDelimiter.next();
		System.out.print(jogadas);
	}
	
	public static int simula(int flag) {
		int x;
		if(jogadas.length()==1) {
			return 9;
		}
		if(jogadas.charAt(0)=='>' || jogadas.charAt(0)==' ') {
			jogadas=jogadas.substring(1);
		}
		if(flag==0) {
			x = jogadas.charAt(0) - 65; 
		} else {
			x = jogadas.charAt(0) - 48;
		}
		
		jogadas=jogadas.substring(1);
		System.out.print("\n" +x + "\n");
		System.out.print(jogadas);
		return x;
	}

	public static void main(String[] args) throws FileNotFoundException {
		TelaZero.main(null);	
	}
}
