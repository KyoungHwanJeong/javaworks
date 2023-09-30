	/*
	 * concat 사용하기.
	 * 1. 문자열 객체 javaStr에 "java"를 입력받고, 출력하기.
	 * 2. javaStr의 주소값을 "처음 문자열 주소값: "으로 출력하기.
	 * 3. 문자열 객체 androidStr에 "android"를 입력 받고,
	 * javaStr에 연결 한 후 출력하기.
	 * 4. javaStr의 주소값을 "연결 후 문자열 주소값: "으로 출력하기.
	 * 
	 */

package stringmethod_2;

public class StringMethod3 {

	public static void main(String[] args) {

		String javaStr = new String("java");
		
		System.out.println("=============1=================");
		System.out.println(javaStr);
		
		System.out.println("=============2=================");
		System.out.println(System.identityHashCode(javaStr));
		
		System.out.println("=============3=================");
		String androidStr= new String("android");
		javaStr=javaStr.concat(androidStr);
		System.out.println(javaStr);

		System.out.println("=============4=================");

		System.out.println(System.identityHashCode(javaStr));
	}

}
