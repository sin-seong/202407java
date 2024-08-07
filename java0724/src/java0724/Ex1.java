package java0724;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex1 {
	public static void main(String[] ar) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update dpet set dname = ?, loc = ? where deptno = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println();
		conn = DriverManager.getConnection(URL,"root", "mysql");
		System.out.println("Mysql 접속 완뇨");
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "텔이라부");
		pstmt.setString(2, "엘리니아");
		pstmt.setInt(3, 1026);
		int ret = pstmt.executeUpdate();
		System.out.println(ret+"건 update 성공");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}	
