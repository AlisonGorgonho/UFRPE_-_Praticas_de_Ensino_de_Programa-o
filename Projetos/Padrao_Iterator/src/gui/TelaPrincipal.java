package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class TelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mnNewMenu.add(mntmCadastrar);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mnNewMenu.add(mntmBuscar);
		
		JMenuItem mntmDeletar = new JMenuItem("Deletar");
		mnNewMenu.add(mntmDeletar);
		
		JMenu mnNewMenu_1 = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnNewMenu_1.add(mntmSair);
		
		JMenu mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnNewMenu_2.add(mntmSobre);
	}

}
