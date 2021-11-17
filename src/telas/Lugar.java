package telas;
import pecas.Objeto;

public class Lugar {
	private boolean vazio;
	private Objeto peca;
	
	public Lugar() {
		this.vazio=true;
	}
	
	public void colocaPeca(Objeto peca) {
		this.vazio=false;
		this.peca=peca;
	}
	
	public boolean getVazio() {
		return this.vazio;
	}
	
	public Objeto getPeca() {
		return this.peca;
	}
}
