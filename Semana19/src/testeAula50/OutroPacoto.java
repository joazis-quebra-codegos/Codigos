package testeAula50;
import Aula50.Funcionario;

public class OutroPacoto {

	public static void main(String[] args) {
		Gerente g = new Gerente("Juan", "cavalo", "2", 0.0);
		Funcionario f = new Funcionario("José", "Suporte", "TI", 1.0);
		System.out.println("Funcionário:");
		f.mostrarDados();
		System.out.println("\nGerente: ");
		g.mostrarDados();

	}

}
