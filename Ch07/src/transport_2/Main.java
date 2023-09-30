	/*
	 * <결과>
	 * ==============1====================
	 * 이강인님의 남은 돈은 5650원 입니다.
	 * 우영우님의 남은 돈은 17150원 입니다.
	 * 100번 버스의 수입은 3000원이고, 승객 수는 2명입니다,
	 * ==============2====================
	 * 이강인님의 남은 돈은 5650원 입니다.
	 * 우영우님의 남은 돈은 17150원 입니다.
	 * 200번 버스의 수입은 1500원이고, 승객 수는 1명입니다,
	 * ==============3====================
	 * 이강인님의 남은 돈은 5650원 입니다.
	 * 우영우님의 남은 돈은 17150원 입니다.
	 * 2호선 지하철의 수입은 2700원이고, 승객 수는 2명 입니다.
	 * 
	 * 
	 * 사람(승객) p1의 이름은 이강인, 돈은 10000원을 가지고 있고,
	 * 사람(승객) p2의 이름은 우영우, 돈은 20000원을 가지고 있다. 
	 * 버스는 100번 버스와 200번 버스가 있고, 버스비는 1500원이다.
	 * 지하철은 2호선이 있고, 지하철 비는 1350원이다.
	 * 
	 * 1. 승객 이강인과 우영우가 모두 100번 버스를 이용했을 때 승객들의
	 * 남은 돈과 100번 버스의 수입, 승객 수를 출력하기.
	 * 2. 승객 이강인만 200번 버스를 이용했을 때 승객들의 남은 돈과
	 * 200번 버스의 수입, 승객 수를 출력하기.
	 * 3. 승객 이강인과 우영어구 모두 2호선 지하철을 이용했을 때 승객들의
	 * 남은 돈과 GreenLine 지하철의 수입, 승객 수를 출력하기.
	 * 
	 */

package transport_2;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person("이강인", 10000);
		Person p2 = new Person("우영우", 20000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway green = new Subway("2호선");
		
		System.out.println("==============1=================");
		
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p1.showPersonInfo();
		p2.showPersonInfo();
		bus100.showBusInfo();
		
		System.out.println("==============2=================");

		p1.takeBus(bus200);
		p1.showPersonInfo();
		p2.showPersonInfo();
		bus200.showBusInfo();
		
		System.out.println("==============3=================");

		p1.takeSubway(green);
		p2.takeSubway(green);
		p1.showPersonInfo();
		p2.showPersonInfo();
		green.showSubwayInfo();
	}

}
