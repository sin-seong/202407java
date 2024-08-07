import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
	
		
		String sql2 = "select max(deptno) as max from dept";
		System.out.print("부서명:");
		String bna = sc.nextLine();
		System.out.print("지역입력:");
		String bloc = sc.nextLine();
		
		String sql = null;
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속 성공!!");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql2);
			rs.next();
			int maxno = rs.getInt("max");
			System.out.println(maxno);
			
			sql = String.format("insert into dept(deptno, dname, loc) values ('%s','%s','%s')",
					maxno+1,bna,bloc);
			
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건을입력");
			
				
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}