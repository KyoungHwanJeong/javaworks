package exceptions.resource_2;

public class MyResource implements AutoCloseable{

	private String text;
	
	public MyResource(String text) {
		this.text=text;
		System.out.println("[MyResource(" + text + ")] 열기");
	}
	
	public String read1() {
		System.out.println("[MyResource(" + text + ")] 읽기");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource(" + text + ")] 읽기");
		return "123a";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("[MyResource(" + text + ")] 닫기");
	}

}
