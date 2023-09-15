package thissamples_2;

public class ThisTest_2 {

	/*
	 * BirthDay 클래스 함수에 setYear 함수로 year의 값을 정의하고,
	 * printThis 함수로 this를 리턴하는 메서드를 정의,
	 * year = 2023을 넣고,
	 * setYear의 주소값과 printThis 메서드가 가리키는 주소값 출력하기.
	 * 
	 */
	
	public static void main(String[] args) {
		BirthDay_2 birthday = new BirthDay_2();
		
		System.out.println(birthday);
		birthday.printThis();
	}

}
