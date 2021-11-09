package telas;

public class Main {
	
	private static Jogador j1 = new Jogador();;
	private static Jogador j2 = new Jogador();;
	private static Lugar[][] tabuleiro = new Lugar[8][8];
	
	public static void setJogadores(String nome1, String nome2) {
		j1.setNome(nome1);
		j1.setCor(1); //preto
		
		for(int i=6;i<8;i++)
			for(int j=0;j<8;j++) 
				tabuleiro[i][j].colocaPeca(1);
		
		j2.setNome(nome2);
		j2.setCor(0); //branco
		
		for(int i=0;i<2;i++)
			for(int j=0;j<8;j++) 
				tabuleiro[i][j].colocaPeca(0);			
	}
	
	public static void printTabuleiro() {
		
	}

	public static void main(String[] args) {
		TelaInicial.main(null);
	}

}
