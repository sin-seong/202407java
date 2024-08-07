package du;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public First() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean flag = false;
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("nn");
		String ssnr = request.getParameter("ssn");
		
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from account where name =  ? and sss = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("로딩");
			conn = DriverManager.getConnection(URL,"root", "mysql");
			System.out.println("Mysql 접속 완뇨");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, ssnr);
			ResultSet re = pstmt.executeQuery();
				if(re.next()) {
					int id1 = re.getInt("id");
					String name1 = re.getString("name");
					String sss1 = re.getString("sss");
					String tel1 = re.getString("tel");
					int balance1 = re.getInt("balance");
					String str1 = String.format("%d, %s, %s, %s, %d\n", id1,name1,sss1,tel1,balance1);
					System.out.println(str1);
					LoginSesstion.id = id1;
					LoginSesstion.name = name1;
					LoginSesstion.ssn = sss1;
					LoginSesstion.tel = tel1;
					LoginSesstion.balance = balance1;
					flag = true;
					
		}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		out.print("<html>");	
		if(flag) {
		out.print("<h2>"+LoginSesstion.name+"야 왔니?</h2>");
		}else {
		out.print("<h1>곱게 가라</h1>");

		out.print("<html>");
		}
		
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
