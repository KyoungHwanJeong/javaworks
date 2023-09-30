	/*
	 * concat 사용하기.
	 * 1. 문자열 객체 javaStr에 "java"를 입력받고, 출력하기.
	 * 2. javaStr의 주소값을 "처음 문자열 주소값: "으로 출력하기.
	 * 3. 문자열 객체 androidStr에 "android"를 입력 받고,
	 * javaStr에 연결 한 후 출력하기.
	 * 4. javaStr의 주소값을 "연결 후 문자열 주소값: "으로 출력하기.
	 * 
	 */

package stringmethod;

public class StringTest {

	public static void main(String[] args) {

		// String 클래스를 사용하여 문자를 연결하면 내부의 문자열이 변경되지 않아서
		// 메모리가 많이 낭비된다. = 메모리 최적화 문제
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값: " 
						+ System.identityHashCode(javaStr));
	
		// 문자를 연결하는 메서드 - concat()
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("연결 후 문자열 주소값: " 
						+ System.identityHashCode(javaStr));
	
	}

}
