package project2_Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class Myframe extends JFrame {
//	JLabel lb1 =new JLabel("아이디");
//	JTextField jt1 = new JTextField();
//	
//	JLabel lb2 =new JLabel("비번");
//	JTextField jt2 = new JTextField();
	
	JLabel lb3 =new JLabel("아이디");
	JTextField jt3 = new JTextField();
	
	JLabel lb4 =new JLabel("비번");
	JTextField jt4 = new JTextField();

	JLabel lb5 =new JLabel("전번");
	JTextField jt5 = new JTextField();
	
	
	
	
	JButton jb1 =new JButton("로귄");
	JButton jb2 =new JButton("회갑");
	JButton jb3 =new JButton("예금");
	JButton jb4=new JButton("출금");
	JButton jb5 =new JButton("잔고");
	
	JTextArea ta = new JTextArea();		
	List<Member>list = null;
	public Member member;
	public Myframe() {
		
		
		try (FileInputStream fis = new FileInputStream("c:\\temp\\members.dat");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
			Member[] list2 = (Member[]) ois.readObject();
			
			list = new ArrayList<>(Arrays.asList(list2));
			System.out.println("파일에서 객체를 가져왔습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		for (Member member : list) {
					System.out.println(member);
			
			}
		
		System.out.println("총회원수:"+list.size());
		Member member = null;
		
		Container con = this.getContentPane();
		con.setLayout(null);
		
//		con.add(lb1);
//		lb1.setLocation(20, 10);
//		lb1.setSize(100,30);
//		
//		con.add(jt1);
//		jt1.setLocation(70, 10);
//		jt1.setSize(100, 30);
//		
//		con.add(lb2);
//		lb2.setLocation(180, 10);
//		lb2.setSize(100,30);
//		
//		con.add(jt2);
//		jt2.setLocation(240, 10);
//		jt2.setSize(100, 30);
		
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
		jb2.addActionListener(new MyListener());
		
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
	
	class MyListener implements ActionListener{//<< 다른버튼쓰려곤 2?로 만들어

		@Override
		public void actionPerformed(ActionEvent e) {
			if(jb1 == (JButton)e.getSource()){
		
				String name = jt3.getText(); // name 변수의 값 입
				String strPassword = jt4.getText();//패스워드입력
				
				
				for (Member member2 : list) {
					if (member2.getName().equals(name) && member2.getSsn().equals(strPassword)) {
						Myframe.this.member = member2;
						
						break;
					}
				}
				if (member != null) {
	                System.out.println("로그인 성공");
	            } else {
	                System.out.println("로그인 실패: 아이디 또는 패스워드가 틀립니다.");
	            }
				
				
				
		}else if (jb2 == (JButton)e.getSource())	{
			String name2 = jt3.getText();
			String ssn = jt4.getText();
			String tel = jt5.getText();
			Member newMember = new Member(name2, ssn, tel);
			 list.add(newMember);
			 System.out.println("회원 추가 완료: " + newMember.getName());
		}
	}
			
	}
	
	
	
	public static void main(String[] args) {
		new Myframe();
	}
	}
	


	
