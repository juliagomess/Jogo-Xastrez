package pecas;
import telas.Jogador;
import telas.Lugar;

public class Peao extends Objeto {
	
	private Jogador jogador;

	public Peao(int cor,Jogador j) {
		this.setNome("Peão");
		this.setCor(cor);
		this.setJogador(j);
	}
	
	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
 
	public void movimento(Lugar[][] tabuleiro, int jogador, int x, int y) {
		if(tabuleiro[y][x].getVazio()) {
			
			if(jogador == 1) {
				if(this.jogador.getFlagPrimJog()==0) {
					if(this.getY()-2 == y || this.getY()-1 == y && this.getX() == x) {
						this.setY(y);
						this.jogador.setFlagPrimJog(1);
					}
				} else {
					if(this.getY()-1 == y && this.getX() == x) {
						this.setY(y);
					}
				}
				
			} else {
				if(this.jogador.getFlagPrimJog()==0) {
					if(this.getY()+2 == y || this.getY()+1 == y && this.getX() == x) {
						this.setY(y);
						this.jogador.setFlagPrimJog(1);
					}
				} else {
					if(this.getY()+1 == y && this.getX() == x) {
						this.setY(y);
					}
				}
			}
			
		}
	}
	
	public void captura(Lugar[][] tabuleiro, int jogador, int x, int y) {
		if(!tabuleiro[y][x].getVazio() && tabuleiro[y][x].getPeca().getCor()!=this.getCor()) {
			if(jogador == 1) {
				if(this.getY()-1 == y && this.getX()+1 == x || this.getX()-1 == x) {
					this.setX(x);
					this.setY(y);
				}
			} else {
				if(this.getY()+1 == y && this.getX()+1 == x || this.getX()-1 == x) {
					this.setX(x);
					this.setY(y);
				}
			}
		}
	}
	
	public void transforma(int jogador, int x, int y) {
		if(jogador == 1) {
			if(y==7) {
				//transforma
			}
		} else {
			if(y==0) {
				//transforma
			}
		}
	}
}
