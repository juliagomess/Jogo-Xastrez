package telas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class TelaVitoria {
	
	ImageIcon f = new ImageIcon(getClass().getResource("../imagens/fundoVitoria.png"));

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVitoria window = new TelaVitoria();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public TelaVitoria() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(10, 10, 1050, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBackground(SystemColor.menu);
		btnJogar.setVerticalAlignment(SwingConstants.TOP);
		btnJogar.setFont(new Font("Algerian", Font.PLAIN, 50));
		btnJogar.setBounds(367, 765, 300, 65);
		frame.getContentPane().add(btnJogar);
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TelaInicial.main(null);
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(SystemColor.menu);
		btnSair.setVerticalAlignment(SwingConstants.TOP);
		btnSair.setFont(new Font("Algerian", Font.PLAIN, 50));
		btnSair.setBounds(367, 841, 300, 65);
		frame.getContentPane().add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		
		JLabel lblNewLabel = new JLabel(Main.getVencedor());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 120));
		lblNewLabel.setBounds(0, 239, 1034, 136);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 1034, 961);
		frame.getContentPane().add(fundo);
		fundo.setIcon(f);
	}

}
