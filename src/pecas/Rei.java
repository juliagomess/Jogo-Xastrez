package pecas;

import javax.swing.JLabel;

import telas.Lugar;

public class Rei extends Objeto {
	
	private int flagMovimento;
	
	public Rei(int cor) {
		this.setCor(cor);
		this.setFlagMovimento(0);
		this.setCapturada(false);
	}
	
	public int getFlagMovimento() {
		return flagMovimento;
	}

	public void setFlagMovimento(int flag) {
		this.flagMovimento = flag;
	}
	
	public boolean movimento(Lugar[][] tabuleiro, int x, int y) {
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
		return false;
	}
	
	void roque() {
		
	}

	public JLabel movimentosPossiveis() {
		// TODO Auto-generated method stub
		return null;
	}
}
