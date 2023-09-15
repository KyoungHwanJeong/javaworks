package classes_2.constructor_2;

public class NumberSample_2 {

	/*
	 * 필드에 x값 선언,
	 * 생성자 NumberSample 안에서 x에 4를 넣어서 출력하기
	 * 생성자 NumberSample에 매개변수 10를 받아 출력하기
	 */
	
	int x;
	public NumberSample_2() {
		x=4;
	}
	public NumberSample_2(int y) {
		x=y;
	}
	
	public static void main(String[] args) {
		NumberSample_2 myNum_2= new NumberSample_2();
		System.out.println(myNum_2.x);
		System.out.println("====================");
		NumberSample_2 myNum2_2= new NumberSample_2(10);
		System.out.println(myNum2_2.x);
		
	}
}
