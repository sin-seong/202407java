package java0716;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Myframe extends JFrame {
	JLabel lb1 =new JLabel("아이디");
	JTextField jt1 = new JTextField();
	
	JLabel lb2 =new JLabel("비번");
	JTextField jt2 = new JTextField();
	
	JLabel lb3 =new JLabel("이름");
	JTextField jt3 = new JTextField();
	
	JLabel lb4 =new JLabel("주민번호");
	JTextField jt4 = new JTextField();

	JLabel lb5 =new JLabel("전번");
	JTextField jt5 = new JTextField();
	
	
	
	
	JButton jb1 =new JButton("로귄");
	JButton jb2 =new JButton("회갑");
	JButton jb3 =new JButton("예금");
	JButton jb4=new JButton("출금");
	JButton jb5 =new JButton("잔고");
	
	JTextArea ta = new JTextArea();		
	
	public Myframe() {
		Container con = this.getContentPane();
		con.setLayout(null);
		
		con.add(lb1);
		lb1.setLocation(20, 10);
		lb1.setSize(100,30);
		
		con.add(jt1);
		jt1.setLocation(70, 10);
		jt1.setSize(100, 30);
		
		con.add(lb2);
		lb2.setLocation(180, 10);
		lb2.setSize(100,30);
		
		con.add(jt2);
		jt2.setLocation(240, 10);
		jt2.setSize(100, 30);
		
		con.add(lb3);
		lb3.setLocation(20, 60);
		lb3.setSize(100,30);
		
		con.add(jt3);
		jt3.setLocation(70, 60);
		jt3.setSize(100, 30);
		
		con.add(lb4);
		lb4.setLocation(180, 60);
		lb4.setSize(100,30);
		
		con.add(jt4);
		jt4.setLocation(240, 60);
		jt4.setSize(100, 30);
		
		con.add(lb5);
		lb5.setLocation(350, 60);
		lb5.setSize(100,30);
		
		con.add(jt5);
		jt5.setLocation(390, 60);
		jt5.setSize(100, 30);
		
		con.add(ta);
		ta.setLocation(20, 120);
		ta.setSize(830,200);
	
		con.add(jb1);
		jb1.setLocation(20, 350);
		jb1.setSize(100 ,30);
		jb1.addActionListener(new MyListener());
	
		con.add(jb2);
		jb2.setLocation(130, 350);
		jb2.setSize(100 ,30);
		
		con.add(jb3);
		jb3.setLocation(240, 350);
		jb3.setSize(100 ,30);
		
		con.add(jb4);
		jb4.setLocation(350, 350);
		jb4.setSize(100 ,30);
		
		con.add(jb5);
		jb5.setLocation(460, 350);
		jb5.setSize(100 ,30);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("안녕,안녕 안녕");
		this.setLocation(700, 300);
		this.setSize(900, 500);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Myframe();
	}

}
