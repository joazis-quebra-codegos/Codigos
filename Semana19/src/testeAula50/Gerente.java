package testeAula50;
import Aula50.Funcionario;

public class Gerente extends Funcionario {
	
		public Gerente(String nome, String cargo, String setor, double salario) {
			super(nome, cargo, setor, salario);
		}
	
		public void mostrarDados() {
			System.out.println("Nome:" + nome +  "\nCargo: " + cargo + "\nSetor: " + setor + "\nSalário: " + salario);
		}


}
