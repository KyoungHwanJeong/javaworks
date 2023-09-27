package banking.arraylist2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.array.Account;

public class BankArrayList {
	
	//통장 계좌를 저장할 자료 구조의 객체 생성
	static List<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

boolean sw = true;
		
		while(sw) {
			try {
				System.out.println("========================================================");
				System.out.println("1.계좌 생성 | 2.계좌 목록 |3.예금 | 4.출금 | 5.계좌 삭제 | 6.종료");
				System.out.println("========================================================");
				System.out.println("선택>");
				
				// 메뉴 선택
				int selectNo= Integer.parseInt(scanner.nextLine());
				
				if(selectNo==1) {
					creatAccount();		//계좌 생성
				}else if(selectNo==2) {
					getAccountList();	//계좌 목록
				}else if(selectNo==3) {
					deposit();			//입금
				}else if(selectNo==4) {
					withdraw();			//출금
				}else if(selectNo==5) {
					removeAccount();
				}else if(selectNo==6) {
					sw = false;
				}else{
					System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
				}
			}catch(NumberFormatException e) {
				//e.printStackTrace();
				System.out.println("올바른 숫자를 입력해주세요.");
			}

		}//while 끝

		System.out.println("프로그램을 종료합니다.");
		scanner.close();
		
		
	}// main
	
	private static void creatAccount() {

		System.out.println("------------------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("------------------------------------------------");
		
		
		while(true) {
		
			System.out.print("계좌 번호(00-00-000)를 입력하세요: ");
			String ano= scanner.nextLine();

			String regExp = "(\\d{2}-\\d{2}-\\d{3})";
			boolean result = Pattern.matches(regExp, ano);
			if(result == false) {
				System.out.println("계좌번호 형식이 아닙니다. 다시 입력하세요.");
				break;
			}else {

			// 중복 계좌가 있는지 체킹
			if(findAccount(ano)!=null) {	// 중복 계좌가 있으면
				System.out.println("이미 등록된 계좌 입니다. 다시 입력해주세요.");
			}	// 중복 계좌가 없으면
			else {
				System.out.print("계좌 주를 입력하세요(한글, 영문, 숫자): ");
				String owner= scanner.nextLine();
				
				String regExp2 = "([0-9a-zA-Zㄱ-ㅎ가-힣])";
				boolean result2 = Pattern.matches(regExp2, owner);
				if(result2 == false) {
					System.out.println("계좌 주 형식이 아닙니다.");
					break;
				}else {
				
				System.out.print("초기 입금액을 입력하세요: ");
				
				// 숫자를 먼저 문자로 입력 받기.
				int balance= Integer.parseInt(scanner.nextLine());
				
				//입력 받은 내용을 매개변수로 계좌 생성하기.
				Account newAccount = new Account(ano, owner, balance);
				accountList.add(newAccount);	// ArrayList에 저장
				System.out.println("계좌가 생성되었습니다.");

				break;
				
				}
				}
			}
		
		}
	}// creatAccount() 끝
	
	//계좌 목록
	private static void getAccountList() {
		System.out.println("------------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("------------------------------------------------");

		//계좌 목록 조회
		for(int i=0; i<accountList.size();i++) {
			Account account = accountList.get(i);
			System.out.print("계좌 번호: " + account.getAno() + "\t");
			System.out.print("계좌 주: " + account.getOwner() + "\t");
			System.out.print("잔고:" + account.getBalance() + "\t");
			System.out.println();

		}

	}
	// 입금
	private static void deposit() {
		
		System.out.println("------------------------------------------------");
		System.out.println("입금");
		System.out.println("------------------------------------------------");

		while(true) {			// 계좌 번호 재입력
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano)==null) {	// 중복 계좌가 없으면
				System.out.println("잘못된 계좌 입니다. 다시 입력해주세요.");
			}else {
					System.out.print("입금액: ");
					int money = Integer.parseInt(scanner.nextLine());
					
					if(findAccount(ano)!=null) {
						Account account = findAccount(ano);
						account.setBalance(account.getBalance() + money);
						System.out.println("결과: 정상 처리 되었습니다.");
					}else {
						System.out.println("결과: 계좌가 없습니다. 다시 입력해주세요.");
					}
					break;	
					}	
			}
	}
	
	private static void withdraw() {
		
		System.out.println("------------------------------------------------");
		System.out.println("출금");
		System.out.println("------------------------------------------------");

		while(true) {		// 계좌 번호 재입력
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano)!=null) {
				while(true) {	// 출금액 재입력
					Account account = findAccount(ano);

					System.out.print("출금액: ");
					int money = Integer.parseInt(scanner.nextLine());
				
					if(money > account.getBalance()) {	// 출금액이 잔고보다 많으면
							System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
	
					}else {
						account.setBalance(account.getBalance() - money);
						System.out.println("결과: 정상 처리 되었습니다.");
						break;
					}
				}// 안쪽 while
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해주세요.");
			}

		}	// while 끝
	}
	
	// 계좌 삭제
	private static void removeAccount() {
		while(true) {
			System.out.println("삭제할 계좌의 계좌 번호를 입력하세요.");
			String ano2= scanner.nextLine();

			
			if(findAccount(ano2)!=null) {
				Account account = findAccount(ano2);
				System.out.println("삭제하려는 계좌 번호가 " +ano2 + " 가 맞습니까?(맞으면 Y 또는 y 틀리면 N 또는 n를 입력하세요.)");

				String sign = scanner.nextLine();
				
				if(sign.equals("y") || sign.equals("Y")) {
					accountList.remove(account);
					System.out.println("계좌가 삭제 되었습니다.");
					break;
				}else if(sign.equals("n") || sign.equals("N")){
					System.out.println("삭제가 취소되었습니다.");
					break;
				}else {
					System.out.println("-----------------------------");
					System.out.println("잘못된 문자를 입력하셨습니다.");
		
				}
				
			}else {
				System.out.println("삭제 할 계좌가 없습니다.");
			}
		}
		
		
	}
	
	// 계좌 검색
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountList.size();i++) {
			//1. 이미 등록된 계좌를 가져와서
			//2. 외부에서 입력한 계좌와 일치하는 지 비교하기..
			String dbAno = accountList.get(i).getAno();
			if(dbAno.equals(ano)) {
				account = accountList.get(i);	// 계좌 객체 생성
				break;
		
			}
		}
		return account;
	}
	

}
