package pecas;

import javax.swing.JLabel;

import telas.Lugar;

public class Torre extends Objeto {
	
	private int flagMovimento;
	
	public Torre(int cor) {
		this.setNome("Torre");
		this.setCor(cor);
		this.setFlagMovimento(0);
	}

	public int getFlagMovimento() {
		return flagMovimento;
	}

	public void setFlagMovimento(int flag) {
		this.flagMovimento = flag;
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
