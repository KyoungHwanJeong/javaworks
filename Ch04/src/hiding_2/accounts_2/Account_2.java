package hiding_2.accounts_2;

public class Account_2 {

	private String ano;
	private String owner;
	private int balance;
	
	Account_2(){
		
	}
	public void setAno(String ano) {
		this.ano=ano;
	}
	public String getAno() {
		return ano;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	
	Account_2(String ano, String owner, int balance){
		this.ano=ano;
		this.owner=owner;
		this.balance=balance;
	}
}
