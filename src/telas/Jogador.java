package telas;
import java.util.ArrayList;
import pecas.Bispo;
import pecas.Cavalo;
import pecas.Dama;
import pecas.Objeto;
import pecas.Peao;
import pecas.Rei;
import pecas.Torre;

public class Jogador {
	
	private String nome;
	private int cor;
	private int flagPrimJog;	
	private ArrayList<Objeto> pecas = new ArrayList<Objeto>();
	
	public Jogador(int cor) {
		this.cor=cor;
		this.setFlagPrimJog(0);
		
		for(int i=0;i<8;i++) {
			Peao peao = new Peao(cor,this);
			peao.setX(i);
			if(cor==1) {
				peao.setY(1);
			} else {
				peao.setY(6);
			}
			this.pecas.add(peao);
		}
		
		for(int i=0;i<2;i++) {
			Torre torre = new Torre(cor);
			if(i==0) {
				torre.setX(0);
				if(cor==1) {
					torre.setY(0);
				} else {
					torre.setY(7);
				}
				
			} else {
				torre.setX(7);
				if(cor==1) {
					torre.setY(0);
				} else {
					torre.setY(7);
				}
			}
			this.pecas.add(torre);
		}
		
		for(int i=0;i<2;i++) {
			Cavalo cavalo = new Cavalo(cor);
			if(i==0) {
				cavalo.setX(1);
				if(cor==1) {
					cavalo.setY(0);
				} else {
					cavalo.setY(7);
				}
				
			} else {
				cavalo.setX(6);
				if(cor==1) {
					cavalo.setY(0);
				} else {
					cavalo.setY(7);
				}
			}
			this.pecas.add(cavalo);
		}
		
		for(int i=0;i<2;i++) {
			Bispo bispo = new Bispo(cor);
			if(i==0) {
				bispo.setX(2);
				if(cor==1) {
					bispo.setY(0);
				} else {
					bispo.setY(7);
				}
				
			} else {
				bispo.setX(5);
				if(cor==1) {
					bispo.setY(0);
				} else {
					bispo.setY(7);
				}
			}
			this.pecas.add(bispo);
		}
		
		Dama dama = new Dama(cor);
		dama.setX(3);
		if(cor==1) {
			dama.setY(0);
		} else {
			dama.setY(7);
		}
		this.pecas.add(dama);
		
		Rei rei = new Rei(cor);
		rei.setX(4);
		if(cor==1) {
			rei.setY(0);
		} else {
			rei.setY(7);
		}
		this.pecas.add(rei);
	}
	
	public int getFlagPrimJog() {
		return flagPrimJog;
	}

	public void setFlagPrimJog(int flagPrim) {
		this.flagPrimJog = flagPrim;
	}
	
	public int getCor() {
		return cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Objeto> getPecas(){
		return this.pecas;
	}
}
