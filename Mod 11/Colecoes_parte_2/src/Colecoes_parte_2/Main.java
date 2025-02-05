package Colecoes_parte_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Pessoa> masculino = new ArrayList<>();
		List<Pessoa> feminino = new ArrayList<>();
		
		String[] nomeSexo;
		Pessoa pessoa;
		
		do {
			
			nomeSexo = solicitaNomeSexo();
			
			if(!nomeSexo[0].equals("-1")) {
				pessoa = new Pessoa(nomeSexo[0],nomeSexo[1]);	
				
				(nomeSexo[1].equals("M") ? masculino : feminino).add(pessoa);
			}
			
		}while(!nomeSexo[0].equals("-1"));
		
		System.out.println("Pessoas masculinas: "+masculino.toString());
		System.out.println("Pessoas femininas: "+feminino.toString());

	}
	
	public static String[] solicitaNomeSexo() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome e o sexo separados por espaço (ex: João M)(-1 para sair):");
        String entrada = leitor.nextLine();
        
        
        return entrada.split(" ");
	}

}

class Pessoa{
	private String nome;
	private String sexo;
	
	public Pessoa(String nome, String sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome= " + nome + ", sexo= " + sexo + "]";
	}

}
