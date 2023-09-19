package inheritance.transport;

public class Main {

	public static void main(String[] args) {

		// Person 객체 생성
		Person sohee = new Person("박소희", 10000);
		Person daeho = new Person("이대호", 20000);
		
		// Bus객체 생성
		Bus bus100 = new Bus("bus100");
		Taxi kakaoTaxi = new Taxi("카카오 택시");
		
		// 교통수단 메서드 호출
		sohee.take(bus100, 1500);
		daeho.take(bus100, 1500);
		
		// 사람과 교통수단 정보
		//sohee.showPersonInfo();
		//daeho.showPersonInfo();
		bus100.showInfo();
		System.out.println("==========1====================");
		
		sohee.take(kakaoTaxi,10000);
		daeho.take(kakaoTaxi,4800);
		
		
		//sohee.showPersonInfo();
		//daeho.showPersonInfo();
		kakaoTaxi.showInfo();
		System.out.println("==========2====================");

		
	}

}
