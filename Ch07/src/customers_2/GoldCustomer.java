package customers_2;

public class GoldCustomer extends Customer{

	private double salesRatio;
	
	public GoldCustomer() {
		customerGrade ="Gold";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade ="Gold";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		price -= (int)(price*salesRatio);
		bonusPoint +=(int)(price*bonusRatio);
		return price;
	}
	
}
