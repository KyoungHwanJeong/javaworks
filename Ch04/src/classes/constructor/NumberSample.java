package classes.constructor;

public class NumberSample {

	/*
	 * 필드에 x값 선언,
	 * 생성자 NumberSample 안에서 x에 4를 넣어서 출력하기
	 * 생성자 NumberSample에 매개변수 10를 받아 출력하기
	 */
	
	int x;		// 필드 - 멤버 변수
	
	public NumberSample() {
		x = 4;
	}
	public NumberSample(int y) {
		x=y;
	}
	public static void main(String[] args) {
		NumberSample myNum = new NumberSample();
		System.out.println(myNum.x);
		System.out.println("==================");
		NumberSample myNum2 = new NumberSample(10);
		System.out.println(myNum2.x);
	}

}
