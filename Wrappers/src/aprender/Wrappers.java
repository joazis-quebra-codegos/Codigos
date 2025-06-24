package aprender;
import java.util.*;

public class Wrappers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		String numero = scan.nextLine();
		int number = Integer.parseInt(numero);
		
		if (number % 2 == 0) {
			System.out.println(number + " é par");
		}else {
			System.out.println(number + " é impar");
		}
		
		int texto = 456;
		String convert = String.valueOf(texto);
		System.out.println(convert + "7");
		
		int nomero = 3;
		double nomeroDobro = (double) nomero;
		System.out.println(nomeroDobro);
		
		double kazu = 5.9;
		long arred = Math.round(kazu);
		System.out.println(kazu);
		int kazuichi = (int) kazu;
		System.out.println(kazuichi);
		
		scan.close();
	}
}
