package java0724;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex2 {
	public static void main(String[] ar) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into dept(deptno, dname, loc) value (?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println();
		conn = DriverManager.getConnection(URL,"root", "mysql");
		System.out.println("Mysql 접속 완뇨");
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(2,"클린부");
		pstmt.setString(3,"파멜리아");
		pstmt.setInt(1, 1132);
		int ret = pstmt.executeUpdate();
		System.out.println(ret+"건 insert 성공");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}	
