package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStream {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
				new Student("콩쥐", 80),
				new Student("팥쥐", 70),
				new Student("심청", 90)
				);
		
		System.out.println("=============1====================");
		// 학생의 이름, 점수를 출력
		Stream<Student> stdStream = list.stream();
		stdStream.forEach(std -> {
			//System.out.println(std.getName() + " : " 
			//		+ std.getScore());
			
			String name = std.getName();
			int score = std.getScore();
			System.out.println(name + " : "+ score);
			});
		
		System.out.println("=============2====================");

		// 학생의 이름만 출력
		// stream 객체는 한번만 사용가능
		stdStream = list.stream();
		// map() - 매개변수에 일치(매핑)되는 것을 구현할 때 쓰는 함수
		//
		//		- 매개변수의 이름을 다시 모아서 묶어둠(매핑)
		// 학생 객체에 있는 이름만 출력함
		stdStream.map(std -> std.getName())
				.forEach(s -> System.out.println(s));
		
		System.out.println("=============3====================");

		// 학생 점수에 해당하는 내용만 출력
		// 정수인 경우 - mapToInt()을 사용한다.
		stdStream = list.stream();
		stdStream.mapToInt(std -> std.getScore())
				 .forEach(n -> System.out.println(n));
		
		System.out.println("=============4====================");

		// 점수가 90점 이상인 학생의 이름을 출력
		// filter() 함수 - 조건에 일치되는 내용을 걸러낼 때 사용한다.
		list.stream().filter(std -> std.getScore() >= 90)
					 .map(std -> std.getName())
					 .forEach(s -> System.out.println(s));
	}

}
