package atividade;
import java.util.*;

public class Aluno {
	String nome;
	double nota1;
	double nota2;
	double media;
	ArrayList<Aluno> alunos  = new ArrayList<Aluno>();
	
	public Aluno(String nome, double nota1, double nota2, double media) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}
	
	public double calcularMedia(double nota1, double nota2) {
		return (nota1 + nota2)/2;
	}
	
	public void AdicionarAluno(Scanner scan) {
		if (alunos.size() > 4) {
			System.out.print("Máximo de alunos cadastrados, deseja apagar a lista? [S/N]");
			String apg = scan.nextLine();
			if (apg.equalsIgnoreCase("S")) {
				System.out.println("Lista apagada");
				alunos.clear();
				return;
			}else {
				return;
			}
		}
		while(true) {
			System.out.println("Digite o nome do aluno");
		nome = scan.nextLine();
		System.out.println("Digite a primeira nota");
		nota1 = scan.nextDouble();
		if (nota1 > 10 || nota1 < 0) {
			System.out.println("Nota inválida");
			continue;
		}
		System.out.println("Digite a segunda nota");
		nota2 = scan.nextDouble();
		if (nota2 > 10 || nota2 < 0) {
			System.out.println("Nota inválida");
			continue;
		}
		media = calcularMedia(nota1, nota2);
		
		Aluno aluno = new Aluno(nome, nota1, nota2, media);
		alunos.add(aluno);
		System.out.println("Aluno cadastrado");
		return;
		}
		
	}
	
	public void exibir(Scanner scan) {
		System.out.println("Escolha um dos alunos cadastrados para visualizar");
		System.out.println("Alunos cadastrados:");
		
		int i = 1;
		for (Aluno a : alunos) {
			Aluno aluno = a;
			System.out.println("Aluno: " + i + ": " + aluno.nome);
			i++;
		}
		int opc = scan.nextInt();
		if (opc > alunos.size() || opc < 1) {
			System.out.println("Aluno inválido");
			return;
		}
		
		Aluno aluno = alunos.get(opc - 1);
	    System.out.println("Nome: " + aluno.nome);
	    System.out.println("Notas: " + aluno.nota1 + " " + aluno.nota2);	
	    
	    System.out.println("Média final: " + aluno.media);
	    System.out.println(verificarSituacao(opc));
	}
	
	public String verificarSituacao(int opc) {
		Aluno aluno = alunos.get(opc - 1);
		if(aluno.media >= 7) {
			return "Aluno está aprovado";
		}
		else if(aluno.media >= 4) {
			return "Aluno está de recuperação";
		}
		else {
			return "Aluno está reprovado";
		}
	}
}
