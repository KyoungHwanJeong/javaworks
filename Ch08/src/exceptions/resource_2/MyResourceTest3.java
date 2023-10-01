/*
 * AutoCloseable 인터페이스를 활용하여,
 * throws Exception을 이용한 예외처리하기.
 * MyResourceTest 코드 줄이기.
 * 
 * 1. try-catch 문의 코드 줄이기.
 * 
 */

package exceptions.resource_2;

public class MyResourceTest3 {

	public static void main(String[] args) throws Exception {


		try (MyResource res1 = new MyResource("res1")){

			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
