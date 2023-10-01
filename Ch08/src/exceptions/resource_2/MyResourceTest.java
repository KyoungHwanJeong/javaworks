/*
 * AutoCloseable 인터페이스를 활용하여,
 * throws Exception을 이용한 예외 처리하기.
 * 
 * MyResource
 * 1. MyResource은 AutoCloseable 인터페이스의 상속을 받는다.
 * 2. 생성자에서는 객체 res1에 입력된 문자열이 포함된 텍스트를 열고,
 * 3. read1 메서드에서는 res1에 입력된 문자열이 포함된 텍스트를 읽고,
 *  100을 리턴한다.
 * 4. read2 메서드에서는 res1에 입력된 문자열이 포함된 텍스트를 읽고,
 *  123a를 리턴한다.
 * 5. 예외처리 메서드에서는 res1 텍스트를 닫는다.
 * 
 * Main
 * 1. 문자열 객체 res1에 "res1"을 넣고, read1과 read2를 실행시키고,
 * 2. 닫기 메서드를 호출한다.
 * 
*/

package exceptions.resource_2;

public class MyResourceTest {

	public static void main(String[] args) throws Exception {

		MyResource res1 = new MyResource("res1");
		System.out.println(Integer.parseInt(res1.read1()));
		System.out.println(Integer.parseInt(res1.read2()));
		
		res1.close();
		
		
	}

}
