package atividade;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Funcs func = new Funcs();
		
		Scanner scan = new Scanner(System.in);
		String alunos[] = new String[5];
		double recup[] = new double[5];
		double notas[][] = new double[5][2];
		
		while(true) {
		System.out.println("-----MENU-----\n1- Registrar notas\n2- Ver resultados\n3- Pesquisar aluno\n4- Sair do programa");
		int opc = scan.nextInt();
		scan.nextLine();
		switch(opc) {
		
		case 1:
			func.Inserir(alunos, notas, scan);
			func.calcularNotas(notas, recup);
			break;
			
		case 2:	
			func.resultadoFinal(alunos, notas, recup);
			break;
			
		case 3:
			System.out.println("Qual aluno deseja ver?");
			int aluno = scan.nextInt();
			scan.nextLine();
			func.pesquisarAluno(aluno, alunos, notas, recup);
			break;
			
		case 4:
			System.out.println("Saindo do programa");
			System.exit(1);
			
		default:
			System.out.println("Opção inválida");
			}
		}
	}
}
