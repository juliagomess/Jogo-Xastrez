package telas;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class TelaInicial {

	private JFrame frame;
	ImageIcon fundo = new ImageIcon(getClass().getResource("../imagens/fundoInicial.png"));
	private JTextField jogador1;
	private JTextField jogador2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
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
	public TelaInicial() {
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
		
		jogador1 = new JTextField();
		jogador1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jogador1.setBounds(174, 176, 393, 46);
		frame.getContentPane().add(jogador1);
		jogador1.setColumns(10);
		
		jogador2 = new JTextField();
		jogador2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		jogador2.setColumns(10);
		jogador2.setBounds(174, 314, 393, 46);
		frame.getContentPane().add(jogador2);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBackground(Color.BLACK);
		btnJogar.setForeground(Color.BLACK);
		btnJogar.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnJogar.setBounds(289, 396, 164, 46);
		frame.getContentPane().add(btnJogar);
		
		JLabel tela = new JLabel("");
		tela.setBounds(-4, 0, 750, 500);
		frame.getContentPane().add(tela);
		tela.setIcon(fundo);
	}
}
