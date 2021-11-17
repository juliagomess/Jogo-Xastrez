package pecas;

import javax.swing.JLabel;

import telas.Lugar;

public class Bispo extends Objeto {
	
	public Bispo(int cor) {
		this.setNome("Bispo");
		this.setCor(cor);
		this.setCapturada(false);
	}
	
	public boolean movimento(Lugar[][] tabuleiro, int x, int y) {
		if(this.getCor() == 1) {
			if(this.getX()==x && this.getY()==y) {
				this.setX(x);
				this.setY(y);
			}
		} else {
			
		}
		return false;
	}

	@Override
	public JLabel movimentosPossiveis() {
		// TODO Auto-generated method stub
		return null;
	}
}
