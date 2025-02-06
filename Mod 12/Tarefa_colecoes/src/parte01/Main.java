package parte01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] listaNomes = solicitaNome();
		System.out.println("Lista normal: "+Arrays.toString(listaNomes));
		
		Arrays.sort(listaNomes);
		System.out.println("Lista ordenada: "+Arrays.toString(listaNomes));

	}
	
	public static String[] solicitaNome() {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o nome separados por virgula (ex: João,Maria):");
	    String entrada = leitor.nextLine();
	        
		return entrada.split(",");
		
	}

}
