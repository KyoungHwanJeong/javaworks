package customers_2;

public class Customer {

	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(){
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	public Customer(int customerId, String customerName) {
		this.customerId=customerId;
		this.customerName=customerName;
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public int calcPrice(int price) {
		bonusPoint +=(int)(price*bonusRatio);
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade
				+ "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
