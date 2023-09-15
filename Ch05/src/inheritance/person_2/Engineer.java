package inheritance.person_2;

public class Engineer extends Person{

	private int companyId;
	
	public Engineer(String name, int age, int companyId) {
		super(name,age);
		this.companyId=companyId;
	}
	
	public int getCompanyId() {
		return companyId;
	}
}
