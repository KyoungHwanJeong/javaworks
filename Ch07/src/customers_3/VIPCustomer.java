package customers_3;

public class VIPCustomer extends Customer{

	private int agentId;
	private double saleRatio;
	
	private VIPCustomer() {
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		this.agentId=agentId;
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	
	public void setagnetId(int agentId) {
		this.agentId=agentId;
	}
	
	public int getagentId() {
		return agentId;
	}
	@Override
	public int calcPrice(int price) {
		price -= (int)(price*saleRatio);
		bonusPoint += (int)(price*bonusRatio);
		return price;
	}
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n전문 상담원 아이디는 "
				+ agentId + "입니다.";
	}
}
