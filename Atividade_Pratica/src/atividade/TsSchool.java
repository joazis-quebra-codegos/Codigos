package atividade;
import java.util.*;

public class TsSchool {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno("", 0.0, 0.0, 0.0);
		while(true) {
			System.out.println("------MENU-----\n1 - Adicionar aluno\n2 - Verificar aluno\n3 - Sair");
			int opc = scan.nextInt();
			scan.nextLine();
			
			switch(opc) {
			case 1:
				aluno.AdicionarAluno(scan);
				break;
			case 2:
				aluno.exibir(scan);
				break;
			case 3:
				System.exit(1);
			}
		}
	}

}
