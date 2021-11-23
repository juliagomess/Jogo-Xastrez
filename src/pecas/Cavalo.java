package pecas;

import telas.Lugar;

public class Cavalo extends Objeto{
	
	public Cavalo(int cor) {
		this.setCor(cor);
		this.setCapturada(false);
	}

	public boolean movimento(Lugar[][] tabuleiro, int x, int y) {
		int xOffset=Math.abs(this.getX()-x);
		int yOffset=Math.abs(this.getY()-y);
		
		if((xOffset==1 && yOffset==2) || (xOffset==2 && yOffset==1)) {
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
		   		
		   } else {
			   tabuleiro[this.getY()][this.getX()].tiraPeca();
			   this.setY(y);
			   this.setX(x);
			   tabuleiro[y][x].colocaPeca(this);
			   return true;
		   }
		}
		return false;
	}
}
