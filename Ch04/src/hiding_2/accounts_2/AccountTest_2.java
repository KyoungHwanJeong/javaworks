package hiding_2.accounts_2;

public class AccountTest_2 {

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
	
		Account_2 account = new Account_2();
		account.setAno("111-222-3333");
		account.setOwner("김대박");
		account.setBalance(10000);
		
		System.out.println("계좌번호: " + account.getAno());
		System.out.println("계좌주: " + account.getOwner());
		System.out.println("잔고: " + account.getBalance());
		
	}

}
