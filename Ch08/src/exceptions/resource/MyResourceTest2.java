/*
 * AutoCloseable 인터페이스를 활용하여,
 * throws Exception을 이용한 예외 처리하기.
 * 
 * Main2
 * 1. MyResource에서 오류 발생 부분을 try-catch 문으로 묶기.
 * 2. e.printStackTrace 메서드로 예외 처리하고,
 * 3. 객체 res1를 닫기.
 * 
*/

package exceptions.resource;

public class MyResourceTest2 {

	public static void main(String[] args) throws Exception {

		MyResource res1 = null;
		try {
			res1 = new MyResource("res1");
			
			//System.out.println(res1.read1());
			//System.out.println(res1.read2());
	
			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));// 에러발생~!
		}catch(Exception e) {
			e.printStackTrace();
		}finally {	// 리소스 닫는 코드는 여기에 작성함
			res1.close();
		}
		
	}

}
