/*
 * HashSet 활용하기.
 * - 중복은 안되고 순서가 있다.
 * 1. Student형 HashSet을 생성한다.
 * 2. 학생 인스턴스를 생성하고,
 * 객체:	학생1 = ("이순신", 101)
 * 		학생2 = ("강감찬", 102)
 * 		학생3 = ("홍길동", 103)
 * 		학생4 = ("강감찬", 102)
 * 를 저장하고, 자료를 리스트 형태로 출력하기.
 * 
*/

package collection.set_2;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {

		Set<Student> set1 = new HashSet<>();
		// 학생 인스턴스 생성
		Student stu1 = new Student("이순신", 101);
		Student stu2 = new Student("강감찬", 102);
		Student stu3 = new Student("홍길동", 103);
		Student stu4 = new Student("강감찬", 102);
		
		// 객체 저장
		set1.add(stu1);
		set1.add(stu2);
		set1.add(stu3);
		set1.add(stu4);
		
		// 자료 출력(리스트 형태)
		System.out.println(set1);
	}

}
