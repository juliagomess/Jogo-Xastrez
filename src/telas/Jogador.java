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
	private ArrayList<Objeto> pecas = new ArrayList<Objeto>();

	public Jogador(int cor) {
		this.cor=cor;
		
		for(int i=0;i<8;i++) {
			Peao peao = new Peao(cor,this);
			peao.setX(i);
			if(cor==0) {
				peao.setY(6);
				peao.setNome("pb"+(i+1));
			} else {
				peao.setY(1);
				peao.setNome("pp"+(i+1));
			}
			this.pecas.add(peao);
		}
		
		for(int i=0;i<2;i++) {
			Torre torre = new Torre(cor);
			if(i==0) {
				torre.setX(0);
				if(cor==0) {
					torre.setY(7);
					torre.setNome("tb"+(i+1));
				} else {
					torre.setY(0);
					torre.setNome("tp"+(i+1));
				}
				
			} else {
				torre.setX(7);
				if(cor==0) {
					torre.setY(7);
					torre.setNome("tb"+(i+1));
				} else {
					torre.setY(0);
					torre.setNome("tp"+(i+1));
				}
			}
			this.pecas.add(torre);
		}
		
		for(int i=0;i<2;i++) {
			Cavalo cavalo = new Cavalo(cor);
			if(i==0) {
				cavalo.setX(1);
				if(cor==0) {
					cavalo.setY(7);
					cavalo.setNome("cb"+(i+1));
				} else {
					cavalo.setY(0);
					cavalo.setNome("cp"+(i+1));
				}
				
			} else {
				cavalo.setX(6);
				if(cor==0) {
					cavalo.setY(7);
					cavalo.setNome("cb"+(i+1));
				} else {
					cavalo.setY(0);
					cavalo.setNome("cp"+(i+1));
				}
			}
			this.pecas.add(cavalo);
		}
		
		for(int i=0;i<2;i++) {
			Bispo bispo = new Bispo(cor);
			if(i==0) {
				bispo.setX(2);
				if(cor==0) {
					bispo.setY(7);
					bispo.setNome("bb"+(i+1));
				} else {
					bispo.setY(0);
					bispo.setNome("bp"+(i+1));
				}
				
			} else {
				bispo.setX(5);
				if(cor==0) {
					bispo.setY(7);
					bispo.setNome("bb"+(i+1));
				} else {
					bispo.setY(0);
					bispo.setNome("bp"+(i+1));
				}
			}
			this.pecas.add(bispo);
		}
		
		Dama dama = new Dama(cor);
		dama.setX(3);
		if(cor==0) {
			dama.setY(7);
			dama.setNome("db");
		} else {
			dama.setY(0);
			dama.setNome("dp");
		}
		this.pecas.add(dama);
		
		Rei rei = new Rei(cor);
		rei.setX(4);
		if(cor==0) {
			rei.setY(7);
			rei.setNome("rb");
		} else {
			rei.setY(0);
			rei.setNome("rp");
		}
		this.pecas.add(rei);
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
	
	public ArrayList<Objeto> getPecas() {
		return this.pecas;
	}
}
