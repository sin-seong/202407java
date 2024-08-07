package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExGridLayout1 extends JFrame {

	JButton jb1 = new JButton("버튼1");
	JButton jb2 = new JButton("버튼2");
	JButton jb3 = new JButton("버튼3");
	JButton jb4 = new JButton("버튼4");
	JButton jb5 = new JButton("버튼5");
	ExGridLayout1(){
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());//보더레이아웃은 방향 지정해줘야함 ??그런가
		con.add(jb1,BorderLayout.NORTH);
		con.add(jb2,BorderLayout.WEST);
		con.add(jb3,BorderLayout.SOUTH);
		con.add(jb4,BorderLayout.EAST);
		con.add(jb5,BorderLayout.CENTER);
		
		
		this.setLocation(1000, 400);
		this.setSize(700, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new ExGridLayout1();
	}

}
