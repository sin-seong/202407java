package swingjdbc;

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

import javax.swing.JButton;
import javax.swing.JFrame;
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
		jfr = this;
		String URL = "jdbc:mysql://localhost:3307/spring5fs";	
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(URL, "root", "mysql");
				stmt = conn.createStatement();
						
		} catch (ClassNotFoundException | SQLException e2) {
			// TODO Auto-generated catch block
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
		
		this.setTitle("View dept 테이블");
		this.setBounds(1200,200,500,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				
//				String sql = "select * from dept where loc = '%s'",str;
				String str = jf.getText();
				String sql = String.format("select deptno,dname,loc from dept where loc like '%%%s%%'", str);
				
				try {
					ResultSet rs = stmt.executeQuery(sql);
					ja.setText("");
					if(!rs.next()) {
						JOptionPane.showMessageDialog(jfr, "해당자료없습니다.", "정보", JOptionPane.QUESTION_MESSAGE);
					}
					while(rs.next()) {
						int deptno = rs.getInt("deptno");
						String dname = rs.getString("dname");
						String loc = rs.getString("loc");
						ja.append(String.format("%d %s %s\n", deptno, dname, loc));
						
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
}
