package customers_3;

public class VIPCustomer extends Customer{

	public VIPCustomer() {
		customerGrade ="VIP";
		bonusRatio=0.05;
	}
	
	public VIPCustomer(int customerId, String customerName) {
		customerGrade="VIP";
		bonusRatio=0.05;
	}
}
