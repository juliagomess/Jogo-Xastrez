package telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TelaJogo2 {

	int flag=0;
	private ArrayList<JLabel> labels = new ArrayList<JLabel>();
	JLabel atual;

	private JFrame frame;
	ImageIcon J2 = new ImageIcon(getClass().getResource("../imagens/fundoJ2.png"));
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
					TelaJogo2 window = new TelaJogo2();
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
	public TelaJogo2() {
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
		this.labels.add(tp1);
		
		JLabel cp1 = new JLabel("");
		cp1.setHorizontalAlignment(SwingConstants.CENTER);
		cp1.setBounds(Main.getX(1, 10), Main.getY(1, 10), 80, 80);
		frame.getContentPane().add(cp1);
		cp1.setIcon(cp);
		this.labels.add(cp1);
		
		JLabel bp1 = new JLabel("");
		bp1.setHorizontalAlignment(SwingConstants.CENTER);
		bp1.setBounds(Main.getX(1, 12), Main.getY(1, 12), 80, 80);
		frame.getContentPane().add(bp1);
		bp1.setIcon(bp);
		this.labels.add(bp1);
		
		JLabel dp = new JLabel("");
		dp.setHorizontalAlignment(SwingConstants.CENTER);
		dp.setBounds(Main.getX(1, 14), Main.getY(1, 14), 80, 80);
		frame.getContentPane().add(dp);
		dp.setIcon(damap);
		this.labels.add(dp);
		
		JLabel rp = new JLabel("");
		rp.setHorizontalAlignment(SwingConstants.CENTER);
		rp.setBounds(Main.getX(1, 15), Main.getY(1, 15), 80, 80);
		frame.getContentPane().add(rp);
		rp.setIcon(reip);
		this.labels.add(rp);
		
		JLabel bp2 = new JLabel("");
		bp2.setHorizontalAlignment(SwingConstants.CENTER);
		bp2.setBounds(Main.getX(1, 13), Main.getY(1, 13), 80, 80);
		frame.getContentPane().add(bp2);
		bp2.setIcon(bp);
		this.labels.add(bp2);
		
		JLabel cp2 = new JLabel("");
		cp2.setHorizontalAlignment(SwingConstants.CENTER);
		cp2.setBounds(Main.getX(1, 11), Main.getY(1, 11), 80, 80);
		frame.getContentPane().add(cp2);
		cp2.setIcon(cp);
		this.labels.add(cp2);
		
		JLabel tp2 = new JLabel("");
		tp2.setHorizontalAlignment(SwingConstants.CENTER);
		tp2.setBounds(Main.getX(1, 9), Main.getY(1, 9), 80, 80);
		frame.getContentPane().add(tp2);
		tp2.setIcon(tp);
		this.labels.add(tp2);
		
		JLabel pp1 = new JLabel("");
		pp1.setHorizontalAlignment(SwingConstants.CENTER);
		pp1.setBounds(Main.getX(1, 0), Main.getY(1, 0), 80, 80);
		frame.getContentPane().add(pp1);
		pp1.setIcon(pp);
		this.labels.add(pp1);
		
		JLabel pp2 = new JLabel("");
		pp2.setHorizontalAlignment(SwingConstants.CENTER);
		pp2.setBounds(Main.getX(1, 1), Main.getY(1, 1), 80, 80);
		frame.getContentPane().add(pp2);
		pp2.setIcon(pp);
		this.labels.add(pp2);
		
		JLabel pp3 = new JLabel("");
		pp3.setHorizontalAlignment(SwingConstants.CENTER);
		pp3.setBounds(Main.getX(1, 2), Main.getY(1, 2), 80, 80);
		frame.getContentPane().add(pp3);
		pp3.setIcon(pp);
		this.labels.add(pp3);
		
		JLabel pp4 = new JLabel("");
		pp4.setHorizontalAlignment(SwingConstants.CENTER);
		pp4.setBounds(Main.getX(1, 3), Main.getY(1, 3), 80, 80);
		frame.getContentPane().add(pp4);
		pp4.setIcon(pp);
		this.labels.add(pp4);
		
		JLabel pp5 = new JLabel("");
		pp5.setHorizontalAlignment(SwingConstants.CENTER);
		pp5.setBounds(Main.getX(1, 4), Main.getY(1, 4), 80, 80);
		frame.getContentPane().add(pp5);
		pp5.setIcon(pp);
		this.labels.add(pp5);
		
		JLabel pp6 = new JLabel("");
		pp6.setHorizontalAlignment(SwingConstants.CENTER);
		pp6.setBounds(Main.getX(1, 5), Main.getY(1, 5), 80, 80);
		frame.getContentPane().add(pp6);
		pp6.setIcon(pp);
		this.labels.add(pp6);
		
		JLabel pp7 = new JLabel("");
		pp7.setHorizontalAlignment(SwingConstants.CENTER);
		pp7.setBounds(Main.getX(1, 6), Main.getY(1, 6), 80, 80);
		frame.getContentPane().add(pp7);
		pp7.setIcon(pp);
		this.labels.add(pp7);
		
		JLabel pp8 = new JLabel("");
		pp8.setHorizontalAlignment(SwingConstants.CENTER);
		pp8.setBounds(Main.getX(1, 7), Main.getY(1, 7), 80, 80);
		frame.getContentPane().add(pp8);
		pp8.setIcon(pp);
		this.labels.add(pp8);
		
		JLabel pb1 = new JLabel("");
		pb1.setHorizontalAlignment(SwingConstants.CENTER);
		pb1.setBounds(Main.getX(0, 0), Main.getY(0, 0), 80, 80);
		frame.getContentPane().add(pb1);
		pb1.setIcon(pb);
		this.labels.add(pb1);
		
		JLabel pb2 = new JLabel("");
		pb2.setHorizontalAlignment(SwingConstants.CENTER);
		pb2.setBounds(Main.getX(0, 1), Main.getY(0, 1), 80, 80);
		frame.getContentPane().add(pb2);
		pb2.setIcon(pb);
		this.labels.add(pb2);
		
		JLabel pb3 = new JLabel("");
		pb3.setHorizontalAlignment(SwingConstants.CENTER);
		pb3.setBounds(Main.getX(0, 2), Main.getY(0, 2), 80, 80);
		frame.getContentPane().add(pb3);
		pb3.setIcon(pb);
		this.labels.add(pb3);
		
		JLabel pb4 = new JLabel("");
		pb4.setHorizontalAlignment(SwingConstants.CENTER);
		pb4.setBounds(Main.getX(0, 3), Main.getY(0, 3), 80, 80);
		frame.getContentPane().add(pb4);
		pb4.setIcon(pb);
		this.labels.add(pb4);
		
		JLabel pb5 = new JLabel("");
		pb5.setHorizontalAlignment(SwingConstants.CENTER);
		pb5.setBounds(Main.getX(0, 4), Main.getY(0, 4), 80, 80);
		frame.getContentPane().add(pb5);
		pb5.setIcon(pb);
		this.labels.add(pb5);
		
		JLabel pb6 = new JLabel("");
		pb6.setHorizontalAlignment(SwingConstants.CENTER);
		pb6.setBounds(Main.getX(0, 5), Main.getY(0, 5), 80, 80);
		frame.getContentPane().add(pb6);
		pb6.setIcon(pb);
		this.labels.add(pb6);
		
		JLabel pb7 = new JLabel("");
		pb7.setHorizontalAlignment(SwingConstants.CENTER);
		pb7.setBounds(Main.getX(0, 6), Main.getY(0, 6), 80, 80);
		frame.getContentPane().add(pb7);
		pb7.setIcon(pb);
		this.labels.add(pb7);
		
		JLabel pb8 = new JLabel("");
		pb8.setHorizontalAlignment(SwingConstants.CENTER);
		pb8.setBounds(Main.getX(0, 7), Main.getY(0, 7), 80, 80);
		frame.getContentPane().add(pb8);
		pb8.setIcon(pb);
		this.labels.add(pb8);
		
		JLabel tb1 = new JLabel("");
		tb1.setHorizontalAlignment(SwingConstants.CENTER);
		tb1.setBounds(Main.getX(0, 8), Main.getY(0, 8), 80, 80);
		frame.getContentPane().add(tb1);
		tb1.setIcon(tb);
		this.labels.add(tb1);
		
		JLabel cb1 = new JLabel("");
		cb1.setHorizontalAlignment(SwingConstants.CENTER);
		cb1.setBounds(Main.getX(0, 10), Main.getY(0, 10), 80, 80);
		frame.getContentPane().add(cb1);
		cb1.setIcon(cb);
		this.labels.add(cb1);
		
		JLabel bb1 = new JLabel("");
		bb1.setHorizontalAlignment(SwingConstants.CENTER);
		bb1.setBounds(Main.getX(0, 12), Main.getY(0, 12), 80, 80);
		frame.getContentPane().add(bb1);
		bb1.setIcon(bb);
		this.labels.add(bb1);
		
		JLabel db = new JLabel("");
		db.setHorizontalAlignment(SwingConstants.CENTER);
		db.setBounds(Main.getX(0, 14), Main.getY(0, 14), 80, 80);
		frame.getContentPane().add(db);
		db.setIcon(damab);
		this.labels.add(db);
		
		JLabel rb = new JLabel("");
		rb.setHorizontalAlignment(SwingConstants.CENTER);
		rb.setBounds(Main.getX(0, 15), Main.getY(0, 15), 80, 80);
		frame.getContentPane().add(rb);
		rb.setIcon(reib);
		this.labels.add(rb);
		
		JLabel bb2 = new JLabel("");
		bb2.setHorizontalAlignment(SwingConstants.CENTER);
		bb2.setBounds(Main.getX(0, 13), Main.getY(0, 13), 80, 80);
		frame.getContentPane().add(bb2);
		bb2.setIcon(bb);
		this.labels.add(bb2);
		
		JLabel cb2 = new JLabel("");
		cb2.setHorizontalAlignment(SwingConstants.CENTER);
		cb2.setBounds(Main.getX(0, 11), Main.getY(0, 11), 80, 80);
		frame.getContentPane().add(cb2);
		cb2.setIcon(cb);
		this.labels.add(cb2);
		
		JLabel tb2 = new JLabel("");
		tb2.setHorizontalAlignment(SwingConstants.CENTER);
		tb2.setBounds(Main.getX(0, 9), Main.getY(0, 9), 80, 80);
		frame.getContentPane().add(tb2);
		tb2.setIcon(tb);
		this.labels.add(tb2);
		
		JLabel fundo = new JLabel("");
		fundo.setBounds(0, 0, 1034, 961);
		frame.getContentPane().add(fundo);
		fundo.setIcon(J2);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int flag=0;
				if(flag==0) {
					//pega pe�a
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
				
				Main.movimentoPeca(1, x, y);		
			}
		});
		panel.setBounds(80, 240, 640, 640);
		frame.getContentPane().add(panel);
	}

}
