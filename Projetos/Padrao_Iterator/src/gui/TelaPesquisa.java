package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dados.RepositorioFiat;
import principal.Carro;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaPesquisa extends JFrame {

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
					TelaPesquisa frame = new TelaPesquisa();
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
	public TelaPesquisa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Busca de Ve\u00EDculos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 414, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnFord = new JRadioButton("Ford");
		rdbtnFord.setBounds(111, 48, 109, 23);
		contentPane.add(rdbtnFord);
		
		JRadioButton rdbtnFiat = new JRadioButton("Fiat");
		rdbtnFiat.setBounds(266, 48, 109, 23);
		contentPane.add(rdbtnFiat);
		
		JLabel lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setBounds(39, 52, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Modelo:");
		lblNewLabel_2.setBounds(39, 85, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ano:");
		lblNewLabel_3.setBounds(39, 118, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Placa:");
		lblNewLabel_4.setBounds(39, 154, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textModelo = new JTextField();
		textModelo.setBounds(111, 82, 219, 20);
		contentPane.add(textModelo);
		textModelo.setColumns(10);
		
		textAno = new JTextField();
		textAno.setBounds(111, 115, 219, 20);
		contentPane.add(textAno);
		textAno.setColumns(10);
		
		textPlaca = new JTextField();
		textPlaca.setBounds(111, 151, 219, 20);
		contentPane.add(textPlaca);
		textPlaca.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Resultado:");
		lblNewLabel_5.setBounds(39, 284, 60, 14);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdbtnTodos = new JRadioButton("Todos");
		rdbtnTodos.setBounds(195, 197, 109, 23);
		contentPane.add(rdbtnTodos);
		
		JList list = new JList();
		list.setValueIsAdjusting(true);
		list.setBackground(Color.GRAY);
		list.setBounds(111, 341, 219, -94);
		contentPane.add(list);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
				if(rdbtnFiat.isSelected()){
					

					
					RepositorioFiat repositorioFiat = new RepositorioFiat();
					
					repositorioFiat.inserirCarroFiat("Fiat", "Focus", "2009", "KKP-2593");
					repositorioFiat.inserirCarroFiat("Fiat", "Focus", "2009", "KKP-1111");
					repositorioFiat.inserirCarroFiat("Fiat", "Focus", "2009", "KKP-0000");

					
					
					for(Carro i: repositorioFiat.printCarrosFiat()){
						
						String lista = "Marca: Fiat, Modelo: " + i.getModelo() + ", Ano: " + i.getAno() + ", Placa: " + i.getPlaca() + "\n";
						
						DefaultListModel listaCarros = new DefaultListModel();
						
						listaCarros.addElement(lista);
						
						list.setModel(listaCarros);
						
						
						
					}
					list.setModel(listaCarros);
				}
				
			}
		});
		
		btnBuscar.setBounds(178, 373, 89, 23);
		contentPane.add(btnBuscar);
		

	}
}
