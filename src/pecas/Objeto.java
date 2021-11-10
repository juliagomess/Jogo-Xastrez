package pecas;

import javax.swing.JLabel;

import telas.Lugar;

public abstract class Objeto {
	private String nome;
	private int cor;
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPosTabX(int posicao) {
		if(posicao == -1)
			return 80*this.getX()+80;
		return 80*posicao+80;
	}
	
	public int getPosTabY(int posicao) {
		if(posicao == -1)
			return 802-this.getY()*80;
		return 802-posicao*80;
	}
	
	public int convertePosTabX(int posicao) {
		return (posicao-80)/80;
	}
	
	public int convertePosTabY(int posicao) {
		return (802-posicao)/80;
	}
	
	public abstract void movimento(Lugar[][] tabuleiro, int x, int y);
	
	public abstract JLabel movimentosPossiveis();
}
