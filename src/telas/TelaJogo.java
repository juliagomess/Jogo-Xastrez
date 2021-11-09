package telas;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

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
		
		JLabel lbl1A = new JLabel("");
		lbl1A.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1A.setBounds(80, 802, 80, 80);
		frame.getContentPane().add(lbl1A);
		
		JLabel lbl1B = new JLabel("");
		lbl1B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1B.setBounds(160, 802, 80, 80);
		frame.getContentPane().add(lbl1B);
		
		JLabel lbl1C = new JLabel("");
		lbl1C.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1C.setBounds(240, 802, 80, 80);
		frame.getContentPane().add(lbl1C);
		
		JLabel lbl1D = new JLabel("");
		lbl1D.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1D.setBounds(320, 802, 80, 80);
		frame.getContentPane().add(lbl1D);
		
		JLabel lbl1E = new JLabel("");
		lbl1E.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1E.setBounds(400, 802, 80, 80);
		frame.getContentPane().add(lbl1E);
		
		JLabel lbl1F = new JLabel("");
		lbl1F.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1F.setBounds(480, 802, 80, 80);
		frame.getContentPane().add(lbl1F);
		
		JLabel lbl1G = new JLabel("");
		lbl1G.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1G.setBounds(560, 802, 80, 80);
		frame.getContentPane().add(lbl1G);
		
		JLabel lbl1H = new JLabel("");
		lbl1H.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1H.setBounds(640, 802, 80, 80);
		frame.getContentPane().add(lbl1H);
		
		JLabel lbl2A = new JLabel("");
		lbl2A.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2A.setBounds(80, 722, 80, 80);
		frame.getContentPane().add(lbl2A);
		
		JLabel lbl2B = new JLabel("");
		lbl2B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2B.setBounds(160, 722, 80, 80);
		frame.getContentPane().add(lbl2B);
		
		JLabel lbl2C = new JLabel("");
		lbl2C.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2C.setBounds(234, 722, 84, 89);
		frame.getContentPane().add(lbl2C);
		
		JLabel lbl2D = new JLabel("");
		lbl2D.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2D.setBounds(320, 722, 79, 75);
		frame.getContentPane().add(lbl2D);
		
		JLabel lbl2E = new JLabel("");
		lbl2E.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2E.setBounds(400, 722, 84, 89);
		frame.getContentPane().add(lbl2E);
		
		JLabel lbl2F = new JLabel("");
		lbl2F.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2F.setBounds(485, 729, 79, 75);
		frame.getContentPane().add(lbl2F);
		
		JLabel lbl2G = new JLabel("");
		lbl2G.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2G.setBounds(565, 722, 84, 89);
		frame.getContentPane().add(lbl2G);
		
		JLabel lbl2H = new JLabel("");
		lbl2H.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2H.setBounds(649, 729, 79, 75);
		frame.getContentPane().add(lbl2H);
		
		JLabel lbl3A = new JLabel("");
		lbl3A.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3A.setBounds(72, 643, 79, 82);
		frame.getContentPane().add(lbl3A);
		
		JLabel lbl3B = new JLabel("");
		lbl3B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3B.setBounds(152, 638, 84, 89);
		frame.getContentPane().add(lbl3B);
		
		JLabel lbl3C = new JLabel("");
		lbl3C.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3C.setBounds(235, 643, 79, 82);
		frame.getContentPane().add(lbl3C);
		
		JLabel lbl3D = new JLabel("");
		lbl3D.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3D.setBounds(315, 638, 84, 89);
		frame.getContentPane().add(lbl3D);
		
		JLabel lbl3E = new JLabel("");
		lbl3E.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3E.setBounds(400, 643, 79, 82);
		frame.getContentPane().add(lbl3E);
		
		JLabel lbl3F = new JLabel("");
		lbl3F.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3F.setBounds(480, 638, 84, 89);
		frame.getContentPane().add(lbl3F);
		
		JLabel lbl3G = new JLabel("");
		lbl3G.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3G.setBounds(565, 643, 79, 82);
		frame.getContentPane().add(lbl3G);
		
		JLabel lbl3H = new JLabel("");
		lbl3H.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3H.setBounds(645, 638, 84, 89);
		frame.getContentPane().add(lbl3H);
		
		JLabel lbl4A = new JLabel("");
		lbl4A.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4A.setBounds(72, 556, 84, 89);
		frame.getContentPane().add(lbl4A);
		
		JLabel lbl4B = new JLabel("");
		lbl4B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4B.setBounds(157, 563, 79, 75);
		frame.getContentPane().add(lbl4B);
		
		JLabel lbl4C = new JLabel("");
		lbl4C.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4C.setBounds(234, 556, 84, 89);
		frame.getContentPane().add(lbl4C);
		
		JLabel lbl4D = new JLabel("");
		lbl4D.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4D.setBounds(320, 563, 79, 75);
		frame.getContentPane().add(lbl4D);
		
		JLabel lbl4E = new JLabel("");
		lbl4E.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4E.setBounds(400, 556, 84, 89);
		frame.getContentPane().add(lbl4E);
		
		JLabel lbl4F = new JLabel("");
		lbl4F.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4F.setBounds(485, 563, 79, 75);
		frame.getContentPane().add(lbl4F);
		
		JLabel lbl4G = new JLabel("");
		lbl4G.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4G.setBounds(565, 556, 84, 89);
		frame.getContentPane().add(lbl4G);
		
		JLabel lbl4H = new JLabel("");
		lbl4H.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4H.setBounds(649, 563, 79, 75);
		frame.getContentPane().add(lbl4H);
		
		JLabel lbl5A = new JLabel("");
		lbl5A.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5A.setBounds(72, 477, 79, 82);
		frame.getContentPane().add(lbl5A);
		
		JLabel lbl5B = new JLabel("");
		lbl5B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5B.setBounds(152, 472, 84, 89);
		frame.getContentPane().add(lbl5B);
		
		JLabel lbl5C = new JLabel("");
		lbl5C.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5C.setBounds(235, 477, 79, 82);
		frame.getContentPane().add(lbl5C);
		
		JLabel lbl5D = new JLabel("");
		lbl5D.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5D.setBounds(315, 472, 84, 89);
		frame.getContentPane().add(lbl5D);
		
		JLabel lbl5E = new JLabel("");
		lbl5E.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5E.setBounds(400, 477, 79, 82);
		frame.getContentPane().add(lbl5E);
		
		JLabel lbl5F = new JLabel("");
		lbl5F.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5F.setBounds(480, 472, 84, 89);
		frame.getContentPane().add(lbl5F);
		
		JLabel lbl5G = new JLabel("");
		lbl5G.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5G.setBounds(565, 477, 79, 82);
		frame.getContentPane().add(lbl5G);
		
		JLabel lbl5H = new JLabel("");
		lbl5H.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5H.setBounds(645, 472, 84, 89);
		frame.getContentPane().add(lbl5H);
		
		JLabel lbl6A = new JLabel("");
		lbl6A.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6A.setBounds(72, 392, 84, 89);
		frame.getContentPane().add(lbl6A);
		
		JLabel lbl6B = new JLabel("");
		lbl6B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6B.setBounds(157, 399, 79, 75);
		frame.getContentPane().add(lbl6B);
		
		JLabel lbl6C = new JLabel("");
		lbl6C.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6C.setBounds(234, 392, 84, 89);
		frame.getContentPane().add(lbl6C);
		
		JLabel lbl6D = new JLabel("");
		lbl6D.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6D.setBounds(320, 399, 79, 75);
		frame.getContentPane().add(lbl6D);
		
		JLabel lbl6E = new JLabel("");
		lbl6E.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6E.setBounds(400, 392, 84, 89);
		frame.getContentPane().add(lbl6E);
		
		JLabel lbl6F = new JLabel("");
		lbl6F.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6F.setBounds(485, 399, 79, 75);
		frame.getContentPane().add(lbl6F);
		
		JLabel lbl6G = new JLabel("");
		lbl6G.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6G.setBounds(565, 392, 84, 89);
		frame.getContentPane().add(lbl6G);
		
		JLabel lbl6H = new JLabel("");
		lbl6H.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6H.setBounds(649, 399, 79, 75);
		frame.getContentPane().add(lbl6H);
		
		JLabel lbl7A = new JLabel("");
		lbl7A.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7A.setBounds(72, 313, 79, 82);
		frame.getContentPane().add(lbl7A);
		
		JLabel lbl7B = new JLabel("");
		lbl7B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7B.setBounds(72, 243, 84, 89);
		frame.getContentPane().add(lbl7B);
		
		JLabel lbl7C = new JLabel("");
		lbl7C.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7C.setBounds(235, 313, 79, 82);
		frame.getContentPane().add(lbl7C);
		
		JLabel lbl7D = new JLabel("");
		lbl7D.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7D.setBounds(315, 308, 84, 89);
		frame.getContentPane().add(lbl7D);
		
		JLabel lbl7E = new JLabel("");
		lbl7E.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7E.setBounds(400, 313, 79, 82);
		frame.getContentPane().add(lbl7E);
		
		JLabel lbl7F = new JLabel("");
		lbl7F.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7F.setBounds(480, 308, 84, 89);
		frame.getContentPane().add(lbl7F);
		
		JLabel lbl7G = new JLabel("");
		lbl7G.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7G.setBounds(565, 313, 79, 82);
		frame.getContentPane().add(lbl7G);
		
		JLabel lbl7H = new JLabel("");
		lbl7H.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7H.setBounds(645, 308, 84, 89);
		frame.getContentPane().add(lbl7H);
		
		JLabel lbl8A = new JLabel("");
		lbl8A.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8A.setBounds(189, 276, 84, 82);
		frame.getContentPane().add(lbl8A);
		
		JLabel lbl8B = new JLabel("");
		lbl8B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8B.setBounds(157, 233, 79, 75);
		frame.getContentPane().add(lbl8B);
		
		JLabel lbl8C = new JLabel("");
		lbl8C.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8C.setBounds(234, 233, 84, 82);
		frame.getContentPane().add(lbl8C);
		
		JLabel lbl8D = new JLabel("");
		lbl8D.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8D.setBounds(320, 233, 79, 75);
		frame.getContentPane().add(lbl8D);
		
		JLabel lbl8E = new JLabel("");
		lbl8E.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8E.setBounds(400, 233, 84, 82);
		frame.getContentPane().add(lbl8E);
		
		JLabel lbl8F = new JLabel("");
		lbl8F.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8F.setBounds(485, 233, 79, 75);
		frame.getContentPane().add(lbl8F);
		
		JLabel lbl8G = new JLabel("");
		lbl8G.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8G.setBounds(565, 233, 84, 82);
		frame.getContentPane().add(lbl8G);
		
		JLabel lbl8H = new JLabel("");
		lbl8H.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8H.setBounds(649, 233, 79, 75);
		frame.getContentPane().add(lbl8H);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 1034, 961);
		frame.getContentPane().add(fundo);
		fundo.setIcon(J1);
	}
}
