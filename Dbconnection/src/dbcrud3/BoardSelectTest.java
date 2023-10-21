package dbcrud3;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Board;

public class BoardSelectTest {

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
			String sql = "SELECT * FROM boards WHERE bwriter = ? ORDER BY bno DESC";
			pstmt = conn.prepareStatement(sql);			// SQL 객체를 처리하기 위한 인터페이스
														// SQL Update는 Create, Read, Update, Delete 역할
			pstmt.setString(1, "sky123");
			// sql 실행
			ResultSet rs = pstmt.executeQuery();		// SQL SELECT 역할.
			List<Board> boardList = new ArrayList<>();
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfileName(rs.getString("bfilename"));
				board.setBfileData(rs.getBlob("bfiledata"));
				boardList.add(board);
				
			}
			// boardList 출력
			for(Board board : boardList) {
				System.out.println(board);
			}
			rs.close();
			pstmt.close();
			
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
