package pecas;

import telas.Lugar;

public class Bispo extends Objeto {
	
	public Bispo(int cor) {
		this.setNome("Bispo");
		this.setCor(cor);
	}
	
	void movimento(Lugar[][] tabuleiro, int jogador, int x, int y) {
		if(jogador == 1) {
			if(this.getX()==x && this.getY()==y) {
				this.setX(x);
				this.setY(y);
			}
		} else {
			
		}
	}
}
