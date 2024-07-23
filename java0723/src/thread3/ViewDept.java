package thread3;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ViewDept extends JFrame {
	JButton jb = new JButton("조회");
	JTextArea ja = new JTextArea(10,40);
	JTextField jf = new JTextField(20);
	Connection conn;
	Statement stmt;
	JFrame jfr;

	ViewDept() {
//		JPanel jp3 = new JPanel();
//		JLabel lb1 = new JLabel();
//		jp3.add(lb1);
		
//		TooTime tooTime = new TooTime();
//		tooTime.start();
		jfr = this;
		String URL = "jdbc:mysql://localhost:3307/spring5fs";	
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(URL, "root", "mysql");
				stmt = conn.createStatement();
						
		} catch (ClassNotFoundException | SQLException e2) {
			
			e2.printStackTrace();
			
		}
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.add(jf); jp1.add(jb);
		con.add(jp1, BorderLayout.NORTH);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.add(ja);
		con.add(jp2, BorderLayout.CENTER);
		
		WinTime winTime = new WinTime();
		Thread thread = new Thread(winTime);
		thread.start();
		con.add(winTime, BorderLayout.SOUTH);
		
		
		
		
		
		
//		this.setTitle("1");
		this.setBounds(1200,200,500,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				String str = jf.getText();
				String sql = String.format("select deptno,dname,loc from dept where loc like '%%%s%%'", str);
				
				try {
					ResultSet rs = stmt.executeQuery(sql);
					ja.setText("");

					boolean flag = true;
					while(rs.next()) {
						flag = false;
						int deptno = rs.getInt("deptno");
						String dname = rs.getString("dname");
						String loc = rs.getString("loc");
						ja.append(String.format("%d %s %s\n", deptno, dname, loc));
						
					}
					if(flag) {
						JOptionPane.showMessageDialog(jfr, "해당자료없습니다.", "정보", JOptionPane.QUESTION_MESSAGE);
					}
					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
					
				}
				}
				
				
		});
	}
	
	
	
	
	public static void main(String[] ar) {
		new ViewDept();
		
		
	}
	class Mypanel extends JPanel{
		JLabel lb1;
		Mypanel(){
		lb1 = new JLabel("2");
		this.add(lb1);
	}

	
	
	
					}
	class WinTime extends JPanel implements Runnable{
		JLabel lb1;
		
		public WinTime() {
			lb1 = new JLabel("테스트");
			this.add(lb1);
			
		}

		@Override
		public void run() {
			JFrame frame = new JFrame();
			Mypanel mypanel = new Mypanel();
				for (;;) {
					LocalTime localTime = LocalTime.now();
					String str = String.format("%d:%d:%d\n", 
							 localTime.getHour(), localTime.getMinute(), localTime.getSecond());
//					ViewDept.this.setTitle(str);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
		}
		
	}
}
}


