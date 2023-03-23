package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerPessoa;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaAtividade extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */


	public TelaAtividade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 745, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnome = new JLabel("nome");
		lblnome.setBounds(52, 77, 45, 13);
		contentPane.add(lblnome);
		
		txtNome = new JTextField();
		txtNome.setBounds(100, 74, 139, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnCadastra = new JButton("Cadastro");
		btnCadastra.setBackground(new Color(64, 128, 128));
		btnCadastra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpfString = txtCpf.getText();
				ControllerPessoa controllerPessoa = new ControllerPessoa();
				Integer cpf = Integer.valueOf(cpfString);
				Boolean resultado = controllerPessoa.insertPessoa(nome,cpf);
				if (resultado != false) {
					JOptionPane.showMessageDialog(null, "cadastrado");
				}
				
			}
		});
		btnCadastra.setBounds(100, 115, 153, 21);
		contentPane.add(btnCadastra);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(281, 74, 127, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		lblNewLabel = new JLabel("Cpf");
		lblNewLabel.setBounds(249, 76, 63, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("tabela");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaTabela ta = new TelaTabela();
				ta.setLocationRelativeTo(null);
				ta.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(109, 334, 144, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(596, 334, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
