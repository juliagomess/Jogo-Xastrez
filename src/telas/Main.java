package telas;
import javax.swing.JLabel;
import pecas.Objeto;

public class Main {
	
	private static Jogador j1 = new Jogador(0); //branco
	private static Jogador j2 = new Jogador(1); //preto
	private static Lugar[][] tabuleiro = new Lugar[8][8];
	
	public static void setJogadores(String nome1, String nome2) {
		j1.setNome(nome1);
		j2.setNome(nome2); 
		
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				tabuleiro[i][j]=new Lugar();
			
		for(int i=0;i<16;i++) {
			Objeto peca=j1.getPecas().get(i);
			if(peca!=null) {
				tabuleiro[peca.getY()][peca.getX()].colocaPeca(peca);
			}
		}
		
		for(int i=0;i<16;i++) {
			Objeto peca=j2.getPecas().get(i);
			if(peca!=null) {
				tabuleiro[peca.getY()][peca.getX()].colocaPeca(peca);
			}
		}		
	}
	
//	public static JLabel possibilidades(int index) {
//		return j1.getPecas().get(index).movimentosPossiveis();
//	}
	
	public static int getX(int cor,int index) {
		if(cor==0) {
			return j1.getPecas().get(index).getPosTabX(-1);
		} else {
			return j2.getPecas().get(index).getPosTabX(-1);
		}
	}
	
	public static int getY(int cor,int index) {
		if(cor==0) {
			return j1.getPecas().get(index).getPosTabY(-1);
		} else {
			return j2.getPecas().get(index).getPosTabY(-1);
		}
	}
	
	public static boolean movimentoPeca(int cor,int x, int y) {
		if(cor==0) {
			return j1.movePeca(tabuleiro, x, y);
		} else {
			return j2.movePeca(tabuleiro, x, y);
		}
	}
	
	public static boolean validaPeca(int cor, int x, int y) {
		if(cor==0) {
			return j1.procuraPeca(x, y);
		} else {
			return j2.procuraPeca(x, y);
		}
	}
	
	public static boolean pecaCapturada(String nome) {
		for(Objeto p : j1.getPecas()) {
			if(p.isCapturada() && nome.equals(p.getNome()))
				return true;
		}
		for(Objeto p : j2.getPecas()) {
			if(p.isCapturada() && nome.equals(p.getNome()))
				return true;
		}
		return false;
	}
	
	public static boolean vencedor() {
		return false;
	}

	public static void main(String[] args) {
		TelaInicial.main(null);	
	}

}
