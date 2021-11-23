package pecas;

import telas.Lugar;

public class Bispo extends Objeto {
	
	public Bispo(int cor) {
		this.setNome("Bispo");
		this.setCor(cor);
		this.setCapturada(false);
	}
	
	public boolean movimento(Lugar[][] tabuleiro, int toX, int toY) {
		int xOffset=toX-this.getX();
		int yOffset=toY-this.getY();
		int dir=0;
		
		if((Math.abs(xOffset)!=Math.abs(yOffset)) || (xOffset==0 && yOffset==0)) {
			return false;
		}
		
		if(xOffset>0 && yOffset>0 ) {
			dir =1;
		}else if(xOffset>0 && yOffset<0) {
			dir=4;
		}else if(xOffset<0 && yOffset>0) {
			dir=2;
		}else {
			dir=3;
		}
		
		int x=this.getX();
		int y=this.getY();
		while(!(x==toX && y==toY)){
			switch(dir){
				case 1:
					y++;
					x++;
				break;
				case 2:
					x--;
					y++;
				break;
				case 3:
					x--;
					y--;
				break;
				case 4:
					x++;
					y--;
				break;
			}
			if(!tabuleiro[y][x].getVazio()){
				break;
			}			
		}
		
		if(x==toX && y==toY){
			if(tabuleiro[y][x].getVazio()){
				tabuleiro[this.getY()][this.getX()].tiraPeca();
				this.setY(y);
				this.setX(x);
				tabuleiro[y][x].colocaPeca(this);
				return true;
			}

			if(tabuleiro[y][x].getPeca().getCor()!=this.getCor()){
				tabuleiro[this.getY()][this.getX()].tiraPeca();
	   			tabuleiro[y][x].getPeca().setCapturada(true);
	   			tabuleiro[y][x].tiraPeca();
	   			this.setX(x);
				this.setY(y);
				tabuleiro[y][x].colocaPeca(this);
				return true;
			}
		}
		return false;
	}
}
