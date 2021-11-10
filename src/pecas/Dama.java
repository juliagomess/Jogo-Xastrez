package pecas;

import javax.swing.JLabel;

import telas.Lugar;

public class Dama extends Objeto {

	public Dama(int cor) {
		this.setNome("Dama");
		this.setCor(cor);
	}
	
	public void movimento(Lugar[][] tabuleiro, int x, int y) {
		if(this.getCor() == 1) {
			
		} else {
			
		}
	}

	@Override
	public JLabel movimentosPossiveis() {
		// TODO Auto-generated method stub
		return null;
	}
}
