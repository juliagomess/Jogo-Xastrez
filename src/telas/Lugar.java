package telas;

public class Lugar {
	private boolean vazio;
	private int peca;
	
	public Lugar() {
		this.vazio=true;
	}
	
	public void colocaPeca(int jogador) {
		this.vazio=false;
		this.peca=jogador;
	}
	
	public boolean getVazio() {
		return this.vazio;
	}
	
	public int getPeca() {
		return this.peca;
	}
}
