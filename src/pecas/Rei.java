package pecas;

import telas.Lugar;

public class Rei extends Objeto {
	
	private int flagMovimento;
	
	public Rei(int cor) {
		this.setNome("Rei");
		this.setCor(cor);
		this.setFlagMovimento(0);
	}
	
	public int getFlagMovimento() {
		return flagMovimento;
	}

	public void setFlagMovimento(int flag) {
		this.flagMovimento = flag;
	}
	
	void movimento(Lugar[][] tabuleiro,int jogador, int x, int y) {
		if(
			(this.getY()-1 == y || this.getY()+1 == y && this.getX() == x) || 
			(this.getY() == y && this.getX()-1 == x || this.getX()+1 == x) || 
			(this.getY()-1== y || this.getY()+1== y && this.getX()-1 == x || this.getX()+1 == x)
		  ) {
			if(!tabuleiro[y][x].getVazio()) {
				if(tabuleiro[y][x].getPeca().getCor()!=this.getCor()) {
					//tira peça q tava
				} else {
					this.setY(y);
					this.setX(x);
				}	
			}
		} 	
	}
	
	void roque() {
		
	}
}
