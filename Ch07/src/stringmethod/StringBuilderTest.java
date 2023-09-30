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

package stringmethod;

public class StringBuilderTest {
	
	public static void main(String[] args) {

		// StringBuilder, StringBuffer - 문자열 변경이 가능한 클래스
		//							(메모리 주소는 변경되지 않고 유지된다.)
		
		System.out.println("===========1========================");
		String javaStr = new String("java");
		/*
		 * System.out.println("처음 문자열 주소값: " 
						+ System.identityHashCode(javaStr));
		*/

		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println(buffer);
		
		System.out.println("===========2========================");

		System.out.println("연산 전 buffer 메모리 주소: "
				+ System.identityHashCode(buffer));
		
		
		System.out.println("===========3========================");

		// 문자열 추가, 연결 - append() 사용
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is fun!!");
		
		
		System.out.println(buffer);
		
		System.out.println("===========4========================");

		System.out.println("연산 후 buffer 메모리 주소: "
				+ System.identityHashCode(buffer));
		
	}

}
