package classes_2.method_2;

public class UseHello_2 {

	public static void main(String[] args) {

		/*
		 * 리턴값이 없는 sayHello함수에 "안녕~!" 문자열 출력하기
		 * 리턴값이 없는 sayHello함수에 "안녕~!" + 
		 * "Elsa"와
		 * "장그래"의 이름을 입력받아 출력하기
		 * 
		 */
		
		Hello_2 say = new Hello_2();
		say.sayHello();
		say.sayHello("Elsa");
		say.sayHello("장그래");
	}

}
