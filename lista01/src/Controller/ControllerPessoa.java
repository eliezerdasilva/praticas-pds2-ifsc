package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Pessoa;

public class ControllerPessoa {

	private CriaBanco con;
	Pessoa usuario = new Pessoa();
	public boolean insertPessoa(String nome, int cpf) {
		
		boolean retorno = false;
		con = CriaBanco.getInstacia();
		Connection c = con.conectar();
	
		
		try {
	

			String query = "insert into usuario(nome,cpf)values(?,?)";
			PreparedStatement stm = c.prepareStatement(query);
			stm.setString(1, nome);
			stm.setInt(2, cpf);
			int count = stm.executeUpdate();
			
			
			retorno = true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;	
	}

}
