package java0724;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex3 {
	public static void main(String[] ar) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from dept where loc like ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println();
		conn = DriverManager.getConnection(URL,"root", "mysql");
		System.out.println("Mysql 접속 완뇨");
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "서울");
		ResultSet re = pstmt.executeQuery();
		while(re.next()) {
			int deptno = re.getInt("deptno");
			String dname = re.getString("dname");
			String loc = re.getString("loc");
			System.out.printf("%d, %s, %s\n", deptno, dname, loc);
		}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}	
