package collection.list;

//import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BoardTest {

	public static void main(String[] args) {

		//ArrayList 또는 Vector를 선택 사용
		//ArrayList<Board> list = new ArrayList<>();
		List<Board> list = new Vector<>();
		
		//Board 객체 생성
		Board board1 = new Board("제목1", "1 내용입니다.", "글쓴이 1");
		Board board2 = new Board("제목2", "2 내용입니다.", "글쓴이 2");
		Board board3 = new Board("제목3", "3 내용입니다.", "글쓴이 3");
		
		//Board객체를 Vecter 리스트에 저장
		list.add(board1);	//0번
		list.add(board2);	//1번
		list.add(board3);	//2번
		
		//게시글 1개 삭제(1번 인덱스)
		if(list.contains(board1)) {	// 객체(object)로 삭제
			list.remove(board1);	// index로 삭제 가능하다.
									// list.remove(1);
		}
		
		//맨 앞에 있는 객체 가져오기(0번 인덱스)
		System.out.println("title: " + list.get(0).getTitle());
		System.out.println("content: " + list.get(0).getContent());
		System.out.println("writer: " + list.get(0).getWriter());
		
		//전체 목록
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getTitle() + ", " 
				+ board.getContent() + ", " + board.getWriter());
	
		
		
		}
		
		
		
	}

}
