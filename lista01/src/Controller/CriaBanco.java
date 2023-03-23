package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import view.TelaAtividade;

/**
 * Classe de conexao
 * 
 * @author eliez
 * 
 */
public class CriaBanco {

	private static Connection conexao;
	private static CriaBanco instancia;

	public static void main(String[] args) {
		
		CriaBanco chama = new CriaBanco();
		chama.conectar();
		chama.exercicio8();
		
	}
	public static CriaBanco getInstacia() {
		if (instancia == null) {
			instancia = new CriaBanco();
		}
		return instancia;
	}

	public Connection conectar() {

		try {
			conexao =  DriverManager.getConnection("jdbc:mysql://localhost/","root","Eliezer-2005");

			String query = "create database if not exists praticaPDS";
			PreparedStatement stm = conexao.prepareStatement(query);
			stm.executeUpdate();

			query = "USE praticaPDS;";
			stm.executeUpdate(query);

			String query2 = "create table if not exists usuario  (id int PRIMARY KEY AUTO_INCREMENT, nome varchar(255) NOT NULL, cpf int(255) NOT NULL);";
			stm.executeUpdate(query2);

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return conexao;
	}
	public void exercicio8() {
		TelaAtividade tA = new TelaAtividade();
		tA.setLocationRelativeTo(null);
		tA.setVisible(true);
		
	}

}
