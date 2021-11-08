package telas;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class TelaJogo {

	private JFrame frame;
	ImageIcon J1 = new ImageIcon(getClass().getResource("../imagens/fundoJ1.png"));
	ImageIcon J2 = new ImageIcon(getClass().getResource("../imagens/fundoJ2.png"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo window = new TelaJogo();
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
	public TelaJogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1050, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEmpate = new JButton("Sugerir Empate");
		btnEmpate.setForeground(Color.BLACK);
		btnEmpate.setBackground(SystemColor.menu);
		btnEmpate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnEmpate.setBounds(840, 417, 170, 82);
		frame.getContentPane().add(btnEmpate);
		
		JButton btnDesistir = new JButton("Desistir");
		btnDesistir.setForeground(Color.BLACK);
		btnDesistir.setBackground(SystemColor.menu);
		btnDesistir.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDesistir.setBounds(840, 590, 170, 82);
		frame.getContentPane().add(btnDesistir);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 1034, 961);
		frame.getContentPane().add(fundo);
		fundo.setIcon(J1);
	}
}
