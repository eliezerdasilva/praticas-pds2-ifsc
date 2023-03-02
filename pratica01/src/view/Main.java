package view;

import java.util.ArrayList;

import controller.PessoaDAO;
import modelo.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pessoa pessoa = new Pessoa("eli", 1216616);
		PessoaDAO pessoaDao = new PessoaDAO();
		
		//pessoaDao.Inserir(pessoa);
	/*boolean resultado = pessoaDao.atualizar(pessoa);
	if(resultado != false) {
		System.out.println("Alterado");
	}else {
		System.out.println(" erro");
	}*/
	ArrayList<Pessoa> listaPessoa = pessoaDao.listarPessoas();
	
	for (Pessoa p : listaPessoa) {
		System.out.println(p.getNome());
		String cpf = String.valueOf(p.getCpf());
		System.out.println(cpf);
		
	}
	//Teste

		
	}

}
