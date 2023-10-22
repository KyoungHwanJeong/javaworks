/*
 * 스트림 출력하기
 * 1. 고객을 저장할 자료구조 Customer형 ArrayList를 생성한다.
 * 2. 고객 객체
 * 		lee = ("이순신", 40, 100)
 * 		kang = ("강감찬", 30, 100)
 * 		hong = ("홍길동", 15, 50)
 * 를 입력하고,
 * 3. 향상 for문으로 고객 명단을 출력하기.
 * 4. Customer형 스트림을 만들고 람다식으로 출력하기.
 * 5. 총 여행 비용을 출력하기.
 * 6. 나이가 20세 이상인 고객의 명단을 정렬하여 출력하기.(filter(), map(), sorted(), forEach() 함수를 이용)
*/

package streams.customer_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {

		// 고객을 저장할 자료구조
		List<Customer> cusList = new ArrayList<>();
		// 고객 객체 생성
		Customer lee = new Customer("이순신", 40, 100);
		Customer kang = new Customer("강감찬", 30, 100);
		Customer hong = new Customer("홍길동", 15, 50);
		
		// 자료 저장하기
		cusList.add(lee);
		cusList.add(kang);
		cusList.add(hong);
		System.out.println("===============고객 명단 출력================");
		System.out.println("===============1==========================");
		// 향상 for
		for(Customer customerList : cusList) {
			System.out.println(customerList.getName());
		}
		
		System.out.println("===============2==========================");
		// Stream과 람다식
		Stream<Customer> stream1 = cusList.stream();
		stream1.map(c -> c.getName())
			   .forEach(s -> System.out.println(s));
		
		int total = cusList.stream()
							.mapToInt(c -> c.getPrice())
							.sum(); // 리스트 모든 price 값의 합을 반환
		
		System.out.println("총 여행 비용은 " + total + "원 입니다.");
		
		System.out.println("=========나이가 20세 이상인 고객의 명단을 정렬하여 출력===========");
		cusList.stream()
				.filter(c -> c.getAge() >= 20)
				.map(c -> c.getName())
				.sorted()
				.forEach(s -> System.out.println(s));
				
	}

}
