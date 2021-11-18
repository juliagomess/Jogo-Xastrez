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
		int xOffset=Math.abs(this.getX()-x);
		int yOffset=Math.abs(this.getY()-y);
		
		if(xOffset==0 && yOffset==0) {
			return false;
		}
		if(xOffset>1 || yOffset>1) {
		    return false;
		}
		if(!tabuleiro[y][x].getVazio()) {
			if(tabuleiro[y][x].getPeca().getCor()!=this.getCor()) {
				tabuleiro[this.getY()][this.getX()].tiraPeca();
	   			tabuleiro[y][x].getPeca().setCapturada(true);
	   			tabuleiro[y][x].tiraPeca();
	   			this.setX(x);
				this.setY(y);
				tabuleiro[y][x].colocaPeca(this);
				return true;
			}
			return false;
		} else {
			tabuleiro[this.getY()][this.getX()].tiraPeca();
			this.setY(y);
			this.setX(x);
			tabuleiro[y][x].colocaPeca(this);
			return true;
		}
	}
	
	void roque() {
		
	}

	public JLabel movimentosPossiveis() {
		// TODO Auto-generated method stub
		return null;
	}
}
