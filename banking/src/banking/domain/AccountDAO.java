package banking.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.common.JDBCUtil;

// Account를 생성, 조회, 수정, 삭제하는 클래스
// DAO - Data Access Object
public class AccountDAO {
	
	Connection conn;		// db 연결 객체 선언
	PreparedStatement pstmt; // sql 처리 객체
	Scanner scanner = new Scanner(System.in);
	ResultSet rs;
	
	
	
	public void creatAccount() {
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("--------------------------------------------------------------------");
		
		while(true) {
			
			System.out.print("계좌 번호(00-00-000)를 입력하세요.(메뉴로 돌아가려면 N 또는 n을 입력하세요): ");
			String ano= scanner.nextLine();
			if(ano.toLowerCase().equals("n")) {
				break;
			}
			String regExp = "(\\d{2}-\\d{2}-\\d{3})";
			boolean result = Pattern.matches(regExp, ano);
			if(result == false) {
				System.out.println("계좌번호 형식이 아닙니다. 다시 입력해주세요.");

			}else {
				// 중복 계좌가 있는지 체킹
				if(findAccount(ano)!=null) {	// 중복 계좌가 있으면
					System.out.println("이미 등록된 계좌 입니다. 다시 입력해주세요.");
				}	// 중복 계좌가 없으면
				else {
					while(true) {
						System.out.print("계좌 주를 입력하세요(한글, 영문): ");
						String owner = scanner.nextLine();
						
						String regExp2 = "([a-zA-Zㄱ-ㅎ가-힣]+)";			// 영어, 한글만
						boolean result2 = Pattern.matches(regExp2, owner);
						if(result2 == false) {
							System.out.println("계좌 주는 한글과 영문만 가능합니다. 다시 입력해주세요.");

						}else {
							
							System.out.print("초기 입금액을 입력하세요: ");
							
							// 숫자를 먼저 문자로 입력 받기.
							int balance = Integer.parseInt(scanner.nextLine());
							
							while(true) {
								System.out.println("생성하려는 계좌의 계좌번호: " + ano + ", 계좌 주: " + owner 
										+ ", 초기 입금액: " + balance + "원이 맞습니까?");
								System.out.println("(맞으면 Y 또는 y 틀리면 N 또는 n를 입력하세요.)");
								
								String sign = scanner.nextLine();
								
								if(sign.toLowerCase().equals("y")) {
									
									// db 작업
									try {
										conn = JDBCUtil.getConnection();
										String sql = "INSERT INTO account(ano, owner, balance) VALUES (?, ?, ?)";
										pstmt = conn.prepareStatement(sql);
										// 값 설정
										pstmt.setString(1, ano);
										pstmt.setString(2, owner);
										pstmt.setInt(3, balance);
										
										// sql 실행
										pstmt.executeUpdate();
										System.out.println("계좌가 생성되었습니다.");

									} catch (SQLException e) {
										e.printStackTrace();
									} finally {
										JDBCUtil.close(conn, pstmt);
									}
					
									break;
								}else if(sign.toLowerCase().equals("n")) {
									System.out.println("계좌 생성이 취소 되었습니다.");
									break;
								}else {
									System.out.println("잘못된 문자를 입력하였습니다.");
								}

							} // 안쪽 while끝
							break;
						}	
					}
					break;
				}
			}
			
		} // 바깥쪽 while 끝
	}// creatAccount() 끝
	
	
	// 계좌 목록
	public void getAccountList() {
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("--------------------------------------------------------------------");
		
		
		// db 작업
		// 계좌를 저장할 어레이 리스트 생성
		List<Account> accountList = new ArrayList<>();
		
		try {
			conn = JDBCUtil.getConnection(); // db연결
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			// 검색 처리
			rs = pstmt.executeQuery();
			while (rs.next()) {	// 다음 데이터가 있는 동안 반복
				// account 객체
				String ano = rs.getString("ano");	// db에서 가져온 ano
				String owner = rs.getString("owner");	// db에서 가져온 owner
				int balance= rs.getInt("balance");	// db에서 가져온 balance
				
				Account account = new Account(ano, owner, balance);		
				accountList.add(account);		// 계좌를 리스트에 저장
				
			}
			
			// 계좌 목록 조회
			for(int i=0; i<accountList.size();i++) {
				Account account = accountList.get(i);
				System.out.print("계좌 번호: " + account.getAno() + "\t");
				System.out.print("계좌 주: " + account.getOwner() + "\t");
				System.out.print("잔고:" + account.getBalance() + "\t");
				System.out.println();

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
	}
	
	// 입금
	public void deposit() {
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("입금");
		System.out.println("--------------------------------------------------------------------");

		while(true) {	// 계좌 번호 재입력
			System.out.print("입금 계좌 번호(00-00-000)를 입력하세요.(메뉴로 돌아가려면 N 또는 n을 입력하세요): ");
			String ano = scanner.nextLine();
			
			if(ano.toLowerCase().equals("n")) {
				break;
			}
			
			if(findAccount(ano)==null) {	// 중복 계좌가 없으면
				System.out.println("잘못된 계좌 입니다. 다시 입력해주세요.");
			}else {
				System.out.print("입금액을 입력하세요: ");
				Account account = findAccount(ano);
				int money = Integer.parseInt(scanner.nextLine());
				int balance = account.getBalance() + money;
				String owner = account.getOwner();
				
				while(true) {
					System.out.println("입금하려는 계좌의 계좌번호: " + ano + ", 계좌주: " + owner
							+ ", 입금액: " + money + "원이 맞습니까?");
					System.out.println("(맞으면 Y 또는 y 틀리면 N 또는 n를 입력하세요.)");

					String sign = scanner.nextLine();
					
					if(sign.toLowerCase().equals("y")) {
						if(findAccount(ano)!=null) {
							
							try {	
								conn = JDBCUtil.getConnection();
								String sql = "UPDATE account SET balance = ? WHERE ano = ?";
								pstmt = conn.prepareStatement(sql);
										
								pstmt.setInt(1, balance);
								pstmt.setString(2, ano);			
								
								// sql 실행
								pstmt.executeUpdate();
								System.out.println("결과: 정상 처리 되었습니다.");
								break;				
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}else if(sign.toLowerCase().equals("n")) {
						System.out.println("입금이 취소 되었습니다.");
						break;
					}else {
						System.out.println("잘못된 문자를 입력하였습니다.");
					}
					
				}
				break;
			}
			
			
		}
	}
	
	// 출금
	public void withdraw() {
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("출금");
		System.out.println("--------------------------------------------------------------------");

		while(true) {	// 계좌 번호 재입력
			System.out.print("출금 계좌 번호(00-00-000)를 입력하세요.(메뉴로 돌아가려면 N 또는 n을 입력하세요): ");
			String ano = scanner.nextLine();
			
			if(ano.toLowerCase().equals("n")) {
				break;
			}
			
			if(findAccount(ano) != null) {	// 중복 계좌가 있으면
				
				Account account = findAccount(ano);
				System.out.print("출금액을 입력하세요: ");

				int money = Integer.parseInt(scanner.nextLine());
				int balance = account.getBalance() - money;
				String owner = account.getOwner();


				while(true) {
					System.out.println("출금하려는 계좌의 계좌번호: " + ano + ", 계좌주: " + owner
							+ ", 출금액: " + money + "원이 맞습니까?");
					System.out.println("(맞으면 Y 또는 y 틀리면 N 또는 n를 입력하세요.)");

					String sign = scanner.nextLine();
					if(sign.toLowerCase().equals("y")) {
						if(money > account.getBalance()) {	// 출금액이 잔고보다 많으면
							System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
							
						}else {
							try {
								conn = JDBCUtil.getConnection();
								String sql = "UPDATE account SET balance = ? WHERE ano = ?";
								pstmt = conn.prepareStatement(sql);
								
								pstmt.setInt(1, balance);
								pstmt.setString(2, ano);
								
								pstmt.executeUpdate();
								System.out.println("결과: 정상 처리 되었습니다.");
								break;
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
						
					}else if(sign.toLowerCase().equals("n")) {
						System.out.println("출금이 취소 되었습니다.");
						break;
					}else {
						System.out.println("잘못된 문자를 입력하였습니다.");
					}
				}
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 계좌 삭제
	public void removeAccount() {
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("계좌 삭제");
		System.out.println("--------------------------------------------------------------------");

		while(true) {
			System.out.println("삭제할 계좌의 계좌 번호(00-00-000)를 입력하세요.(메뉴로 돌아가려면 N 또는 n을 입력하세요)");
			String ano2= scanner.nextLine();
			
			if(ano2.toLowerCase().equals("n")) {
				break;
			}
			if(findAccount(ano2) != null) {
				while(true) {
					Account account = findAccount(ano2);
					String owner = account.getOwner();
					System.out.println("삭제하려는 계좌의 계좌 번호: " + ano2 + ", 계좌 주: "+ owner + " 이(/가) 맞습니까?(맞으면 Y 또는 y 틀리면 N 또는 n를 입력하세요.)");

					String sign = scanner.nextLine();
					
					if(sign.toLowerCase().equals("y")) {
						
						try {
							conn = JDBCUtil.getConnection();
							String sql = "DELETE account WHERE ano = ?";
							pstmt = conn.prepareStatement(sql);
							
							pstmt.setString(1, ano2);
							// sql 생성
							pstmt.executeUpdate();
							System.out.println("계좌가 삭제 되었습니다.");
							break;			
						} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							JDBCUtil.close(conn, pstmt);
						}
					}else if(sign.toLowerCase().equals("n")) {
						System.out.println("삭제가 취소되었습니다.");
						break;
					}else {
						System.out.println("잘못된 문자를 입력하셨습니다.");
					}
				}
				break;
			}else {
				System.out.println("삭제 할 계좌가 없거나 잘못된 문자를 입력하셨습니다.");
			}
		}
	}
	
	// 특정 계좌를 검색
	public void selectAccount() {
		// 계좌 번호와 일치하는 계좌 검색.
		System.out.println("--------------------------------------------------------------------");
		System.out.println("계좌 검색");
		System.out.println("--------------------------------------------------------------------");

		while(true) {
			System.out.println("검색할 계좌의 계좌 번호(00-00-000)를 입력하세요.(메뉴로 돌아가려면 N 또는 n을 입력하세요): ");
			String ano3=scanner.nextLine();
			
			if(ano3.toLowerCase().equals("n")) {
				break;
			}
			
			if(findAccount(ano3) != null) {
				while(true){
					Account account = findAccount(ano3);
					System.out.println("검색 계좌 번호가 " +ano3 + " 이(/가) 맞습니까?(맞으면 Y 또는 y 틀리면 N 또는 n를 입력하세요.)");
					
					String sign = scanner.nextLine();
					String owner = account.getOwner();
					Integer balance = account.getBalance();
					
					if(sign.toLowerCase().equals("y")) {
						System.out.println("--------------------------------------------------------------------");
						System.out.println("계좌가 검색되었습니다.");
						System.out.println("--------------------------------------------------------------------");
						
						System.out.print("계좌 번호: " + account.getAno() + "\t");
						System.out.print("계좌 주: " + account.getOwner() + "\t");
						System.out.print("잔고:" + account.getBalance() + "\t\n");
						break;
						
					}else if(sign.toLowerCase().equals("n")) {
						System.out.println("검색이 취소되었습니다.");
						break;
					}else {
						System.out.println("잘못된 문자를 입력하셨습니다.");
					}
				}
				break;
			}else {
				System.out.println("검색 할 계좌가 없거나 잘못된 문자를 입력하셨습니다.");
			}
		}
	}
	
	// 계좌 검색
	public Account findAccount(String ano) {
		Account account = null;
		
		// db 처리
		
		try {
			conn = JDBCUtil .getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			// 1개 검색 처리
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");	// db에서 가져온 ano
				String owner = rs.getString("owner");	// db에서 가져온 owner
				int balance= rs.getInt("balance");	// db에서 가져온 balance
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return account;
	}
	

}
