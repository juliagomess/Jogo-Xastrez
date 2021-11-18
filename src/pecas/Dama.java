package pecas;

import javax.swing.JLabel;

import telas.Lugar;

public class Dama extends Objeto {

	public Dama(int cor) {
		this.setCor(cor);
		this.setCapturada(false);
	}
	
	public boolean movimento(Lugar[][] tabuleiro, int x, int y) {
		if(this.getCor() == 1) {
			
		} else {
			
		}
		return false;
	}

	public JLabel movimentosPossiveis() {
		// TODO Auto-generated method stub
		return null;
	}
}
