package methods;

public class OneUpTest1 {

	/*
	 * 지역 변수로 1씩 증가하는 oneUp 함수를 정의
	 */
	
	// 1증가하는 함수 정의
	// 지역변수의 생명주기(scope)범위 - 함수나 제어문의 블럭 안에서 생성되고,
	//								호출 된 후(블럭을 벗어나면)에 소멸한다.
	
	public static int oneUp() {
		int num=1;	// 지역 변수
		num++;		// num += 1
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println(oneUp());	//2
		System.out.println(oneUp());	//2
		
		//System.out.println(num);		//oneUp의 num은 소멸한 변수이다.
										//main함수에는 없음
		
		
	}

}
