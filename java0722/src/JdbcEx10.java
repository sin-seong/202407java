import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;





public class JdbcEx10 {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("테이블 이름 입력>>");
		String str = sc.nextLine();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속 성공!!");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM " + str);
			ResultSetMetaData rsmd = rs.getMetaData();
			int numOfo1 = rsmd.getColumnCount();
			System.out.println(numOfo1);
			for(int i= 1;i <= numOfo1; i++) {
				System.out.println(rsmd.getColumnName(i));
			}

//			while(rs.next()) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//				System.out.printf("%d %s %s\n", deptno, dname, loc);
//				}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}