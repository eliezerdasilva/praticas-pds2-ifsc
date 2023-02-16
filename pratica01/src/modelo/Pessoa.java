package modelo;

public class Pessoa {

	private String nome;
	private long Cpf;
	
	
	public Pessoa(String nome, long cpf) {
		super();
		this.nome = nome;
		Cpf = cpf;
	}

	public Pessoa() {
		super();
		this.nome = nome;
		Cpf = Cpf;
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final long getCpf() {
		return Cpf;
	}

	public final void setCpf(long cpf) {
		Cpf = cpf;
	}
	

	
}
