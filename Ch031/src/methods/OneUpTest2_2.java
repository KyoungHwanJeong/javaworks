package methods;

public class OneUpTest2_2 {

	/*
	 * 정적변수로 1씩 증가하는 함수를 정의
	*/
	
	static int x=1;
	
	public static int oneUp() {
		x++;
		return x;
	}
	public static void main(String[] args) {
		System.out.println(oneUp());
		System.out.println(oneUp());
		System.out.println(oneUp());

	}

}
