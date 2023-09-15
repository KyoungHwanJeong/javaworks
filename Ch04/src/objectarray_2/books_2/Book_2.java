package objectarray_2.books_2;

public class Book_2 {

	private String bookName;
	private String author;
	
	public Book_2() {
		
	}
	public Book_2(String bookName,String author) {
		this.bookName= bookName;
		this.author= author;
	}
	
	public void showBook_2Info() {
		System.out.println(bookName + ", " + author);
	}
}
