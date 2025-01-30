package tarefa_controleDeFluxo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		List<Float> notas = new ArrayList<>();
		
		for(int cont=0; cont<4; cont++) {
			System.out.println("Informe a nota "+cont);
			notas.add(leitor.nextFloat());
		}
		
		Float mediaFinal = calculaMedia(notas);
		
		System.out.println("O aluno esta: "+verificaAprovado(mediaFinal)+
				"\nA media final eh: "+mediaFinal);
	}
	
	public static Float calculaMedia(List<Float> notas) {
		
		Float media = 0.0f;
		
		for(Float nota : notas) {
			media += nota;
		}
		
		return media/4;
	}
	
	public static String verificaAprovado(Float media) {
		
		if(media >= 7) {
			return "APROVADO";
		}else if(media >= 5) {
			return "RECUPERACAO";
		}else {
			return "REPROVADO";
		}
	}

}
