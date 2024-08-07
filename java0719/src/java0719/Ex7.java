package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dept테이블에 넣을 데이터를 입력:");
		String input = sc.nextLine();
		String sql = "INSERT INTO `emp` (" + input +")"; 
		
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("Mysql 접속 성공!");
			stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//			while(rs.next()) {
//				System.out.print(rs.getString("customer_id")+", ");
//				System.out.println(rs.getString("customer_name"));
//				System.out.print(rs.getString(1)+",");
//				System.out.print(rs.getString(2)+",");
//				System.out.println(rs.getString(3));
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}