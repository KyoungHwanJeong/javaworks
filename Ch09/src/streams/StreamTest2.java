package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {

		// 문자형 배열
		String[] fruit = {"사과", "배", "수박", "참외"};
		
		// for문을 사용하지 않고 forEach()문을 사용 -> stream 객체를 얻어야 함
		//Stream<String> strStream = Arrays.stream(fruit);
		//strStream.forEach(str -> System.out.println(str));
		Arrays.stream(fruit).forEach(str -> System.out.println(str));
		
		// 정수형 배열
		int[] number = {1, 2, 3, 4};
		
		//Stream에서 만들 때는 배열 자료형을 Integer로 받기 때문에 
		//Stream에서는 int로 만들면 안된다.
		
		//Stream<Integer> numStream = Arrays.stream(number);
				// 원래 람다식 구성: (n) -> {System.out.println(n)}
		//numStream.forEach(n -> System.out.println(n));
		Arrays.stream(number).forEach(n -> System.out.println(n));
		
	
		// 합계, 개수, 평균 구하기
		int sumVal = Arrays.stream(number).sum();
		//count()의 반환형이 long이므로 int로 다운캐스팅한다.
		int count = (int)Arrays.stream(number).count();
		double avg = (double)sumVal / count;
		
		System.out.println("합계: " + sumVal);
		System.out.println("개수: " + count);
		System.out.printf("평균: %.2f\n", avg);
		
	}

}
