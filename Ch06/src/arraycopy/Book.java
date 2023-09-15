package arraycopy;

public class Book {

	private String bookName;
	private String author;
	
	public Book() {
		
	}
	public Book(String bookName, String author) {
		this.bookName=bookName;
		this.author=author;
	}
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	
	// 객체의 문자열 정보 재정의
	@Override
	public String toString() {
		return bookName + ", " + author;
	}
}