package collection.list_2;

public class Board {
	
	private String title;	// 제목
	private String content;	// 내용
	private String writer;	// 글쓴이
	
	public Board(String title, String content, String writer) {
		this.title=title;
		this.content=content;
		this.writer=writer;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public void setContent(String content) {
		this.content=content;
	}
	public void setWriter(String writer) {
		this.writer=writer;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}

}
