package telas;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEmpate {
	
	ImageIcon f = new ImageIcon(getClass().getResource("../imagens/fundoEmpate.png"));

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEmpate window = new TelaEmpate();
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
	public TelaEmpate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 1034, 961);
		frame.getContentPane().add(fundo);
		fundo.setIcon(f);
	}
}
