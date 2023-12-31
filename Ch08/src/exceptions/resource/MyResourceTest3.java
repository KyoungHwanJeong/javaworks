/*
 * AutoCloseable 인터페이스를 활용하여,
 * throws Exception을 이용한 예외처리하기.
 * MyResourceTest 코드 줄이기.
 * 
 * 1. try-catch 문의 코드 줄이기.
 * 
 */

package exceptions.resource;

public class MyResourceTest3 {

	public static void main(String[] args) throws Exception {

		// try~with~resource문
		// close()를 사용하지 않는다.
		
		try (MyResource res1 = new MyResource("res1")){
			
			//System.out.println(res1.read1());
			//System.out.println(res1.read2());
	
			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));// 에러발생~!
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
