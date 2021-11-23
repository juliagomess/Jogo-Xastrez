package pecas;

import telas.Lugar;
import telas.Main;

public class Rei extends Objeto {
	
	public Rei(int cor) {
		this.setCor(cor);
		this.setFlagMovimento(0);
		this.setCapturada(false);
	}
	
	public boolean movimento(Lugar[][] tabuleiro, int x, int y, int flag) {
		int xOffset=Math.abs(this.getX()-x);
		int yOffset=Math.abs(this.getY()-y);
		
		if(xOffset==0 && yOffset==0) {
			return false;
		}
		if(xOffset>1 || yOffset>1) {
		    return this.roque(tabuleiro, x, y);
		}
		if(!tabuleiro[y][x].getVazio()) {
			if(tabuleiro[y][x].getPeca().getCor()!=this.getCor()) {
				return true;
			}
			return false;
		} else if (!Main.xeque(this.getCor(),x,y)) {
			return true;
		}
		return false;
	}
	
	public boolean roque(Lugar[][] tabuleiro, int x, int y) {
		if(this.getFlagMovimento()==1) {
			return false;
		}
		if(y!=this.getY()) {
			return false;
		}
		
		String nome;
		if(this.getCor()==0) {
			nome = "tb";
		} else {
			nome = "tp";
		}
		
		int xOffset = x-this.getX();
		int i;
		if(xOffset>0) {
			if(tabuleiro[this.getY()][this.getX()+3].getPeca().getNome().equals(nome + '2')) {
				if(tabuleiro[this.getY()][this.getX()+3].getPeca().getFlagMovimento()==1) {
					return false;
				}
			} else {
				return false;
			}
			
			for(i=this.getX()+1;tabuleiro[this.getY()][i].getPeca()==null;i++);
			if(tabuleiro[this.getY()][i].getPeca().getNome().equals(nome + '2')) {
				tabuleiro[this.getY()][this.getX()].tiraPeca();
				this.setX(x);
				tabuleiro[y][x].colocaPeca(this);
				
				tabuleiro[this.getY()][x+1].getPeca().setX(x-1);
				tabuleiro[y][x-1].colocaPeca(tabuleiro[this.getY()][x+1].getPeca());
				tabuleiro[this.getY()][x+1].tiraPeca();
				
				this.setFlagMovimento(1);
				return true;
			}
			
		} else {
			if(tabuleiro[this.getY()][this.getX()-4].getPeca().getNome().equals(nome + '1')) {
				if(tabuleiro[this.getY()][this.getX()-4].getPeca().getFlagMovimento()==1) {
					return false;
				}
			} else {
				return false;
			}
			
			for(i=this.getX()-1;tabuleiro[this.getY()][i].getPeca()==null;i--);
			if(tabuleiro[this.getY()][i].getPeca().getNome().equals(nome + '1')) {
				tabuleiro[this.getY()][this.getX()].tiraPeca();
				this.setX(x);
				tabuleiro[y][x].colocaPeca(this);
				
				tabuleiro[this.getY()][x-2].getPeca().setX(x+1);
				tabuleiro[y][x+1].colocaPeca(tabuleiro[this.getY()][x-2].getPeca());
				tabuleiro[this.getY()][x-2].tiraPeca();
				
				this.setFlagMovimento(1);
				return true;
			}
		}		
		return false;
	}
}
