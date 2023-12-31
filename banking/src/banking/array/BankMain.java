package banking.array;

import java.util.Scanner;

public class BankMain {

	// 계좌를 저장할 배열의 크기 100개로 설정
	static Account[] accounts = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		boolean sw = true;
		
		while(sw) {
			System.out.println("=============================================");
			System.out.println("1.계좌 생성 | 2.계좌 목록 |3.예금 | 4.출금 | 5.종료");
			System.out.println("=============================================");
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
				sw = false;
			}else{
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
			}

		}//while 끝

		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}//main 끝

	//계좌 생성
	private static void creatAccount() {
		System.out.println("------------------------------------------------");
		System.out.println("계좌 생성");
		System.out.println("------------------------------------------------");
		
		System.out.print("계좌 번호를 입력하세요: ");
		String ano= scanner.nextLine();
	
		System.out.print("계좌 주를 입력하세요: ");
		String owner= scanner.nextLine();
		
		System.out.print("초기 입금액을 입력하세요: ");
		
		// 숫자를 먼저 문자로 입력 받기.
		int balance= Integer.parseInt(scanner.nextLine());
		//int balance = scanner.nextInt();
		
		//accounts[0] = new Account(ano, owner, balance);	// 연습 데이터
		
		for(int i=0; i<accounts.length;i++) {
									// 배열의 요소가 비어 있을 때 계좌를 저장함
				if(accounts[i]==null) {
					accounts[i]= new Account(ano, owner, balance);
					System.out.println("계좌가 생성되었습니다.");
					break;
			}
		}
	}
	
	//계좌 목록
	private static void getAccountList() {
		System.out.println("------------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("------------------------------------------------");

		for(int i=0; i<accounts.length;i++) {
			if(accounts[i] != null) {	// 계좌가 있는 배열의 요소 출력
				System.out.print("계좌번호: "+accounts[i].getAno()+"\t");
				System.out.print("계좌주: "+accounts[i].getOwner()+"\t");
				System.out.println("잔고: "+accounts[i].getBalance());
			}
		}

	}
	
	// 입금
	private static void deposit() {
		System.out.println("------------------------------------------------");
		System.out.println("입금");
		System.out.println("------------------------------------------------");

		System.out.print("계좌 번호: ");
		String ano = scanner.nextLine();
		
		System.out.println("입금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		if(findAccount(ano)!=null) {
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: 정상 처리 되었습니다.");
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
	}
	
	// 출금
	private static void withdraw() {
		System.out.println("------------------------------------------------");
		System.out.println("출금");
		System.out.println("------------------------------------------------");

		System.out.print("계좌 번호: ");
		String ano = scanner.nextLine();
		
		System.out.println("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		if(findAccount(ano)!=null) {
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() - money);
			System.out.println("결과: 정상 처리 되었습니다.");
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
	}
	
	// 계좌 검색
	private static Account findAccount(String ano) {
		Account account =null;// 찾을 계좌를 저장할 객체 변수를 null로 선언
		
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i]!=null) {
							// 이미 생성된 계좌 번호를 가져온다.
				String dbAno = accounts[i].getAno();
				if(dbAno.equals(ano)) {		// 외부에서 입력한 계좌와 일치하면
					account=accounts[i];	// 일치하는 계좌를 저장함.
					break;
				}
			}
		}
		
		return account;
	}
	
}
