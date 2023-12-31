	/*
	 * indexOf, lastindexOf 활용하기.
	 * 
	 * 문자열 객체 str에 "Hello World Hello!"를 저장하기.
	 * 1. "Hello" 문자열이 처음 시작 되는 부분을 앞에서부터 찾아 출력하기.
	 * 2. "Hello" 문자열이 처음 시작 되는 부분을 뒤에서부터 찾아 출력하기.
	 * 3. "ok" 문자열이 처음 시작되는 부분을 앞에서 부터 찾아 출력하기.
	 * 
	 * 문자열 객체 subject에 "자바 프로그래밍"을 저장하기.
	 * 4. 문자열을 앞에서부터 검색해서 "자바" 문자열이 있으면,
	 * "자바와 관련된 책이군요!"를 없으면 "자바와 관련 없는 책이군요!"를
	 * 출력하기.
	 * 
	*/

package stringmethod;

public class StringMethod2 {
	
	public static void main(String[] args) {

		//indexOf()- 검색에 도움
		// 문자열이 시작되는 인덱스를 리턴합니다.
		
		String str = "Hello World Hello!";
		
		int val = str.indexOf("Hello");	// 앞에서 부터 찾음
		
		System.out.println(val);
		
		int val2 = str.lastIndexOf("Hello");	// 뒤에서 부터 찾음
		System.out.println(val2);	// 12번
		
		int val3 = str.indexOf("ok"); 	// 찾는 문자가 없으면 -1을 리턴한다.
		System.out.println(val3);
		
		
		
		// 조건문 만들기
		
		String subject = "자바 프로그래밍";
		
		if(subject.indexOf("자바") != -1) {	// "자바"가 검색이 되면(>=0)
			System.out.println("자바와 관련된 책이군요!");
		}else {	// index == -1
			System.out.println("자바와 관련이 없는 책이군요!");
		}
	}

}
