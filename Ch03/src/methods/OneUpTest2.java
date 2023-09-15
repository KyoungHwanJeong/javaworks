package methods;

public class OneUpTest2 {
	
	/*
	 * 정적변수로 1씩 증가하는 함수를 정의
	*/
	
	//정적 변수 - static 키워드를 붙인 변수
	//정적 변수는 생성된 후 프로그램이 종료될 때 소멸된다.
	// 특징 - 값을 공유, 누적함
	static int x = 1;		// 전역공간(맨 위쪽) Global
	
	public static int oneUp() {
		// x += 1;
		x++;
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(oneUp());	// 2
		System.out.println(oneUp());	// 3
		System.out.println(oneUp());	// 4
		
		//변수 x값 출력
		System.out.println("x = " + x);			// 4
	}

}
