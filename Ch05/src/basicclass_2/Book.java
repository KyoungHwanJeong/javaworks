package basicclass_2;

public class Book {

	private int bookNumber;
	private String bookName;
	
	public Book(int bookNumber, String bookName) {
		this.bookNumber=bookNumber;
		this.bookName=bookName;
	}

	@Override
	public String toString() {
		return bookNumber+", "+bookName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
}
