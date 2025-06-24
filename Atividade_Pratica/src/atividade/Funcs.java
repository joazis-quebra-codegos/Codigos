package atividade;
import java.util.*;

public class Funcs{
	int contador = 0;
	public void Inserir(String alunos[], double notas[][], Scanner scan) {
		if (contador == 5) { //Reinicia tudo se a lista estiver cheia
			System.out.println("Todos os alunos registrados, deseja recomeçar");
			int opc = scan.nextInt();
			scan.nextLine();
			switch(opc) {
			case 1 :
				System.out.println("Apagando todos os alunos da lista");
				for (int i = 0; i < alunos.length; i++) {
					alunos[i] = null;
					}
				contador = 0;
				return;	
			case 2:
				return;
			}
		}
		for (int i = 0; i < 1; i++ ) {
			System.out.println("Digite o nome do aluno " + (contador + 1));
			alunos[contador] = scan.nextLine();
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Digite as duas notas do aluno: ");
				notas[contador][j] = scan.nextDouble();
				if (notas[contador][j] > 10 || notas[contador][j] < 0) {
					System.out.println("Nota inválida");
					j--;
					continue;
				}
				scan.nextLine();
			}
		}
		contador++;
	}
	
	public void calcularNotas(double notas[][], double recup[]) {
		for(int i = 0; i < notas.length; i++) {
			double media = 0;
			for (int j = 0; j < notas[i].length; j++) {
				media += notas[i][j];
			}
			media *= 0.5;
			recup[i] = media;
		}
	}
	
	public void pesquisarAluno(int aluno, String alunos[], double notas[][], double recup[]) {
		for (int i = aluno; i < (aluno + 1); aluno++ ) {
		System.out.print(notas[aluno][i] + " ");
			if (recup[i] < 4) {
				System.out.println("\nO aluno " + alunos[i] + " está reprovado com a média: " + recup[i]);
			}else if (recup[i] < 7) {
				System.out.println("\nO aluno " + alunos[i] + " está em recuperação com a média: " + recup[i]);
			}else {
					System.out.println("\nO aluno " + alunos[i] + " está passado com a média: " + recup[i]);
				
			}
		}
	}
	
	public void resultadoFinal(String alunos[], double notas[][], double recup[]) {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == null) {
				i++;
				continue;
			}
			System.out.print("Notas do aluno " + alunos[i] + ": ");
			
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
				if (j == 1) {
					if (recup[i] < 4) {
						System.out.println("\nO aluno " + alunos[i] + " está reprovado com a média: " + recup[i]);
					}else if (recup[i] < 7) {
						System.out.println("\nO aluno " + alunos[i] + " está em recuperação com a média: " + recup[i]);
					}else {
						System.out.println("\nO aluno " + alunos[i] + " está passado com a média: " + recup[i]);
					}
				}
			}
			System.out.print("\n");
		}
		
	}
}
