package hiding_2.accounts_2;

public class AccountTest2_2 {

	/*
	 * 매개변수가 있는 생성자를 만들고,
	 * account = {"111-222-3333", "김대박", 10000}를
	 * 한번에 입력받고,
	 * this. 로 복사 하고 get()함수 호출하기
	 * 계좌번호, 계좌주, 잔고를 출력하기
	 */
	
	public static void main(String[] args) {

		Account_2 account2= new Account_2("111-222-3333","김대박",
								10000);
		System.out.println("계좌번호: "+ account2.getAno());
		System.out.println("계좌주: " + account2.getOwner());
		System.out.println("잔고: "+ account2.getBalance());
	}

}
