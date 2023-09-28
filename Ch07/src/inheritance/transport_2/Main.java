/*
 * 교통 수단 이용하기(상속)
 * 
 * < 결과 >
 * ==============1============================
 * 박소희 님의 남은 돈은 8500원 입니다.
 * 이대호 님의 남은 돈은 18500원 입니다.
 * bus100의 수입읍 3,000원이고, 승객 수는 2명입니다.
 * 
 * ==============2============================
 * 박소희 님의 잔액이 부족합니다.
 * 이대호 님의 남은 돈은 13700원 입니다.
 * 카카오 택시의 수입은 4800원이고, 승객 수는 1명입니다.
 * 
 * ===========================================
 * 박소희 님은 10000원을 가지고 있고, 이대호 님은 20000원을 가지고 있다.
 * 100번 버스의 버스비는 1500원이고,
 * 카카오택시의 비용으로 박소희 님은 10000원, 이대호 님은 4800원을 냈다.
 * 
 * 1. Bus와 Taxi는 Vehicle의 차량이름을 상속 받는다.
 * 2. Vehicle 클래스에는 필드에 차량이름, 수입, 승객 수가 있고,
 * 		탑승 메서드에서는 요금을 받아서 차량의 수입과 승객 수를 계산한다.
 * 3. Person 클래스에는 필드에 사람이름, 돈이 있고,
 * 		교통수단 이용 메서드에서는 승객의 요금이 부족할 경우 잔액이 부족합니다를
 * 		출력하고, 계산 되지 않는다.
 * 4. 두 사람이 모두 100번 버스를 이용했을때 사람의 정보를 출력하고,
 * 5. 버스의 정보를 출력하기.
 * 6. 두 사람이 모두 택시를 이용했을 때 사람의 정보를 출력하고,
 * 7. 택시의 정보를 출력하기.
 * 
 */

package inheritance.transport_2;

public class Main {

	public static void main(String[] args) {

		Person sohee = new Person("박소희", 10000);
		Person daeho = new Person("이대호", 20000);
		
		Vehicle bus100 = new Vehicle("bus100");
		Vehicle taxi = new Vehicle("카카오 택시");
		
		System.out.println("============1===================");
		int fare=1500;
		sohee.take_Vehicle(bus100, fare);
		daeho.take_Vehicle(bus100, fare);
		
		sohee.showPersonInfo();
		daeho.showPersonInfo();
		bus100.showVehicleInfo();
		
		System.out.println("============2===================");
		
		sohee.take_Vehicle(taxi, 10000);
		daeho.take_Vehicle(taxi, 4800);
		
		sohee.showPersonInfo();
		daeho.showPersonInfo();
		taxi.showVehicleInfo();
	}

}
