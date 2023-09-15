package statics.card_2;

public class CardTest {
	
	/*
	 * 카드 번호 초기 값에 10000을 저장하고,
	 * 카드를 생성 할 때마다 카드 번호가 1증가한다.
	 * 3개의 카드를 생성하고 출력하기
	 * 
	 */

	public static void main(String[] args) {

		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		
		System.out.println(card1.getCardNumber());
		System.out.println(card2.getCardNumber());
		System.out.println(card3.getCardNumber());
	}

}
