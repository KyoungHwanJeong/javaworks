package customers_2;

public class VIPCustomer extends Customer{

	private int agentId;
	private double salesRatio;
	
	public VIPCustomer(){
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		this.agentId=agentId;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public void setAgentId(int agentId) {
		this.agentId=agentId;
	}

	@Override
	public int calcBonus(int price) {
		price -= (int)(price*salesRatio);
		bonusPoint += (int)(price*bonusRatio);
		return price;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n전문 상담원 ID는 "
				+agentId + "입니다.";
	}
	
	
}
