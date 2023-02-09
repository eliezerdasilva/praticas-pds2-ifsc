package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static Connection conexao;
	private static Conexao instancia;
	private static final String DATABASE = "hr";
	private static final String USER = "aluno";
	private static final String PSW = "aluno";

	private Conexao() {

	}

	public Conexao getInstacia() {
		if (instancia == null) {
			instancia = new Conexao();
		}
		return instancia;
	}

	public static Connection conectar() {
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE + "?serverTimezone=UTC", USER,
					PSW);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexao;

	}

	public boolean fecharConexao() {
		try {
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
