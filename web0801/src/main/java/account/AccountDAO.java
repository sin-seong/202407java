package account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import account.AccountDTO;
import account.AccountDTO;
import util.JDBCUtil;

public class AccountDAO {

	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String ACC_LIST= "select * from account";
	private String ACC_ONE = "select * from board where name =?";
	private String ACC_INSERT = "insert into account(name, sss, tel, balance) values(?,?,?,0)";
	private String ACC_COUNT = "select count(*) as cnt from account where name = ? and sss= ?";
	
	public boolean checkLogin(String name, String sss) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACC_COUNT);
			stmt.setString(1, name);
			stmt.setString(2, sss);
			rs = stmt.executeQuery();
			rs.next();
			
			if(rs.getInt("cnt") == 1) {
				return true;//로그인 성공
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return false;// 로귄 실패
	}

	public void regAcc(AccountDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.prepareStatement(ACC_INSERT);
			stmt.setString(1, dto.getname());
			stmt.setString(2, dto.getsss());
			stmt.setString(3, dto.gettel());
			stmt.executeUpdate();	
			} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
}


