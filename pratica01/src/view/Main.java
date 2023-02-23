package view;

import controller.PessoaDAO;
import modelo.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa("eli", 11616);
		PessoaDAO pessoaDao = new PessoaDAO();
		
		pessoaDao.Inserir(pessoa);

		
	}

}
