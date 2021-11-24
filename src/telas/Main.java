package telas;
import pecas.Objeto;

public class Main {
	
	private static Jogador j1 = new Jogador(0); //branco
	private static Jogador j2 = new Jogador(1); //preto
	private static Jogador vencedor;
	private static Lugar[][] tabuleiro = new Lugar[8][8];
	private static Objeto pecaAtual;
	
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
	
	public static int setaLugarX(String nome) {
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(tabuleiro[i][j].getPeca()!=null) {
					if(tabuleiro[i][j].getPeca().getNome().equals(nome)) {
						return tabuleiro[i][j].getPeca().getPosTabX(-1);
					}
				}
			}
		}
		return 970;
	}
	
	public static boolean movimentoPeca(int cor,int x, int y) {
		if(pecaAtual.movimento(tabuleiro, x, y,0)) {
			if(tabuleiro[y][x].getPeca()==null) {
				pecaAtual.move(tabuleiro, x, y);
				pecaAtual.setFlagMovimento(1);
				return true;
			} else {
				pecaAtual.captura(tabuleiro, x, y);
				pecaAtual.setFlagMovimento(1);
				return true;
			}
		}
		return false;
	}
	
	public static boolean validaPeca(int cor, int x, int y) {
		if(tabuleiro[y][x].getPeca()==null) {
			return false;
		}
		if(tabuleiro[y][x].getPeca().getCor()==cor) {
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
	
	public static void desiste(int cor) {
		if(cor==0) {
			vencedor=j2;
		} else {
			vencedor=j1;
		}
	}
	
	public static String getVencedor() {
		return vencedor.getNome();
	}
	
	public static boolean xeque(int cor, int toX, int toY) {
		int x;
		int y;
		if(cor==0) {
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
	
	public static boolean xequeMate(int cor) {
		if(cor==0) {
			Objeto rei = j1.getPecas().get(15);
			for(Objeto p : j2.getPecas()) {
				if(!p.isCapturada() && p.movimento(tabuleiro,rei.getX(),rei.getY(),1)) {
					if(!rei.movimento(tabuleiro,rei.getX()+1,rei.getY(), 1)   && !rei.movimento(tabuleiro,rei.getX(),rei.getY()+1, 1)   &&
					   !rei.movimento(tabuleiro,rei.getX()-1,rei.getY(), 1)   && !rei.movimento(tabuleiro,rei.getX(),rei.getY()-1, 1)   &&
					   !rei.movimento(tabuleiro,rei.getX()+1,rei.getY()+1, 1) && !rei.movimento(tabuleiro,rei.getX()-1,rei.getY()-1, 1) &&
					   !rei.movimento(tabuleiro,rei.getX()+1,rei.getY()-1, 1) && !rei.movimento(tabuleiro,rei.getX()-1,rei.getY()+1, 1) ) {
						for(Objeto o : j1.getPecas()) {
							if(!(o.isCapturada() && o.movimento(tabuleiro,p.getX(),p.getY(),1))) {
								vencedor=j2;
								return true;
							}
						}
					}
				} 
			}			
		} else {
			Objeto rei = j2.getPecas().get(15);
			for(Objeto p : j1.getPecas()) {
				if(!p.isCapturada() && p.movimento(tabuleiro,rei.getX(),rei.getY(),1)) {
					if(!rei.movimento(tabuleiro,rei.getX()+1,rei.getY(), 1)   && !rei.movimento(tabuleiro,rei.getX(),rei.getY()+1, 1)   &&
					   !rei.movimento(tabuleiro,rei.getX()-1,rei.getY(), 1)   && !rei.movimento(tabuleiro,rei.getX(),rei.getY()-1, 1)   &&
					   !rei.movimento(tabuleiro,rei.getX()+1,rei.getY()+1, 1) && !rei.movimento(tabuleiro,rei.getX()-1,rei.getY()-1, 1) &&
					   !rei.movimento(tabuleiro,rei.getX()+1,rei.getY()-1, 1) && !rei.movimento(tabuleiro,rei.getX()-1,rei.getY()+1, 1) ) {
						for(Objeto o : j2.getPecas()) {
							if(!(o.isCapturada() && o.movimento(tabuleiro,p.getX(),p.getY(),1))) {
								vencedor=j1;
								return true;
							}
						}
					}
				}
			}					
		}
		return false;
	}

	public static void main(String[] args) {
		TelaInicial.main(null);	
	}
}
