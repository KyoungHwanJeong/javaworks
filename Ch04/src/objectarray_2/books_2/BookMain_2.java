package objectarray_2.books_2;

public class BookMain_2 {

	/*
	 * 책의 정보:
	 * "자바 프로그래밍 입문", "박은종"
	 * "웹 표준의 정석", "고경희"
	 * "스프링부트", "채규태"
	 * 를 Book[] 배열로 
	 * 입력받아서 외부 Book 생성자에 저장,
	 * 외부 Book 함수를 호출하여 library[0]의 값을 출력
	 * 외부 Book 함수를 호출하여 library 전체 출력
	 * 
	 * String으로 리턴값을 받아서 전체 출력
	 * 
	 * 향상된 for문 사용해서 출력
	 */
	
	public static void main(String[] args) {

		Book_2[] library= {
				new Book_2("자바 프로그래밍 입문", "박은종"),
				new Book_2("웹 표준의 정석", "고경희"),
				new Book_2("스프링부트", "채규태"),				
		};
		
		library[0].showBook_2Info();
		System.out.println("=========================");
		for(int i=0;i<library.length;i++) {
			library[i].showBook_2Info();
		}
		
		System.out.println("=========================");

		for(Book_2 book:library) {
			book.showBook_2Info();
		}
	}

}
