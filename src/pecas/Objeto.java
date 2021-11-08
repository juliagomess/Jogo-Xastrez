package pecas;

public abstract class Objeto {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	abstract void movimento(int jogador);
	
	abstract void comer(int jogador);
}
