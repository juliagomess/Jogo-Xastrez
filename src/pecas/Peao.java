package pecas;

import telas.Lugar;

public class Peao extends Objeto {
	
	private int flagPrim;
	
	public int getFlagPrim() {
		return flagPrim;
	}

	public void setFlagPrim(int flagPrim) {
		this.flagPrim = flagPrim;
	}

	public Peao(int cor) {
		this.setNome("Peão");
		this.setCor(cor);
		this.setFlagPrim(0);
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
 
	public void movimento(Lugar[][] tabuleiro, int jogador, int x, int y) {
		if(tabuleiro[y][x].getVazio()) {
			
			if(jogador == 1) {
				if(this.getFlagPrim()==0) {
					if(this.getY()-2 == y || this.getY()-1 == y && this.getX() == x) {
						this.setY(y);
						this.setFlagPrim(1);
					}
				} else {
					if(this.getY()-1 == y && this.getX() == x) {
						this.setY(y);
					}
				}
				
			} else {
				if(this.getFlagPrim()==0) {
					if(this.getY()+2 == y || this.getY()+1 == y && this.getX() == x) {
						this.setY(y);
						this.setFlagPrim(1);
					}
				} else {
					if(this.getY()+1 == y && this.getX() == x) {
						this.setY(y);
					}
				}
			}
			
		}
	}
	
	public void comer(Lugar[][] tabuleiro, int jogador, int x, int y) {
		if(!tabuleiro[y][x].getVazio() && tabuleiro[y][x].getPeca()!=this.getCor()) {
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
}
