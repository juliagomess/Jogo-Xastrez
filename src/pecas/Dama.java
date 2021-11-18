package pecas;

import javax.swing.JLabel;

import telas.Lugar;

public class Dama extends Objeto {

	public Dama(int cor) {
		this.setCor(cor);
		this.setCapturada(false);
	}
	
	public boolean movimento(Lugar[][] tabuleiro, int x, int y) {
		int xOffset=x-this.getX();
		int yOffset=y-this.getY();
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
		
		int j=this.getX();
		int i=this.getY();
		while(!(j==x && i==y)){
			switch(dir){
				case 1:
					i--;
				break;
				case 3:
					j++;
				break;
				case 5:
					i++;
				break;
				case 7:
					j--;
				break;
				case 2:
					i--;
					j++;
				break;
				case 4:
					j++;
					i++;
				break;
				case 6:
					j--;
					i++;
				break;
				case 8:
					j--;
					i--;
				break;
			}
			if(!tabuleiro[i][j].getVazio()){
				break;
			}			
		}
		
		if(j==x && i==y){
			if(tabuleiro[y][x].getVazio()){
				System.out.print(tabuleiro[y][x].getVazio() + "\n");
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

	public JLabel movimentosPossiveis() {
		// TODO Auto-generated method stub
		return null;
	}
}
