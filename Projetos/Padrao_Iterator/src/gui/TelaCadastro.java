package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textModelo;
	private JTextField textAno;
	private JTextField textPlaca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Novo Carro");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setBounds(10, 71, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Modelo:");
		lblNewLabel_2.setBounds(10, 107, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ano:");
		lblNewLabel_3.setBounds(10, 148, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Placa:");
		lblNewLabel_4.setBounds(10, 193, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(95, 227, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(239, 227, 89, 23);
		contentPane.add(btnVoltar);
		
		JRadioButton rdbtnFord = new JRadioButton("Ford");
		rdbtnFord.setBounds(95, 67, 109, 23);
		contentPane.add(rdbtnFord);
		
		JRadioButton rdbtnFiat = new JRadioButton("Fiat");
		rdbtnFiat.setBounds(239, 67, 109, 23);
		contentPane.add(rdbtnFiat);
		
		textModelo = new JTextField();
		textModelo.setBounds(98, 104, 230, 20);
		contentPane.add(textModelo);
		textModelo.setColumns(10);
		
		textAno = new JTextField();
		textAno.setBounds(98, 145, 230, 20);
		contentPane.add(textAno);
		textAno.setColumns(10);
		
		textPlaca = new JTextField();
		textPlaca.setBounds(95, 190, 233, 20);
		contentPane.add(textPlaca);
		textPlaca.setColumns(10);
	}

}
