package pecas;
import java.util.ArrayList;

import javax.swing.JLabel;

import telas.Lugar;

public abstract class Objeto {
	private String nome;
	private int cor;
	private int x;
	private int y;
	private int oldX;
	private int oldY;
	private boolean capturada;
	private int flagMovimento;
	private Objeto peca;
	private ArrayList<JLabel> possibilidade = new ArrayList<JLabel>();
	
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
	
	public boolean isCapturada() {
		return capturada;
	}

	public void setCapturada(boolean capturada) {
		this.capturada = capturada;
	}
	
	public int getFlagMovimento() {
		return flagMovimento;
	}

	public void setFlagMovimento(int flagMovimento) {
		this.flagMovimento = flagMovimento;
	}
	
	public ArrayList<JLabel> getPossibilidade() {
		return possibilidade;
	}
	
	public void setPossibilidade(JLabel p) {
		this.possibilidade.add(p);
	}
	
	public int getPosTabX(int posicao) {
		if(posicao == -1)
			return 80*this.getX()+80;
		return 80*posicao+80;
	}
	
	public int getPosTabY(int posicao) {
		if(posicao == -1)
			return 242+this.getY()*80;
		return 242+posicao*80;
	}
	
	public int convertePosTabX(int posicao) {
		return (posicao-80)/80;
	}
	
	public int convertePosTabY(int posicao) {
		return (posicao+242)/80;
	}
	
	public abstract boolean movimento(Lugar[][] tabuleiro, int x, int y, int flag);
	
	public void move(Lugar[][] tabuleiro, int x, int y) {
		tabuleiro[this.getY()][this.getX()].tiraPeca();
		oldX=this.getX();
		oldY=this.getY();
		this.setX(x);
		this.setY(y);
		tabuleiro[y][x].colocaPeca(this); 
	}
	
	public void volta(Lugar[][] tabuleiro, int flag) {
		tabuleiro[this.getY()][this.getX()].tiraPeca();
		this.setX(oldX);
		this.setY(oldY);
		tabuleiro[oldY][oldX].colocaPeca(this); 
		if(flag==1) {
			tabuleiro[this.peca.getY()][this.peca.getX()].colocaPeca(peca);
			tabuleiro[this.peca.getY()][this.peca.getX()].getPeca().setCapturada(false);
		}
	}
	
	public void captura(Lugar[][] tabuleiro, int x, int y) {
		tabuleiro[this.getY()][this.getX()].tiraPeca(); 
		tabuleiro[y][x].getPeca().setCapturada(true);
		this.peca=tabuleiro[y][x].getPeca();
		tabuleiro[y][x].tiraPeca();
		oldX=this.getX();
		oldY=this.getY();
		this.setX(x);
		this.setY(y);
		tabuleiro[y][x].colocaPeca(this);
	}
}
