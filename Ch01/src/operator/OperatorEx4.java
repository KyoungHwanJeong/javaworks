package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		// 논리 연산자
		// && - 엠퍼샌드 : 두 항이 모두 참인 경우에만 결과값이 참(true)이다.		논리곱
		// || - bar 2개 : 두 항 중에 하나만 참이어도 결과값이 참(true)이다.		논리합
		// ! - 항이 참이면 거짓이고, 거짓이면 참이다.							논리부정
		
		
		
		System.out.println((4 < 5) && (10 == 11));	// false(T && F)
		System.out.println((4 < 5) || (10 == 11));	// true(T || F)
										// 단락회로
		
		System.out.println(!(10==11));				// true(논리 false의 부정)
		
		
		
		
	}
}
