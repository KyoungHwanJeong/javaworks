package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserSelectAllTest {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost/xe",
					"c##mydb",
					"pwmydb");
			
			String sql = "SELECT userid, username, userpassword, userage, useremail FROM users_2";
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			List<User> userList = new ArrayList<>();
			
			while(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("usermail"));
				userList.add(user);
			}
			
			for(int i = 0; i<userList.size(); i++) {
				User user = userList.get(i);
				
				System.out.println("userId = " + user.getUserId());
				System.out.println("username = " + user.getUserName());
				System.out.println("userpassword = " + user.getUserPassword());
				System.out.println("userage = " + user.getUserAge());
				System.out.println("useremail = " + user.getUserEmail());
				System.out.println("=========================================");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
