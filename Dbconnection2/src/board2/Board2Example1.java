package board2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Board2Example1 {

	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	private PreparedStatement pstmt;
	
	// db 연결변수
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private String user = "c##mydb";
	private String password = "pwmydb";
	
	public Board2Example1() {
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println("디비 연결 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}

	public void list() {
		System.out.println();
		System.out.println("[게시글 목록]");
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("%-4s%-12s%-20s%-20s%-20s \n", "no", "writer", "date", "title", "content");
		System.out.println("-----------------------------------------------------------------------");

		// DB board2 테이블의 모든 게시글 가져오기
		try {
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM board2 ORDER BY bno DESC ";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {		// 게시글이 있으면 계속 불러오기
				Board2 board = new Board2();
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				
				// 게시글 전체 출력
				System.out.printf("%-4s%-12s%-20s%-20s%-20s \n",
						board.getBno(), board.getBwriter(), board.getBdate(),
						board.getBtitle(), board.getBcontent()
						);
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		mainMenu();
		
	}

	// 생성하기
	public void create() {
		Board2 board = new Board2();
		System.out.println("[새 게시물 입력]");
		
		System.out.println("제목을 입력하세요: ");
		String title = scanner.nextLine();
		board.setBtitle(title);
		
		System.out.println("내용을 입력하세요: ");
		String content = scanner.nextLine();
		board.setBcontent(content);
		
		System.out.println("작성자를 입력하세요: ");
		String writer = scanner.nextLine();
		board.setBwriter(writer);
		
		// db 작업하기
		try {
			String sql = "INSERT INTO board2(bno, btitle, bcontent, bwriter)"
					+ "VALUES (seq2.NEXTVAL, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			//sql 실행
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		list();
	}
	
	// 읽기
	public void read() {
		
		System.out.println("[게시물 읽기]");
		thumbnail();
		System.out.println("글 번호를 입력하세요: ");
		int bno = Integer.parseInt(scanner.nextLine());
		
		// db 작업하기
		try {
			String sql = "SELECT * FROM board2 WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			// 쿼리 실행
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Board2 board = new Board2();
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				
				// 콘솔출력
				System.out.println("*********************************");
				System.out.println("번호: " + board.getBno());
				System.out.println("제목: " + board.getBtitle());
				System.out.println("내용: " + board.getBcontent());
				System.out.println("작성자: " + board.getBwriter());
				System.out.println("작성일: " + board.getBdate());
				System.out.println("*********************************");

				// 글 수정, 삭제, 목록
				System.out.println("1. 글 수정 | 2. 글 삭제 | 3. 글 목록");
				System.out.println("메뉴 번호를 입력하세요(1~3): ");
				String menuNo = scanner.nextLine();
				
				if(menuNo.equals("1")) {
					update(board);
				}else if(menuNo.equals("2")) {
					delete(board);
				}
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		list();
	}
	
	public void update(Board2 board) {
		System.out.println("[수정할 내용]");
		System.out.println("수정 할 제목을 입력하세요: ");
		String title = scanner.nextLine();
		board.setBtitle(title);
		
		System.out.println("수정 할 내용을 입력하세요: ");
		String content = scanner.nextLine();
		board.setBtitle(content);
		
		System.out.println("수정 할 작성자를 입력하세요: ");
		String writer = scanner.nextLine();
		board.setBwriter(writer);
		
		// db 작업하기
		try {
			String sql = "UPDATE board2 SET btitle = ?, bcontent = ?, bwriter = ? "
					+ "WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.setInt(4, board.getBno());
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}

	}
	
	public void delete(Board2 board) {
		System.out.println("정말로 삭제 하시겠습니까?");
		System.out.println("1. OK | 2. Cancel");
		System.out.println("실행 할 번호를 입력하세요: ");
		
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = "DELETE FROM board2 WHERE bno = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, board.getBno());
				
				pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
			
		}
	}
	
	// 전체 삭제(테이블은 유지)
	public void clear() {
		System.out.println("[전체 게시글 삭제]");
		System.out.println("=========================================");
		
		System.out.println("정말로 삭제 하시겠습니까?");
		System.out.println("1. OK | 2. Cancel");
		System.out.println("실행 할 번호를 입력하세요: ");
		
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			// db 작업하기
			try {
				String sql = "TRUNCATE TABLE board2";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.executeUpdate();
				
				// 시퀀스 초기화
				sql = "DROP SEQUENCE seq2";
				pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				
				sql = "CREATE SEQUENCE seq2 NOCACHE";
				pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}
	
	public void thumbnail() {
		System.out.println("[썸 네일]");
		System.out.println("--------------------------------------------------------------------------");
		System.out.printf("%-4s%-20s \n", "no", "title");
		System.out.println("--------------------------------------------------------------------------");
		
		// db 글 번호, 제목만 가져오기
		try {
			String thumbsql = "SELECT bno, btitle FROM board2 ORDER BY bno DESC ";
			pstmt = conn.prepareStatement(thumbsql);
			ResultSet thumbrs = pstmt.executeQuery();
			while(thumbrs.next()) {
				Board2 board = new Board2();
				board.setBno(thumbrs.getInt("bno"));
				board.setBwriter(thumbrs.getString("bwriter"));
				
				System.out.printf("%-4s%-20s \n",
						board.getBno(),
						board.getBtitle());
			}
			thumbrs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
	}

	// 종료
	public void exit() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("*** 게시판을 종료합니다 ***");
		System.exit(0);
	}
	
	public void mainMenu() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("1. Create | 2. Read | 3. Clear | 4. Exit");
		System.out.print("실행할 목록의 번호를 입력하세요(1~4): ");
		
		String menuNo = scanner.nextLine();
		
		switch(menuNo){
		case "1":
			create(); break;
		case "2":
			read() ; break;
		case "3":
			clear(); break;
		case "4":
			exit(); break;
		}
		
	}
		
	public static void main(String[] args) {
		Board2Example1 board1 = new Board2Example1();
		board1.list();
	}

}
