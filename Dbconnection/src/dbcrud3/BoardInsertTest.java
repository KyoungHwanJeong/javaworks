package dbcrud3;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardInsertTest {

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
			String sql = "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) "
					+ "VALUES (seq_bno.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			// ? 값 지정
			pstmt.setString(1, "notebook2");
			pstmt.setString(2, "LG 그램 노트북2");
			pstmt.setString(3, "sky123");
			
			// 사진 첨부한 경우
			//pstmt.setString(4, "notebook.PNG");
			//pstmt.setBlob(5, new FileInputStream("src/dbcrud2/notebook.PNG"));
			// 사진 미첨부인 경우
			pstmt.setString(4, null);
			Blob blob = null;
			pstmt.setBlob(5, blob);
			
			// sql 실행
			int rows = pstmt.executeUpdate();	// INSERT, UPDATE, DELETE 할 때 반드시 씀
			System.out.println("저장된 행의 수: " + rows);
			// auto commit이 된다
			
			
		} catch (Exception e) {
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
