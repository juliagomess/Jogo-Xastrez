package pecas;
import telas.Lugar;

public class Dama extends Objeto {

	public Dama(int cor) {
		this.setCor(cor);
		this.setCapturada(false);
	}
	
	public boolean movimento(Lugar[][] tabuleiro, int toX, int toY, int flag) {
		int xOffset=toX-this.getX();
		int yOffset=toY-this.getY();
		int dir=0;
		
		if(xOffset==0 && yOffset==0) {
			return false;
		}
		
		if((xOffset==0 && yOffset!=0) || (xOffset!=0 && yOffset==0 )) {
			if(xOffset==0){
				if(yOffset<0){
					dir=1;
				}else if(yOffset>0){
					dir=5;
				}
			}
			if(yOffset==0){
				if(xOffset>0){
					dir=3;
				}else if(xOffset<0){
					dir=7;
				}
			}
			
		} else if(Math.abs(xOffset) == Math.abs(yOffset)) {
			if(xOffset>0 && yOffset>0) {
				dir =4;
			} else if(xOffset>0 && yOffset<0) {
				dir=2;
			} else if(xOffset<0 && yOffset>0) {
				dir=6;
			}else {
				dir=8;
			}
		} else {
			return false;
		}
		
		int x=this.getX();
		int y=this.getY();
		while(!(x==toX && y==toY)){
			switch(dir){
				case 1:
					y--;
				break;
				case 3:
					x++;
				break;
				case 5:
					y++;
				break;
				case 7:
					x--;
				break;
				case 2:
					y--;
					x++;
				break;
				case 4:
					x++;
					y++;
				break;
				case 6:
					x--;
					y++;
				break;
				case 8:
					x--;
					y--;
				break;
			}
			if(!tabuleiro[y][x].getVazio()){
				break;
			}			
		}
		
		if(x==toX && y==toY){
			if(tabuleiro[y][x].getVazio()){
				return true;
			} else if(tabuleiro[y][x].getPeca().getCor()!=this.getCor() || flag==1){
				return true;
			}
		}
		return false;
	}

	
}
