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

package streams.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {

		// 고객을 저장할 자료구조 - ArrayList : 객체 customerList
		List<Customer> customerList = new ArrayList<>();
		
		
		//고객 객체 생성		
		Customer lee = new Customer("이순신", 40, 100);
		Customer kang = new Customer("강감찬", 30, 100);
		Customer hong = new Customer("홍길동", 15, 50);
		
		
		//자료 저장(추가)
		customerList.add(lee);	// 0번 인덱스
		customerList.add(kang);	// 1번 인덱스
		customerList.add(hong);	// 2번 인덱스
		
		System.out.println("========= 고객 명단 출력 ==================");
		
		//일반 for문
		/*
		for(Customer customer : customerList)
			System.out.println(customer.getName());
		*/
		
		//Stream과 람다식을 사용
		Stream<Customer> stream = customerList.stream();
		stream.map( c -> c.getName())			// map메서드로 이름을 매핑한다.
			  .forEach(s -> System.out.println(s));	// forEach문으로 출력한다.
		
		int total = customerList.stream()
								.mapToInt(c -> c.getPrice())
								.sum();	// 리스트에 있는 모든 값의 합을 반환한다.
		
		System.out.println("총 여행 비용은 "+ total + "원 입니다.");
		
		System.out.println("======나이가 20세 이상인 고객의 명단을 정렬하여 출력======");
		
		//중간 연산 - filter(), map(), sorted
		//최종 연산 - forEace()
		customerList.stream()
					.filter(c -> c.getAge() >= 20)
					.map(c -> c.getName())
					.sorted()
					.forEach(s -> System.out.println(s));
		
		
	}

}
