package pecas;
import telas.Jogador;
import telas.Lugar;

public class Peao extends Objeto {
	
	private Jogador jogador;
	
	public Peao(int cor,Jogador j) {
		this.setCor(cor);
		this.setJogador(j);
		this.setCapturada(false);
		this.setFlagMovimento(0);
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
				if(this.getFlagMovimento()==0) {
					if((this.getY()-2 == y || this.getY()-1 == y) && this.getX() == x) {
						tabuleiro[this.getY()][this.getX()].tiraPeca();
						this.setY(y);
						tabuleiro[y][x].colocaPeca(this);
						this.setFlagMovimento(1);
						return true;
					}
					
				} else {
					if(this.getY()-1 == y && this.getX() == x) {
						tabuleiro[this.getY()][this.getX()].tiraPeca();
						this.setY(y);
						tabuleiro[y][x].colocaPeca(this);
						return true;
					}
				}
				
			} else {
				if(this.getFlagMovimento()==0) {
					if((this.getY()+2 == y || this.getY()+1 == y) && this.getX() == x) {
						tabuleiro[this.getY()][this.getX()].tiraPeca();
						this.setY(y);
						tabuleiro[y][x].colocaPeca(this); 
						this.setFlagMovimento(1);
						return true;
					}
					
				} else {
					if(this.getY()+1 == y && this.getX() == x) {
						tabuleiro[this.getY()][this.getX()].tiraPeca();
						this.setY(y);
						tabuleiro[y][x].colocaPeca(this);
						return true;
					}
					return false;
				}
			}
			
		} else {
			if(tabuleiro[y][x].getPeca().getCor()!=this.getCor()) {
				if(this.getCor() == 0) {
					if(this.getY()-1 == y && (this.getX()+1 == x || this.getX()-1 == x)) {
						tabuleiro[this.getY()][this.getX()].tiraPeca(); //tira a peça de onde tava
						tabuleiro[y][x].getPeca().setCapturada(true);
						tabuleiro[y][x].tiraPeca();
						this.setX(x); //seta nova posição
						this.setY(y);
						tabuleiro[y][x].colocaPeca(this);
						return true;
					}
					
				} else {
					if(this.getY()+1 == y && (this.getX()+1 == x || this.getX()-1 == x)) {
						tabuleiro[this.getY()][this.getX()].tiraPeca();
						tabuleiro[y][x].getPeca().setCapturada(true);
						tabuleiro[y][x].tiraPeca();
						this.setX(x);
						this.setY(y);
						tabuleiro[y][x].colocaPeca(this);
						return true;
					}
				}
			}
		}
		return false;
	}
	
//	public JLabel movimentosPossiveis() {
//		if(this.jogador.getFlagPrimJog()==0) {
//			
//			int px=this.getPosTabX(-1);
//			int py=this.getY();
//			
//			py+=2;
//			py=this.getPosTabY(py);
//			
//			JLabel p = new JLabel("AQUI");
//			p.setHorizontalAlignment(SwingConstants.CENTER);
//			p.setBounds(px, py, 80, 80);
//			p.setBorder(BorderFactory.createLineBorder(Color.RED));
//			return p;
//		}
//	}
	
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
