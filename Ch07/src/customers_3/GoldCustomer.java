package customers_3;

public class GoldCustomer extends Customer{
	
	private double saleRatio;
	
	private GoldCustomer() {
		customerGrade="Gold";
		bonusRatio=0.02;
		saleRatio=0.1;
	}
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade="Gold";
		bonusRatio=0.02;
		saleRatio=0.1;
	}
	@Override
	public int calcPrice(int price) {
		price-=(int)(price*saleRatio);
		bonusPoint+=(int)(price*bonusRatio);
		return price;
	}
	
}
