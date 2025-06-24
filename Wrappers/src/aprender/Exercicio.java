package aprender;
import java.util.*;

public class Exercicio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		Integer x;
		int result = 0;
		do {
			System.out.println("Digite o número para a soma[0 para acabar]");
			x = scan.nextInt();
			lista.add(x);
			result += x;
		}while(x != 0);
		
		System.out.println("Soma de todos os números colocados: " + result);
		scan.close();
	}
}
