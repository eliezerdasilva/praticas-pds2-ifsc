package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerPessoa;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAtividade extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade frame = new TelaAtividade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		txtNome.setBounds(130, 74, 96, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnCadastra = new JButton("Cadastro");
		btnCadastra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpfString = txtCpf.getText();
				ControllerPessoa controllerPessoa = new ControllerPessoa();
				Integer cpf = Integer.valueOf(cpfString);
				controllerPessoa.insertPessoa(nome,cpf);
				
			}
		});
		btnCadastra.setBounds(227, 122, 85, 21);
		contentPane.add(btnCadastra);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(402, 73, 86, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		lblNewLabel = new JLabel("Cpf");
		lblNewLabel.setBounds(370, 76, 46, 14);
		contentPane.add(lblNewLabel);
	}
}
