package lista01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 * Classe de conexao
 * 
 * @author eliez
 * 
 */
public class CriaBanco {

	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root",
					"Eliezer-2005");
			
			String query = "create database praticaPDS;";
			PreparedStatement stm = conn.prepareStatement(query);
			stm.executeUpdate();

		
			
		
			JOptionPane.showMessageDialog(null, "Conectado", null, JOptionPane.WARNING_MESSAGE);
			System.out.println("foi");
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
