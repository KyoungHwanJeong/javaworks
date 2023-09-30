package transport_2;

public class Person {

	private String personName;
	private int personMoney;
	
	public Person(String personName, int personMoney) {
		this.personName=personName;
		this.personMoney=personMoney;
	}
	
	public void takeBus(Bus bus) {
		bus.takeBus(1500);
		this.personMoney-=1500;
	}
	
	public void takeSubway(Subway subway) {
		subway.takeSubway(1350);
		this.personMoney-=1350;
	}
	
	public void showPersonInfo() {
		System.out.printf("%s님의 남은 돈은 %d원 입니다.\n", personName
				, personMoney);
	}
}
