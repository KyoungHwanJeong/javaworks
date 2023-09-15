package classes.methods;

public class UseHello {

	public static void main(String[] args) {

		/*
		 * 리턴값이 없는 sayHello함수에 "안녕~!" 문자열 출력하기
		 * 리턴값이 없는 sayHello함수에 "안녕~!" + 
		 * "Elsa"와
		 * "장그래"의 이름을 입력받아 출력하기
		 * 
		 */
		
		// Hello 클래스 사용
		Hello say = new Hello();
		say.sayHello();			// 호출
		say.sayHello("Elsa");
		say.sayHello("장그래");
	}

}
