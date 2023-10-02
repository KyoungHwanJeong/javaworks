/*
 * List, Vector 활용하기.
 * Board형 리스트에 Vector 객체를 생성하고,
 * 리스트에 	board1 ={"제목1", "1 내용입니다.", "글쓴이 1"}
 * 			board2 ={"제목2", "2 내용입니다.", "글쓴이 2"}
 * 			board3 ={"제목3", "3 내용입니다.", "글쓴이 3"}
 * 을 생성한다.
 * 1. 각각 순서대로 Board객체를 Vector 리스트에 저장하고,
 * board1번 인덱스를 삭제하고, 맨앞에 있는 객체를 출력하기.
 * 2. Vector 리스트 전체 목록을 출력하기.
 * 
 */

package collection.list_2;

import java.util.List;
import java.util.Vector;

import collection.list.Board;

public class BoardTest {

	public static void main(String[] args) {

		List<Board> list = new Vector<>();
		Board board1 = new Board("제목1", "1 내용입니다.", "글쓴이 1");
		Board board2 = new Board("제목2", "2 내용입니다.", "글쓴이 2");
		Board board3 = new Board("제목3", "3 내용입니다.", "글쓴이 3");
		
		list.add(board1);
		list.add(board2);
		list.add(board3);
		
		System.out.println("=============1====================");
		if(list.contains(board1))
			list.remove(board1);
		
		System.out.println("Title: " + list.get(0).getTitle());
		System.out.println("Content: " + list.get(0).getContent());
		System.out.println("Writer: " + list.get(0).getWriter());
		
		System.out.println("=============2====================");

		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getTitle() + ", "
					+ list.get(i).getContent() + ", "
					+ list.get(i).getWriter());
		}
	}

}
