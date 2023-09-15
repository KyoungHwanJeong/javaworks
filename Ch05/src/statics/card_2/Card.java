package statics.card_2;

public class Card {

	private int cardNumber;
	private static int serialNumber=10000;
	
	public Card() {
		serialNumber++;
		cardNumber=serialNumber;
	}
	public int getCardNumber() {
		return cardNumber;
	}
}
