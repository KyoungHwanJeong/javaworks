package objectarray.books;

public class BookMain {

	/*
	 * 책의 정보:
	 * "자바 프로그래밍 입문", "박은종"
	 * "웹 표준의 정석", "고경희"
	 * "스프링부트", "채규태"
	 * 를 입력받아서 외부 Book함수에 저장,
	 * 외부 Book함수를 호출하여 library[0]의 값을 출력
	 * 외부 Book함수를 호출하여 library 전체 출력
	 * 
	 * String으로 리턴값을 받아서 전체 출력
	 * 
	 * 향상된 for문 사용해서 출력
	 */
	
	public static void main(String[] args) {

		
//		Book[] library = new Book[3];
		
		
/*		for(int i=0;i<library.length;i++) {		//null, null, null
			System.out.println(library[i]);
		}
*/		
		// 객체 생성(배열에 저장)
		
/*		library[0]= new Book("자바 프로그래밍 입문", "박은종"); 
		library[1]= new Book("웹 표준의 정석", "고경희"); 
		library[2]= new Book("스프링부트", "채규태"); 
*/
		Book[] library = {
				new Book("자바 프로그래밍 입문", "박은종"),
				new Book("웹 표준의 정석", "고경희"),
				new Book("스프링부트", "채규태")
		};			// 세미콜론 종료
		
		// 출력
		library[0].showBookInfo();
		System.out.println("=============================");
		
		// 전체출력
		for(int i=0;i<library.length;i++) {
			library[i].showBookInfo();
		}
		System.out.println();
		
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i].showBookInfo2());
		}
		System.out.println("===============================");
		
		// 향상된 for문
		// for(자료형 변수 : 배열){ }
		for(Book book:library)
			book.showBookInfo();
		System.out.println();
		
		for(Book book:library)
			System.out.println(book.showBookInfo2());
	}
	

}
