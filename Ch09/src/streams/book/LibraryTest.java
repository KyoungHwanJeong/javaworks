package streams.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LibraryTest {

	public static void main(String[] args) {

		List<Book> bookList = new ArrayList<>();
		
		// 객체 저장
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		//스트림 사용
		Stream<Book> stream = bookList.stream();
		
		//매핑
		//book.map(b -> b.getPrice());
		
		// 모든 책의 가격의 합
		int total = bookList.stream()
							.mapToInt(b -> b.getPrice())
							.sum();
		System.out.println("모든 책의 가격의 합: "+ total);
		
		// filter, map, sort, forEach

		System.out.println("책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력");
		
		bookList.stream()
				.filter(b -> b.getPrice() >= 20000 )
				.map(b -> b.getName())
				.sorted()
				//.map(b -> b.getName()) 에러 뜸.
				.forEach(b -> System.out.println(b));

	}

}
