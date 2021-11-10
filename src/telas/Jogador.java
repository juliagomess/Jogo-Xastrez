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
		
		int oito=80;
		for(int i=0;i<8;i++) {
			Peao peao = new Peao(cor,this);
			peao.setX(oito);
			if(cor==1) {
				peao.setY(722);
			} else {
				peao.setY(322);
			}
			this.pecas.add(peao);
			oito += 80;
		}
		
		for(int i=0;i<2;i++) {
			Torre torre = new Torre(cor);
			if(i==0) {
				torre.setX(80);
				if(cor==1) {
					torre.setY(802);
				} else {
					torre.setY(242);
				}
				
			} else {
				torre.setX(640);
				if(cor==1) {
					torre.setY(802);
				} else {
					torre.setY(242);
				}
			}
			this.pecas.add(torre);
		}
		
		for(int i=0;i<2;i++) {
			Cavalo cavalo = new Cavalo(cor);
			if(i==0) {
				cavalo.setX(160);
				if(cor==1) {
					cavalo.setY(802);
				} else {
					cavalo.setY(242);
				}
				
			} else {
				cavalo.setX(560);
				if(cor==1) {
					cavalo.setY(802);
				} else {
					cavalo.setY(242);
				}
			}
			this.pecas.add(cavalo);
		}
		
		for(int i=0;i<2;i++) {
			Bispo bispo = new Bispo(cor);
			if(i==0) {
				bispo.setX(240);
				if(cor==1) {
					bispo.setY(802);
				} else {
					bispo.setY(242);
				}
				
			} else {
				bispo.setX(480);
				if(cor==1) {
					bispo.setY(802);
				} else {
					bispo.setY(242);
				}
			}
			this.pecas.add(bispo);
		}
		
		Dama dama = new Dama(cor);
		dama.setX(320);
		if(cor==1) {
			dama.setY(802);
		} else {
			dama.setY(242);
		}
		this.pecas.add(dama);
		
		Rei rei = new Rei(cor);
		rei.setX(400);
		if(cor==1) {
			rei.setY(802);
		} else {
			rei.setY(242);
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
