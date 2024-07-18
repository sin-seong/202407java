package project2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Myframe extends JFrame{
	JLabel la1 = new JLabel("아이디");
	JLabel la2 = new JLabel("SSN");
	JLabel la3 = new JLabel("전화번호/금액:");
	JTextField jf1 = new JTextField(5);
	JTextField jf2 = new JTextField(5);
	JTextField jf3 = new JTextField(15);
	JTextArea ta = new JTextArea(10,200);
	JButton jb1 = new JButton("로귄");
	JButton jb2 = new JButton("회원가입");
	JButton jb3 = new JButton("예금");
	JButton jb4 = new JButton("출금");
	JButton jb5 = new JButton("잔고");
	
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
		
		ta.setText("총회원수:"+list.size());
		Member member = null;


		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
//		JPanel jp6 = new JPanel();
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(jp1,BorderLayout.NORTH);
		jp1.setLayout(new BorderLayout());
		jp1.add(jp2,BorderLayout.WEST);
		jp2.setLayout(new BorderLayout());
		jp2.add(jp3, BorderLayout.CENTER);
		jp3.setLayout(new FlowLayout());
		jp3.add(la1); jp3.add(jf1); jp3.add(la2);jp3.add(jf2);jp3.add(la3);jp3.add(jf3);
		
		
		con.add(ta,BorderLayout.CENTER);
//		jp6.add(ta);
		
		con.add(jp4, BorderLayout.SOUTH);
		jp4.setLayout(new BorderLayout());
		jp4.add(jp5, BorderLayout.WEST);
		jp5.setLayout(new FlowLayout());
		jp5.add(jb1);jp5.add(jb2);jp5.add(jb3);jp5.add(jb4);jp5.add(jb5);
		jb1.addActionListener(new MyListener());
		jb2.addActionListener(new MyListener());
		jb3.addActionListener(new MyListener());
		jb4.addActionListener(new MyListener());
		jb5.addActionListener(new MyListener());
		
		
		this.setBounds(1200,100,500,300);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addWindowListener(new JFrameWindowClosingEventHandler());
	}
	class JFrameWindowClosingEventHandler extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			
			Member[] list2 = list.toArray(new Member[list.size()]);//Array리스트를 배열로 
			try (FileOutputStream fos = new FileOutputStream("c:\\temp\\members.dat");
		             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				
				 oos.writeObject(list2);
		         System.out.println("객체를 파일에 저장했습니다.");
				
				
			} catch (IOException e1) {
				e1.printStackTrace();
			
			JFrame frame = (JFrame)e.getWindow();
			frame.dispose();
			System.out.println("windowClosing()");
		}
		
}	
		}
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ta.setText(e.getActionCommand());
			switch (e.getActionCommand()) {
			case "로귄": {
				String name = jf1.getText(); // name 변수의 값 입
				String strPassword = jf2.getText();//패스워드입력
				
				
				for (Member member2 : list) {
					if (member2.getName().equals(name) && member2.getSsn().equals(strPassword)) {
						Myframe.this.member = member2;
						
						
					}
									}
				if (member != null) {
					ta.setText("로그인 성공");
	            } else {
	            	ta.setText ("로그인 실패: 아이디 또는 패스워드가 틀립니다.");
	            }
				jf1.setText("");
                jf2.setText("");
                
                break;
				
			}
			case "회원가입":{
				String name2 = jf1.getText();
	   			String ssn = jf2.getText();
	   			String tel = jf3.getText();
	   			Member newMember = new Member(name2, ssn, tel);
	   			 list.add(newMember);
	   			ta.setText("회원 추가 완료: " + newMember.getName());
	   			
	   			jf1.setText("");
                jf2.setText("");
                jf3.setText("");
              
	   			break;
				
	            }
			case "예금":{
				if(member != null) {
					String dep = jf3.getText();
					try {
						int depiz = Integer.parseInt(dep);
						member.deposit(depiz);
						ta.setText(member.getName()+"님의 예금이 완료됨");
						jf3.setText("");
					}catch(NumberFormatException ex) {
						ta.setText("금액란에 올바른 금액 입력해주세요");
						
					}
				}else {
					ta.setText("로그인후 예금가능합니다");
				}
			
				break;
			}
			case "출금":{
				String whi = jf3.getText();
					int whitz = Integer.parseInt(whi);
					member.whithdraw(whitz);
					ta.setText(member.getName()+"님의 출금이 완료됨");
					jf3.setText("");
					break;
				
			}
				
			case "잔고":{
				ta.setText(member.getName()+"님의 잔고는"+ member.getBalance()+"원 입니다");
				break;
			}
			}
		}
			
	}
	public static void main(String[] ar) {
			new Myframe();
		}}



















