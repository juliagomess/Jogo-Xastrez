package pecas;

import telas.Lugar;

public class Torre extends Objeto {
	
	public Torre(int cor) {
		this.setCor(cor);
		this.setFlagMovimento(0);
		this.setCapturada(false);
	}

	public boolean movimento(Lugar[][] tabuleiro, int toX, int toY) {
		int xOffset=this.getX()-toX;
		int yOffset=this.getY()-toY;
		int dir=0;
		
		if((xOffset!=0 && yOffset!=0)|| (xOffset==0 && yOffset==0)) {
			return false;
		}
		
		if(xOffset==0) {
			if(yOffset>0) {
				dir=1;
			}else if(yOffset<0) {
				dir=3;
			}
		}
		
		if(yOffset==0) {
			if(xOffset>0) {
				dir=4;
			}else if(xOffset<0) {
				dir=2;
			}
		}
		
		int x=this.getX();
		int y=this.getY();
		while(!(x==toX && y==toY)) {
			switch(dir){
				case 1:
					y--;
				break;
				case 2:
					x++;
				break;
				case 3:
					y++;
				break;
				case 4:
					x--;
				break;
			}
			if(!tabuleiro[y][x].getVazio()) {
				break;
			}			
		}
		
		if(x==toX && y==toY){
			if(tabuleiro[y][x].getVazio()) {
				tabuleiro[this.getY()][this.getX()].tiraPeca();
				this.setY(y);
				this.setX(x);
				tabuleiro[y][x].colocaPeca(this);
				this.setFlagMovimento(1);
				return true;
			}

			if(tabuleiro[y][x].getPeca().getCor()!=this.getCor()) {
				tabuleiro[this.getY()][this.getX()].tiraPeca();
	   			tabuleiro[y][x].getPeca().setCapturada(true);
	   			tabuleiro[y][x].tiraPeca();
	   			this.setX(x);
				this.setY(y);
				tabuleiro[y][x].colocaPeca(this);
				this.setFlagMovimento(1);
				return true;
			}
		}
		return false;
	}

}
