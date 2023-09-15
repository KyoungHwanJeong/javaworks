package objectarray.books;

// Book 자료형 정의
public class Book {

	//필드
	private String bookName;
	private String author;
	
	// 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	// 책의 정보 출력
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
	public String showBookInfo2() {
		return bookName + ", " +author;
	}
	
}
