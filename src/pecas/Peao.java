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

	public boolean movimento(Lugar[][] tabuleiro, int x, int y, int flag) {
		if(tabuleiro[y][x].getVazio() && flag==0) {
			if(this.getCor() == 0) {
				if(this.getFlagMovimento()==0) {
					if((this.getY()-2 == y || this.getY()-1 == y) && this.getX() == x) {
						return true;
					}
					
				} else {
					if(this.getY()-1 == y && this.getX() == x) {
						return true;
					}
				}
				
			} else {
				if(this.getFlagMovimento()==0) {
					if((this.getY()+2 == y || this.getY()+1 == y) && this.getX() == x) {
						return true;
					}
					
				} else {
					if(this.getY()+1 == y && this.getX() == x) {
						return true;
					}
					return false;
				}
			}
			
		} else {
			return come(tabuleiro,x,y,flag);
		}
		return false;
	}
	
	public boolean come(Lugar[][] tabuleiro, int x, int y,int flag) {
		if(tabuleiro[y][x].getPeca()==null && flag==1) {
			if(this.getCor() == 0) {
				if(this.getY()-1 == y && (this.getX()+1 == x || this.getX()-1 == x)) {
					return true;
				}
				
			} else {
				if(this.getY()+1 == y && (this.getX()+1 == x || this.getX()-1 == x)) {
					return true;
				}
			}
			return false;
		}
		if(tabuleiro[y][x].getPeca().getCor()!=this.getCor()) {
			if(this.getCor() == 0) {
				if(this.getY()-1 == y && (this.getX()+1 == x || this.getX()-1 == x)) {
					return true;
				}
				
			} else {
				if(this.getY()+1 == y && (this.getX()+1 == x || this.getX()-1 == x)) {
					return true;
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
