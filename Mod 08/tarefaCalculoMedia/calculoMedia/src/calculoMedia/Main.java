package calculoMedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int notasTemp[] = new int[4];
		
		for(int cont=0; cont<4; cont++) {
			System.out.println("Informe a nota "+cont+": ");
			
			notasTemp[cont] = leitor.nextInt();
		}

		Notas notas = new Notas(notasTemp);
		System.out.println("A media das notas eh: "+notas.mediaNotas());
	}
	
}

class Notas{
	private int[] notas;

	public Notas(int[] notas) {
		super();
		this.notas = notas;
	}
	
	public Double mediaNotas(){
		Double media = 0.0;
		
		for(int cont=0; cont<notas.length; cont++) {
			media += notas[cont];
		}
		
		return media/notas.length;
	}
}
