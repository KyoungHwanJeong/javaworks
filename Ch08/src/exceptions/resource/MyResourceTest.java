package exceptions.resource;

public class MyResourceTest {

	public static void main(String[] args) throws Exception {

		MyResource res1 = new MyResource("res1");
		
		//System.out.println(res1.read1());
		//System.out.println(res1.read2());

		System.out.println(Integer.parseInt(res1.read1()));
		System.out.println(Integer.parseInt(res1.read2()));// 에러발생~!
		
		res1.close();
		
		
	}

}
