package telas;

public class Main {
	
	private static Jogador j1 = new Jogador(1); //preto
	private static Jogador j2 = new Jogador(0); //branco
//	private static Lugar[][] tabuleiro = new Lugar[8][8];
	
	public static void setJogadores(String nome1, String nome2) {
		j1.setNome(nome1);
		j2.setNome(nome2);
		
//		for(int i=0;i<8;i++)
//			for(int j=0;j<8;j++)
//				tabuleiro[i][j]=new Lugar();
			
//		for(int i=0;i<16;i++) {
//			Objeto peca=j1.getPecas().get(i);
//			if(peca!=null) {
//				Lugar l=tabuleiro[peca.getX()][peca.getY()];
//				l.colocaPeca(peca);
//			}
//		}
		
//		for(int i=0;i<16;i++) {
//			Objeto peca=j2.getPecas().get(i);
//			if(peca!=null) {
//				Lugar l=tabuleiro[peca.getX()][peca.getY()];
//				l.colocaPeca(peca);
//			}
//		}			
	}
	
	public static int getX(int cor,int index) {
		if(cor==1) {
			return j1.getPecas().get(index).getX();
		} else {
			return j2.getPecas().get(index).getX();
		}
	}
	
	public static int getY(int cor,int index) {
		if(cor==1) {
			return j1.getPecas().get(index).getY();
		} else {
			return j2.getPecas().get(index).getY();
		}
	}

	public static void main(String[] args) {
		TelaInicial.main(null);
	}

}
