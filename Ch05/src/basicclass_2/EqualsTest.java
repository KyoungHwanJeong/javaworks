package basicclass_2;

public class EqualsTest {

	/*
	 * name1과 name2를 입력받아서,
	 * name1과 name2 인스턴스의 메모리 주소를 비교하는 내용을 출력하기,
	 * (.identityHashCode를 사용해서 name1과 name2의 주소를 각각 출력하기)
	 * .equals 사용해서 name1과 name2의 문자열이 같은지 출력하기,
	 * 
	 * 책: 책번호=100, 책제목="개미"라는 객체 2개를 생성해서
	 * 2개의 책이 같은 주소인지 출력하고,
	 * 문자열이 같은지 출력하기
	 * 
	 */
	
	public static void main(String[] args) {

		String name1 = new String("우영우");
		String name2 = new String("우영우");
		
		System.out.println(name1==name2);
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		
		System.out.println(name1.equals(name2));
		System.out.println("=================================");
		
		Book book1 = new Book(100, "개미");
		Book book2 = new Book(100, "개미");
		System.out.println(book1==book2);
		System.out.println(book1.equals(book2));
		
	}

}
