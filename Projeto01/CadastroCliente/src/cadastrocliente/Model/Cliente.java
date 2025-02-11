package cadastrocliente.Model;

public class Cliente {
	
	private String nome;
	private Long cpf;
	private Long tel;
	private String endereco;
	private Integer numeroEndereco;
	private String cidade;
	private String estado;
	
	public Cliente(String nome, Long cpf, Long tel, String endereco, Integer numeroEndereco, String cidade,
			String estado) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
		this.endereco = endereco;
		this.numeroEndereco = numeroEndereco;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getTel() {
		return tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(Integer numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
