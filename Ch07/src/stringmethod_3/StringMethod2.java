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

package stringmethod_3;

import java.util.ArrayList;

public class StringMethod2 {

	public static void main(String[] args) {

		//ArrayList<String> str = new ArrayList<>();
		//str.add("Hello World Hello!");
		String str = new String("Hello World Hello!");
		
		System.out.println("================1=========================");
		int n1 = str.indexOf("Hello");
		System.out.println(n1);
		
		System.out.println("================2=========================");
		int n2 = str.lastIndexOf("Hello");
		System.out.println(n2);
		
		System.out.println("================3=========================");
		int n3 = str.lastIndexOf("ok");
		System.out.println(n3);
		
		System.out.println("================4=========================");
		String subject =new String("자바 프로그래밍");
		if(subject.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된 책이군요!");
		}else {
			System.out.println("자바와 관련이 없는 책이군요!");
		}
	}

}
