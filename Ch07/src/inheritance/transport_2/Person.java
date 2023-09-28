package inheritance.transport_2;

public class Person {

	private String person_Name;		// 사람이름
	private int person_Money;		// 소지금
	
	public Person(String person_Name, int person_Money) {
		this.person_Name=person_Name;
		this.person_Money=person_Money;
	}
	
	public void take_Vehicle(Vehicle vehicle, int fare) {
		if(person_Money< fare) {
			System.out.println(person_Name + " 님의 잔액이 부족합니다.");
		}else {
			this.person_Money -= fare;
			vehicle.ride_Vehicle(fare);
		}
	}
	
	public void showPersonInfo() {
		System.out.println(person_Name + " 님의 남은 돈은 "
				+ person_Money + "원 입니다.");
	}
}
