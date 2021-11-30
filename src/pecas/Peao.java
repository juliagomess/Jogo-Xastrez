package pecas;
import telas.Jogador;
import telas.Lugar;

public class Peao extends Objeto {
	
	private Jogador jogador;
	
	public Peao(int cor,Jogador j) {
		this.setCor(cor);
		this.setJogador(j);
		this.setCapturada(false);
		this.setFlagMovimento(0);
	}
	
	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public boolean movimento(Lugar[][] tabuleiro, int x, int y, int flag) {
		if(tabuleiro[y][x].getVazio() && flag==0) {
			if(this.getCor() == 0) {
				if(this.getFlagMovimento()==0) {
					if((this.getY()-2 == y || this.getY()-1 == y) && this.getX() == x) {
						return true;
					}
					
				} else {
					if(this.getY()-1 == y && this.getX() == x) {
						return true;
					}
				}
				
			} else {
				if(this.getFlagMovimento()==0) {
					if((this.getY()+2 == y || this.getY()+1 == y) && this.getX() == x) {
						return true;
					}
					
				} else {
					if(this.getY()+1 == y && this.getX() == x) {
						return true;
					}
					return false;
				}
			}
			
		} else {
			return come(tabuleiro,x,y,flag);
		}
		return false;
	}
	
	public boolean come(Lugar[][] tabuleiro, int x, int y,int flag) {
		if(tabuleiro[y][x].getPeca()==null && flag==1) {
			if(this.getCor() == 0) {
				if(this.getY()-1 == y && (this.getX()+1 == x || this.getX()-1 == x)) {
					return true;
				}
				
			} else {
				if(this.getY()+1 == y && (this.getX()+1 == x || this.getX()-1 == x)) {
					return true;
				}
			}
			return false;
		}
		if(tabuleiro[y][x].getPeca().getCor()!=this.getCor()) {
			if(this.getCor() == 0) {
				if(this.getY()-1 == y && (this.getX()+1 == x || this.getX()-1 == x)) {
					return true;
				}
				
			} else {
				if(this.getY()+1 == y && (this.getX()+1 == x || this.getX()-1 == x)) {
					return true;
				}
			}
		}
		return false;
	}
}
