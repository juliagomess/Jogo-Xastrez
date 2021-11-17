package telas;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class TelaJogo {

	private JFrame frame;
	ImageIcon J1 = new ImageIcon(getClass().getResource("../imagens/fundoJ1.png"));
	ImageIcon pp = new ImageIcon(getClass().getResource("../imagens/peaop.png"));
	ImageIcon pb = new ImageIcon(getClass().getResource("../imagens/peaob.png"));
	ImageIcon tp = new ImageIcon(getClass().getResource("../imagens/torrep.png"));
	ImageIcon tb = new ImageIcon(getClass().getResource("../imagens/torreb.png"));
	ImageIcon cp = new ImageIcon(getClass().getResource("../imagens/cavalop.png"));
	ImageIcon cb = new ImageIcon(getClass().getResource("../imagens/cavalob.png"));
	ImageIcon bp = new ImageIcon(getClass().getResource("../imagens/bispop.png"));
	ImageIcon bb = new ImageIcon(getClass().getResource("../imagens/bispob.png"));
	ImageIcon damap = new ImageIcon(getClass().getResource("../imagens/rainhap.png"));
	ImageIcon damab = new ImageIcon(getClass().getResource("../imagens/rainhab.png"));
	ImageIcon reip = new ImageIcon(getClass().getResource("../imagens/reip.png"));
	ImageIcon reib = new ImageIcon(getClass().getResource("../imagens/reib.png"));

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
		
		JLabel tp1 = new JLabel("");
		tp1.setHorizontalAlignment(SwingConstants.CENTER);
		tp1.setBounds(Main.getX(1, 8), Main.getY(1, 8), 80, 80);
		frame.getContentPane().add(tp1);
		tp1.setIcon(tp);
		
		JLabel cp1 = new JLabel("");
		cp1.setHorizontalAlignment(SwingConstants.CENTER);
		cp1.setBounds(Main.getX(1, 10), Main.getY(1, 10), 80, 80);
		frame.getContentPane().add(cp1);
		cp1.setIcon(cp);
		
		JLabel bp1 = new JLabel("");
		bp1.setHorizontalAlignment(SwingConstants.CENTER);
		bp1.setBounds(Main.getX(1, 12), Main.getY(1, 12), 80, 80);
		frame.getContentPane().add(bp1);
		bp1.setIcon(bp);
		
		JLabel dp = new JLabel("");
		dp.setHorizontalAlignment(SwingConstants.CENTER);
		dp.setBounds(Main.getX(1, 14), Main.getY(1, 14), 80, 80);
		frame.getContentPane().add(dp);
		dp.setIcon(damap);
		
		JLabel rp = new JLabel("");
		rp.setHorizontalAlignment(SwingConstants.CENTER);
		rp.setBounds(Main.getX(1, 15), Main.getY(1, 15), 80, 80);
		frame.getContentPane().add(rp);
		rp.setIcon(reip);
		
		JLabel bp2 = new JLabel("");
		bp2.setHorizontalAlignment(SwingConstants.CENTER);
		bp2.setBounds(Main.getX(1, 13), Main.getY(1, 13), 80, 80);
		frame.getContentPane().add(bp2);
		bp2.setIcon(bp);
		
		JLabel cp2 = new JLabel("");
		cp2.setHorizontalAlignment(SwingConstants.CENTER);
		cp2.setBounds(Main.getX(1, 11), Main.getY(1, 11), 80, 80);
		frame.getContentPane().add(cp2);
		cp2.setIcon(cp);
		
		JLabel tp2 = new JLabel("");
		tp2.setHorizontalAlignment(SwingConstants.CENTER);
		tp2.setBounds(Main.getX(1, 9), Main.getY(1, 9), 80, 80);
		frame.getContentPane().add(tp2);
		tp2.setIcon(tp);
		
		JLabel pp1 = new JLabel("");
		pp1.setHorizontalAlignment(SwingConstants.CENTER);
		pp1.setBounds(Main.getX(1, 0), Main.getY(1, 0), 80, 80);
		frame.getContentPane().add(pp1);
		pp1.setIcon(pp);
		
		JLabel pp2 = new JLabel("");
		pp2.setHorizontalAlignment(SwingConstants.CENTER);
		pp2.setBounds(Main.getX(1, 1), Main.getY(1, 1), 80, 80);
		frame.getContentPane().add(pp2);
		pp2.setIcon(pp);
		
		JLabel pp3 = new JLabel("");
		pp3.setHorizontalAlignment(SwingConstants.CENTER);
		pp3.setBounds(Main.getX(1, 2), Main.getY(1, 2), 80, 80);
		frame.getContentPane().add(pp3);
		pp3.setIcon(pp);
		
		JLabel pp4 = new JLabel("");
		pp4.setHorizontalAlignment(SwingConstants.CENTER);
		pp4.setBounds(Main.getX(1, 3), Main.getY(1, 3), 80, 80);
		frame.getContentPane().add(pp4);
		pp4.setIcon(pp);
		
		JLabel pp5 = new JLabel("");
		pp5.setHorizontalAlignment(SwingConstants.CENTER);
		pp5.setBounds(Main.getX(1, 4), Main.getY(1, 4), 80, 80);
		frame.getContentPane().add(pp5);
		pp5.setIcon(pp);
		
		JLabel pp6 = new JLabel("");
		pp6.setHorizontalAlignment(SwingConstants.CENTER);
		pp6.setBounds(Main.getX(1, 5), Main.getY(1, 5), 80, 80);
		frame.getContentPane().add(pp6);
		pp6.setIcon(pp);
		
		JLabel pp7 = new JLabel("");
		pp7.setHorizontalAlignment(SwingConstants.CENTER);
		pp7.setBounds(Main.getX(1, 6), Main.getY(1, 6), 80, 80);
		frame.getContentPane().add(pp7);
		pp7.setIcon(pp);
		
		JLabel pp8 = new JLabel("");
		pp8.setHorizontalAlignment(SwingConstants.CENTER);
		pp8.setBounds(Main.getX(1, 7), Main.getY(1, 7), 80, 80);
		frame.getContentPane().add(pp8);
		pp8.setIcon(pp);
		
		JLabel pb1 = new JLabel("");
		pb1.setHorizontalAlignment(SwingConstants.CENTER);
		pb1.setBounds(Main.getX(0, 0), Main.getY(0, 0), 80, 80);
		frame.getContentPane().add(pb1);
		pb1.setIcon(pb);
		
		JLabel pb2 = new JLabel("");
		pb2.setHorizontalAlignment(SwingConstants.CENTER);
		pb2.setBounds(Main.getX(0, 1), Main.getY(0, 1), 80, 80);
		frame.getContentPane().add(pb2);
		pb2.setIcon(pb);
		
		JLabel pb3 = new JLabel("");
		pb3.setHorizontalAlignment(SwingConstants.CENTER);
		pb3.setBounds(Main.getX(0, 2), Main.getY(0, 2), 80, 80);
		frame.getContentPane().add(pb3);
		pb3.setIcon(pb);
		
		JLabel pb4 = new JLabel("");
		pb4.setHorizontalAlignment(SwingConstants.CENTER);
		pb4.setBounds(Main.getX(0, 3), Main.getY(0, 3), 80, 80);
		frame.getContentPane().add(pb4);
		pb4.setIcon(pb);
		
		JLabel pb5 = new JLabel("");
		pb5.setHorizontalAlignment(SwingConstants.CENTER);
		pb5.setBounds(Main.getX(0, 4), Main.getY(0, 4), 80, 80);
		frame.getContentPane().add(pb5);
		pb5.setIcon(pb);
		
		JLabel pb6 = new JLabel("");
		pb6.setHorizontalAlignment(SwingConstants.CENTER);
		pb6.setBounds(Main.getX(0, 5), Main.getY(0, 5), 80, 80);
		frame.getContentPane().add(pb6);
		pb6.setIcon(pb);
		
		JLabel pb7 = new JLabel("");
		pb7.setHorizontalAlignment(SwingConstants.CENTER);
		pb7.setBounds(Main.getX(0, 6), Main.getY(0, 6), 80, 80);
		frame.getContentPane().add(pb7);
		pb7.setIcon(pb);
		
		JLabel pb8 = new JLabel("");
		pb8.setHorizontalAlignment(SwingConstants.CENTER);
		pb8.setBounds(Main.getX(0, 7), Main.getY(0, 7), 80, 80);
		frame.getContentPane().add(pb8);
		pb8.setIcon(pb);
		
		JLabel tb1 = new JLabel("");
		tb1.setHorizontalAlignment(SwingConstants.CENTER);
		tb1.setBounds(Main.getX(0, 8), Main.getY(0, 8), 80, 80);
		frame.getContentPane().add(tb1);
		tb1.setIcon(tb);
		
		JLabel cb1 = new JLabel("");
		cb1.setHorizontalAlignment(SwingConstants.CENTER);
		cb1.setBounds(Main.getX(0, 10), Main.getY(0, 10), 80, 80);
		frame.getContentPane().add(cb1);
		cb1.setIcon(cb);
		
		JLabel bb1 = new JLabel("");
		bb1.setHorizontalAlignment(SwingConstants.CENTER);
		bb1.setBounds(Main.getX(0, 12), Main.getY(0, 12), 80, 80);
		frame.getContentPane().add(bb1);
		bb1.setIcon(bb);
		
		JLabel db = new JLabel("");
		db.setHorizontalAlignment(SwingConstants.CENTER);
		db.setBounds(Main.getX(0, 14), Main.getY(0, 14), 80, 80);
		frame.getContentPane().add(db);
		db.setIcon(damab);
		
		JLabel rb = new JLabel("");
		rb.setHorizontalAlignment(SwingConstants.CENTER);
		rb.setBounds(Main.getX(0, 15), Main.getY(0, 15), 80, 80);
		frame.getContentPane().add(rb);
		rb.setIcon(reib);
		
		JLabel bb2 = new JLabel("");
		bb2.setHorizontalAlignment(SwingConstants.CENTER);
		bb2.setBounds(Main.getX(0, 13), Main.getY(0, 13), 80, 80);
		frame.getContentPane().add(bb2);
		bb2.setIcon(bb);
		
		JLabel cb2 = new JLabel("");
		cb2.setHorizontalAlignment(SwingConstants.CENTER);
		cb2.setBounds(Main.getX(0, 11), Main.getY(0, 11), 80, 80);
		frame.getContentPane().add(cb2);
		cb2.setIcon(cb);
		
		JLabel tb2 = new JLabel("");
		tb2.setHorizontalAlignment(SwingConstants.CENTER);
		tb2.setBounds(Main.getX(0, 9), Main.getY(0, 9), 80, 80);
		frame.getContentPane().add(tb2);
		tb2.setIcon(tb);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 1034, 961);
		frame.getContentPane().add(fundo);
		fundo.setIcon(J1);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int flag=0;
				if(flag==0) {
					//pega peça
					flag = 1;
				} else {
					//move ela
					flag = 0;
				}
				
				int x=e.getX()/80;
				int y=e.getY()/80;
				
				System.out.print("\n");
				System.out.print(x);
				System.out.print("\n");
				System.out.print(y);
				System.out.print("\n");
				
				if(Main.movimentoPeca(0, 0, x, y)) {
					frame.setVisible(false);
					TelaJogo2.main(null);
				}
			}
		});
		panel.setBounds(80, 240, 640, 640);
		frame.getContentPane().add(panel);
	}
}
