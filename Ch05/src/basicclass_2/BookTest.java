package basicclass_2;

public class BookTest {

	/*
	 * book 클래스: 책 번호, 책 제목
	 * 
	 * 책 번호에 100, 제목에 "개미"를 저장하고
	 * 100, 개미 가 출력되도록 toString메서드를 재정의하고,
	 * 문자열 "개미"를 toString 메서드를 이용해서 출력,
	 * 문자열 객체 "개미"를 toString 메서드를 이용해서 출력, 
	 * 
	 */
	
	public static void main(String[] args) {

		Book book1=new Book(100, "개미");
		System.out.println(book1);
		System.out.println(book1.toString());
		
		System.out.println("=============================");
		String msg1 ="개미";
		System.out.println(msg1.toString());
		 
		String msg= new String("개미");
		System.out.println(msg.toString());
	}

}
