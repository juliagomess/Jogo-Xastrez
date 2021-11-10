package pecas;

import telas.Lugar;

public class Cavalo extends Objeto{
	
	public Cavalo(int cor) {
		this.setNome("Cavalo");
		this.setCor(cor);
	}

	void movimento(Lugar[][] tabuleiro, int jogador, int x, int y) {
		int xOffset=Math.abs(this.getX()-x);
		int yOffset=Math.abs(this.getY()-y);
		
		if((xOffset==1 && yOffset==2) || (xOffset==2 && yOffset==1) ){
		   if(!tabuleiro[x][y].getVazio()){
		   		if(tabuleiro[x][y].getPeca().getCor()!=this.getCor()){
		   			//come
		   		}	
		   }else{
			   this.setY(y);
			   this.setX(x);
		   }
		}
		
//		return false;
	}
}
