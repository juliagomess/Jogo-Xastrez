package pecas;

import telas.Lugar;

public class Torre extends Objeto {
	
	private int flagMovimento;
	
	public Torre(int cor) {
		this.setNome("Torre");
		this.setCor(cor);
	}

	public int getFlagMovimento() {
		return flagMovimento;
	}

	public void setFlagMovimento(int flag) {
		this.flagMovimento = flag;
	}

	void movimento(Lugar[][] tabuleiro, int jogador, int x, int y) {
		if(jogador == 1) {
			
		} else {
			
		}
	}
}
