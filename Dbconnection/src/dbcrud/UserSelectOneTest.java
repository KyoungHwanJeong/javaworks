package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.User;

public class UserSelectOneTest {

	public static void main(String[] args) {

		Connection conn = null;			// 네트워크 연결 인터페이스
		PreparedStatement pstmt = null;	// sql 처리 인터페이스
		try {
			// JDBC 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기
			// getConnection(url, user, password) - (호스트이름 + 포트 + SID, 사용자이름, 패스워드)
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",	// oracle 의 thin 드라이버를 활용
					"c##mydb", 
					"pwmydb");
			System.out.println("연결 성공!");
			
			// db 처리 작업
			// 매개 변수화된 sql문 작성 - 동적 바인딩
			String sql = "SELECT * FROM users WHERE userid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "today");
			
			// sql 실행 - 검색
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {		// 검색한 데이터가 있으면(찾았으면) db에서 userid를 꺼내옴(칼럼은 소문자이다)
				// db에서 userid(칼럼은 소문자)를 꺼내옴
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("userEmail"));
				
				// 객체의 정보를 문자열로 출력함.
				//System.out.println(user);
				
				/*
				String userId = rs.getString("userid");
				String userName = rs.getString("username");
				String userPassword = rs.getString("userpassword");
				int userAge = rs.getInt("userage");					// int형 자료
				String userEmail = rs.getString("useremail");
				*/
			
				System.out.println("userId = " + user.getUserId());
				System.out.println("userName = " + user.getUserName());
				System.out.println("userPassword = " + user.getUserPassword());
				System.out.println("userage = " + user.getUserAge());
				System.out.println("useremail = " + user.getUserEmail());
			
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			rs.close();
			pstmt.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	// 반드시 수행되는 구간
			if(conn != null) {	// 연결이 되어 있다면 연결 끊기
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
