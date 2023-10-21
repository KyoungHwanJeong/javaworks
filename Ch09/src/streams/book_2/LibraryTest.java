/*
 * Book 형 List 객체를 생성하고
 * 객체 	("자바", 25000)
 * 		("파이썬", 15000)
 * 		("안드로이드", 30000)
 * 를 저장한다.
 * 1. 람다식을 이용하여, 모든 책의 가격의 합을 출력하기
 * 2. Book 형 스트림을 이용하여, 책의 가격이 20,000원 이상인 책의 이름을 출력하기
 * 
 */

package streams.book_2;

import java.util.ArrayList;
import java.util.List;


public class LibraryTest {

	public static void main(String[] args) {

		List<Book> bookList1 = new ArrayList<>();
		// 객체 저장
		bookList1.add(new Book("자바", 25000));
		bookList1.add(new Book("파이썬", 15000));
		bookList1.add(new Book("안드로이드", 30000));
		
		System.out.println("==============1====================");

		// 스트림 사용
		//Stream<Book> stream = bookList1.stream();
		int total = bookList1.stream()
							.mapToInt(b -> b.getPrice())
							.sum();
		System.out.println("모든 책의 가격의 합: " + total);
		
		System.out.println("==============2====================");
		
		System.out.println("책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력");
		bookList1.stream()
				.filter(b -> b.getPrice() >= 20000)
				.sorted()
				.forEach(b -> System.out.println(b));
		
	}

}
