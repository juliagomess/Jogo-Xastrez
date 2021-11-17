package pecas;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import telas.Jogador;
import telas.Lugar;

public class Peao extends Objeto {
	
	private Jogador jogador;

	public Peao(int cor,Jogador j) {
		this.setNome("Peão");
		this.setCor(cor);
		this.setJogador(j);
		this.setCapturada(false);
	}
	
	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
 
	public boolean movimento(Lugar[][] tabuleiro, int x, int y) {
		if(tabuleiro[y][x].getVazio()) {
			if(this.getCor() == 0) {
				if(this.jogador.getFlagPrimJog()==0) {
					if((this.getY()-2 == y || this.getY()-1 == y) && this.getX() == x) {
						this.setY(y);
						this.jogador.setFlagPrimJog(1);
						return true;
					}
					return false;
				} else {
					if(this.getY()-1 == y && this.getX() == x) {
						this.setY(y);
						return true;
					}
					return false;
				}
				
			} else {
				if(this.jogador.getFlagPrimJog()==0) {
					if((this.getY()+2 == y || this.getY()+1 == y) && this.getX() == x) {
						this.setY(y);
						this.jogador.setFlagPrimJog(1);
						return true;
					}
					return false;
				} else {
					if(this.getY()+1 == y && this.getX() == x) {
						this.setY(y);
						return true;
					}
					return false;
				}
			}
			
		}
		return false;
	}
	
	public JLabel movimentosPossiveis() {
//		if(this.jogador.getFlagPrimJog()==0) {
			
			int px=this.getPosTabX(-1);
			int py=this.getY();
			
			py+=2;
			py=this.getPosTabY(py);
			
			JLabel p = new JLabel("AQUI");
			p.setHorizontalAlignment(SwingConstants.CENTER);
			p.setBounds(px, py, 80, 80);
			p.setBorder(BorderFactory.createLineBorder(Color.RED));
			return p;
//		}
	}
	
	public void captura(Lugar[][] tabuleiro, int jogador, int x, int y) {
		if(!tabuleiro[y][x].getVazio() && tabuleiro[y][x].getPeca().getCor()!=this.getCor()) {
			if(jogador == 1) {
				if(this.getY()-1 == y && this.getX()+1 == x || this.getX()-1 == x) {
					this.setX(x);
					this.setY(y);
				}
			} else {
				if(this.getY()+1 == y && this.getX()+1 == x || this.getX()-1 == x) {
					this.setX(x);
					this.setY(y);
				}
			}
		}
	}
	
	public void transforma(int jogador, int x, int y) {
		if(jogador == 1) {
			if(y==7) {
				//transforma
			}
		} else {
			if(y==0) {
				//transforma
			}
		}
	}
}
