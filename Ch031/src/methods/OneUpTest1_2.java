package methods;

public class OneUpTest1_2 {
	
	/*
	 * 지역 변수로 1씩 증가하는 oneUp 함수를 정의
	 */
	
	public static int oneUp(int num) {
		num++;
		return num;
	}

	public static void main(String[] args) {
		int num=1;
		System.out.println(oneUp(num));
		System.out.println(oneUp(num));
	}

}
