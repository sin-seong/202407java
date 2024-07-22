import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
//		String sql = "select * from dept where loc='화성'";
		System.out.print("부서번호:");
		String bno = sc.nextLine();
		System.out.print("부서명:");
		String bna = sc.nextLine();
		System.out.print("지역입력:");
		String bloc = sc.nextLine();
		
		String sql = String.format("insert into dept(deptno, dname, loc) values ('%s','%s','%s')",
				bno,bna,bloc);
		System.out.println(sql);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속 성공!!");
			stmt = conn.createStatement();
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건을입력");
			
		
				
			
				
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}