package du;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginTest {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = "select * from account where name = like ?, and sss = ?";
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("로딩");
			conn = DriverManager.getConnection(URL,"root", "mysql");
			System.out.println("Mysql 접속 완뇨");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "김사부");
			pstmt.setString(2, "976431");
			ResultSet re = pstmt.executeQuery();
			if(re.next()) {
				int id = re.getInt("id");
				String name = re.getString("name");
				String sss = re.getString("sss");
				String tel = re.getString("tel");
				int balance = re.getInt("balance");
				String str = String.format("%d, %s, %s, %s, %d\n", id,name,sss,tel,balance);
				System.out.println(str);
			}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}


