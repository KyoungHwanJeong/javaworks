package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertTest {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",
					"c##mydb",
					"pwmydb");
			System.out.println("연결 성공");
			
			String sql = "INSERT INTO users_2(userid, username, userpassword, userage, useremail) "
					+ "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "cloud2");
			pstmt.setString(2, "김구름");
			pstmt.setString(3, "u12345");
			pstmt.setInt(4, 38);
			pstmt.setString(5, "cloud2@cloud.com");
			
			// sql 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장 된 행의 수: " + rows);
					
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null){
				try {
					conn.close();
					System.out.println("연결 끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
