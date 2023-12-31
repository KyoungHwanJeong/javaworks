package customers_2;

public class VIPCustomer extends Customer{

	private int agentId;
	double saleRatio=0.1;
	
	public VIPCustomer() {
		customerGrade="VIP";
		saleRatio=0.1;
		bonusRatio=0.05;
	}
	public VIPCustomer(int customerId, String customerName,int agentId) {
		super(customerId,customerName);
		this.agentId=agentId;
		customerGrade="VIP";
		saleRatio=0.1;
		bonusRatio=0.05;
	}
	public void setAgentId(int agentId) {
		this.agentId=agentId;
	}
	
	public int calcPrice(int price) {
		price-=(int)(price*saleRatio);
		bonusPoint+=(int)(price*bonusRatio);
		return price;
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 전문 상담원 ID는 "
				+ agentId + "입니다.\n";
	}
}
