package modelo;

public class Pessoa {

	private String nome;
	private long cpf;
	
	
	public Pessoa() {
		this.nome = nome;
		this.cpf = cpf;
	}
	public Pessoa(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final long getCpf() {
		return cpf;
	}

	public final void setCpf(long cpf) {
		cpf = cpf;
	}
	

	
}
