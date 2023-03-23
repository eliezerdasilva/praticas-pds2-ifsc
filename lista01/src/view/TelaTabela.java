package view;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controller.ControllerTabela;
import model.Pessoa;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaTabela extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public TelaTabela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 27, 414, 201);
		contentPane.add(scrollPane);

		table = new JTable();
		DefaultTableModel dataModel = new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "cpf" });
		table.setModel(dataModel);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAtividade ta = new TelaAtividade();
				ta.setLocationRelativeTo(null);
				ta.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 238, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 dispose();
			}
		});
		btnNewButton_1.setBounds(106, 238, 85, 21);
		contentPane.add(btnNewButton_1);

		ControllerTabela ct = new ControllerTabela();
		ArrayList<Pessoa> p = ct.consultaUsuarios();

		for (Pessoa pessoa : p) {
			dataModel.addRow(new Object[] { pessoa.getNome(), pessoa.getCpf() });
			table.setModel(dataModel);
		}

	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

}
