package hiding.accounts;

public class AccountTest2 {

	/*
	 * 매개변수가 있는 생성자를 만들고,
	 * account = {"111-222-3333", "김대박", 10000}를
	 * 한번에 입력받고,
	 * this. 로 복사 하고 get()함수 호출하기
	 */
	
	public static void main(String[] args) {
		
		// 생성자를 통해서 계좌 정보 입력
		Account account = new Account("111-222-3333","김대박"
				, 10000);
		
		System.out.println("계좌 번호: " + account.getAno());
		System.out.println("계좌주: " + account.getOwner());
		System.out.println("잔고: " + account.getBalance() + " 원");
		
	}

}
