package transport;

public class Main {

	/*
	 * 사람(승객): 이름, 가진 돈
	 * 버스: 버스 번호, 승객 수, 수입
	 * 지하철: 지하철호선, 승객 수, 수입
	 * 
	 * 
	 * 사람 2명, 버스 2개, 지하철 green 객체를 입력받아
	 * 사람	p1= 이강인, 10000원
	 * 		p2= 우영우, 20000원
	 * 버스	100번
	 * 		200번
	 * 지하철	Green(2호선)
	 * 
	 * 승객들의 잔액을 출력하기.
	 * 버스, 지하철의 수입과 승객 수를 출력하기.
	 */
	
	public static void main(String[] args) {
		
		// 사람 객체 생성
		Person p1 = new Person("이강인", 10000);
		Person p2 = new Person("우영우", 20000);
		
		// 버스 객체 생성
		Bus bus100= new Bus(100);
		Bus bus200= new Bus(200);
		
		// 지하철 객체 생성
		Subway green = new Subway("2호선");
	
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p1.takeBus(bus200);
				
		p1.takeSubway(green);
		p2.takeSubway(green);
		
		// 정보 출력

		p1.showPersonInfo();
		p2.showPersonInfo();
		bus100.showBusInfo();
		
		System.out.println("==================================");
		p1.showPersonInfo();
		p2.showPersonInfo();
		bus200.showBusInfo();
	
		System.out.println("==================================");
		p1.showPersonInfo();
		p2.showPersonInfo();
		green.showSubwayInfo();
	}

}
