/*
 * stream 이용하기.
 * 1. student 형 list를 선언하고,
 * 	객체 자료 ("콩쥐", 80), ("팥쥐", 70), ("심청", 90)을 순서대로 저장한다.
 * 2. stream을 생성하고 학생의 이름, 점수를 모두 출력하기.
 * 3. 학생의 이름만 출력하기.
 * 4. 학생의 점수만 출력하기.
 * 5. 점수가 90점 이상인 학생의 이름을 출력하기.(filter 함수 이용)
*/

package streams.student_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStream {

	public static void main(String[] args) {

		List<Student> list1 = Arrays.asList(
				new Student("콩쥐", 80),
				new Student("팥쥐", 70),
				new Student("심청", 90));
		System.out.println("==============1====================");
		// 학생의 이름, 점수를 모두 출력하기
		Stream<Student> stdStream = list1.stream();
		stdStream.forEach(std -> {
			String name = std.getName();
			int score = std.getScore();
			System.out.println(name + " : " + score);
		});
		
		System.out.println("==============2====================");
		// 학생 이름만 출력하기
		// 스트림은 사용하면 사라지므로 다시 선언한다
		stdStream = list1.stream();
		stdStream.map(std -> std.getName())
				.forEach(s -> System.out.println(s));
		
		System.out.println("==============3====================");
		// 학생의 점수만 출력하기
		stdStream = list1.stream();
		stdStream.mapToInt(std -> std.getScore())
				.forEach(n -> System.out.println(n));
		
		System.out.println("==============4====================");
		// 점수가 90점 이상인 학생의 이름을 출력하기
		list1.stream().filter(std -> std.getScore() >= 90)
					.map(std -> std.getName())
					.forEach(s -> System.out.println(s));
	}

}
