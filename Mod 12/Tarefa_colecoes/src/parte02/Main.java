package parte02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
	Map<Integer, Pessoa> masculino = new HashMap<>();
	Map<Integer, Pessoa> feminino = new HashMap<>();
	
	String[] nomeSexo;
	Pessoa pessoa;
	Integer cont = 0;
	
	nomeSexo = solicitaNomeSexo();
	
	for (String valores : nomeSexo) {
		cont++;
		
		String[] temp = valores.split("-");
		pessoa = new Pessoa(temp[0],temp[1]);	
		
		(temp[1].equals("M") ? masculino : feminino).put(cont,pessoa);
	}
	
	
	System.out.println("Pessoas masculinas: "+masculino.toString());
	System.out.println("Pessoas femininas: "+feminino.toString());

	}
	
	public static String[] solicitaNomeSexo() {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o nome-sexo separados por virgula (ex: João-M,Maria-F):");
	    String entrada = leitor.nextLine();
	        
		return entrada.split(",");
		
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
