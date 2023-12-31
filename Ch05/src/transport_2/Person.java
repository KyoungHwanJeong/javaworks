package transport_2;

public class Person {

	private String name;
	private int money;
	
	Person(String name, int money){
		this.name=name;
		this.money=money;
	}
	
	public void takeBus(Bus bus) {
		money-=1500;
		bus.takeBus(1500);
	}
	
	public void takeSubway(Subway subway) {
		money-=1350;
		subway.takeSubway(1350);
	}
	
	public void showPersonInfo() {
		System.out.printf("%s님의 남은 돈은 %d 원 입니다.\n", name,money);
	}
}
