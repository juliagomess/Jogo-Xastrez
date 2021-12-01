package telas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class TelaZero {
	
	ImageIcon f = new ImageIcon(getClass().getResource("../imagens/fundoZero.png"));
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaZero window = new TelaZero();
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
	public TelaZero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 758, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBackground(SystemColor.menu);
		btnJogar.setForeground(Color.BLACK);
		btnJogar.setFont(new Font("Algerian", Font.PLAIN, 20));
		btnJogar.setBounds(261, 239, 214, 53);
		frame.getContentPane().add(btnJogar);
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaInicial.main(null);
			}
		});
		
		JButton btnRever = new JButton("Rever");
		btnRever.setBackground(SystemColor.menu);
		btnRever.setForeground(Color.BLACK);
		btnRever.setFont(new Font("Algerian", Font.PLAIN, 20));
		btnRever.setBounds(261, 372, 214, 53);
		frame.getContentPane().add(btnRever);
		btnRever.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Main.setRever(1);
				} catch (FileNotFoundException e1) {
					System.out.print("AAAAAAAAAAA");
				}
				frame.setVisible(false);
				TelaJogo.main(null);
			}
		});
		
		JLabel tela = new JLabel("");
		tela.setBounds(-4, 0, 750, 500);
		frame.getContentPane().add(tela);
		tela.setIcon(f);
	}
}
