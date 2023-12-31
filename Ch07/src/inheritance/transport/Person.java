package inheritance.transport;

// 사람 클래스(자료형)
public class Person {

	//필드
	String name;		// 이름
	int money;			// 가진 돈
	
	// 매개변수 생성자
	public Person(String name, int money) {
		this.name=name;
		this.money=money;
	}
	
	// 교통수단 이용 메서드(매개변수의 다형성)
	public void take(Vehicle vehicle, int fare) {
		
		if(this.money > fare) {
			vehicle.carry(fare);
			this.money -= fare;
			showPersonInfo();
			
		}else {
			System.out.printf("%s 님의 잔액이 부족합니다.\n", name);
		}
	}

	// 사람의 정보
	public void showPersonInfo() {
		System.out.printf("%s님의 남은 돈은 %d원 입니다.\n",name, money);
	}
}
