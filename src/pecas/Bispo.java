package pecas;

import javax.swing.JLabel;

import telas.Lugar;

public class Bispo extends Objeto {
	
	public Bispo(int cor) {
		this.setNome("Bispo");
		this.setCor(cor);
	}
	
	public void movimento(Lugar[][] tabuleiro, int x, int y) {
		if(this.getCor() == 1) {
			if(this.getX()==x && this.getY()==y) {
				this.setX(x);
				this.setY(y);
			}
		} else {
			
		}
	}

	@Override
	public JLabel movimentosPossiveis() {
		// TODO Auto-generated method stub
		return null;
	}
}
