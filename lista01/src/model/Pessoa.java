/**
 * 
 */
package model;

/**
 * @author frete
 *
 */
public class Pessoa {
	
	private String nome;
	private int cpf;
	
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return nome + "~" + cpf;
	}
	
	
	

}
