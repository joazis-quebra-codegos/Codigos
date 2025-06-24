package Aula50;

public class Funcionario {
	public String nome; //qualquer lugar
	public String cargo; //mesmo pacote e subclasses
	public String setor; //mesmo pacote
	protected double salario; //apenas essa classe
	
	public Funcionario(String nome, String cargo, String setor, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.setor = setor;
		this.salario = salario;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome + "\nCargo: " + cargo + "\nSetor: " + setor + "\nSalário: " + salario);
	}
}
