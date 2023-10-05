	/*
	 * StringBuilder와 StringBuffer 활용하기.
	 * 
	 * 1. StringBuilder 클래스에 "java"를 입력받고, 출력하기.
	 * 2. 연산 전 buffer 메모리 주소 출력하기.
	 * 3. "and", "android", "programing is fun!!" 문자열을 추가하고,
	 * 출력하기.
	 * 4. 연산 후 buffer 메모리 주소 출력하기.
	 *
	 */


package stringmethod_3;

public class StringBuilderTest {

	public static void main(String[] args) {

		System.out.println("==================1=========================");
		String javaStr= new String("Java");		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println(javaStr);
		
		System.out.println("==================2=========================");
		System.out.println(System.identityHashCode(buffer));
		System.out.println(System.identityHashCode(javaStr));
		
		System.out.println("==================3=========================");
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is fun!!");
		System.out.println(buffer);
		
		System.out.println("==================4=========================");

		System.out.println(System.identityHashCode(buffer));
		System.out.println(System.identityHashCode(javaStr));
	}

}
