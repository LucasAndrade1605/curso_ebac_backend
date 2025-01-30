package tarefa_wrapper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		long primitivo = leitor.nextLong();
		
		leitor.close();
		
		Long wrapper = Long.valueOf(primitivo);
		
		System.out.println("Valor primitivo: "+primitivo
				+ "\nValor wrapper: "+wrapper);
		
		
	}

}
