package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex5_dept2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("dept테이블에 넣을 데이터를 입력:>>");
		String input = sc.nextLine();
		String sql = "insert into dept(deptno, dname, loc) value(" + input +")";
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("Mysql 접속 성공!");
			stmt = con.createStatement();
			int num = stmt.executeUpdate(sql);
			System.out.println("테이블 삽입! "+ num);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}