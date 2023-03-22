package lista01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import view.TelaAtividade;

/**
 * Classe de conexao
 * 
 * @author eliez
 * 
 */
public class CriaBanco {
	private static Connection conn;
	public static void main(String[] args) {
		
		/**
		 * Questão 8 
		 */
	}
		public Connection conectar() {

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root",
					"Eliezer-2005");
			
			String query = "create database if not exists praticaPDS";
			PreparedStatement stm = conn.prepareStatement(query);
			stm.executeUpdate();

			query = "USE praticaPDS;";
			stm.executeUpdate(query);
			
			String query2 = "create table usuario (id int PRIMARY KEY AUTO_INCREMENT, nome varchar(255) NOT NULL, cpf varchar(255) NOT NULL);";
			stm.executeUpdate(query2);
		
			JOptionPane.showMessageDialog(null, "Conectado", null, JOptionPane.WARNING_MESSAGE);
			
			
			System.out.println("foi");
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return conn;
		}

		/**
		 *  Questão 9
		 */
	
		TelaAtividade telaAtividade = new TelaAtividade();
		telaAtividade.setVisible(true);
		
	}

}
