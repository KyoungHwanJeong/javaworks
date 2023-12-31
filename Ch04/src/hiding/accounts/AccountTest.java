package hiding.accounts;

public class AccountTest {

/*
 * Account 클래스: private String ano // 계좌번호
 * 				private String owner	// 계좌주
 * 				private int balance		// 잔고
 * 
 * 				get(), set()메서드를 만들고 매개변수로 계좌번호,계좌주,잔고를
 * 				직접 전달 받아 출력,
 * 				생성자에 this를 사용한다.
 * 				
 * 				계좌번호: "111-222-3333"
 * 				계좌주: "김대박"
 * 				잔고: 10000
 * 				을 main에서 입력받아서 출력하기
 * 
 * */
	
	public static void main(String[] args) {
		
		// Account 인스턴스 생성
		Account account = new Account();
		// 멤버에 직접 접근하지 못하도록 권장
		//account.ano = "111-222-3333";
		// 멤버 메서드에 접근 가능
		
		account.setAno("111-222-3333");
		account.setOwner("김대박");
		account.setbalance(10000);
		
		// 계좌번호 출력
		// System.out.println(account.ano);
		System.out.println("계좌 번호: " + account.getAno());
		System.out.println("계좌주: " + account.getOwner());
		System.out.println("잔고: " + account.getBalance() + " 원");
	}

}
