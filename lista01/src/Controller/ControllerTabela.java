package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.Pessoa;
import view.TelaTabela;

public class ControllerTabela {

	private CriaBanco con;
	private TelaTabela tela;

	public ControllerTabela() {

	}

	public ControllerTabela(TelaTabela tela) {
		super();
		this.tela = tela;
	}

	public ArrayList<Pessoa> consultaUsuarios() {
		ArrayList<Pessoa> pessoas = new ArrayList<>();

		con = CriaBanco.getInstacia();
		Connection c = con.conectar();
		try {
			Statement stm = c.createStatement();
			String query = "Select * from usuario";
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				int cpf = rs.getInt("cpf");
				String nome = rs.getString("nome");
				Pessoa p = new Pessoa();
				p.setCpf(cpf);
				p.setNome(nome);
				pessoas.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return pessoas;
	}

}
