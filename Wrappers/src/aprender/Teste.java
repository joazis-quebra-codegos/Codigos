package aprender;

public class Teste {
	private String nome;
	int idade;
	
	public Teste(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Pessoa: " + nome + "\nIdade: " + idade;
	}

}
