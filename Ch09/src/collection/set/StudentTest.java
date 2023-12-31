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

package collection.set;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {

		// hashSet 자료구조의 인스턴스 생성
		Set<Student> set = new HashSet<>();
		
		// 학생 인스턴스 생성
		Student std1 = new Student("이순신", 101);
		Student std2 = new Student("강감찬", 102);
		Student std3 = new Student("홍길동", 103);
		Student std4 = new Student("강감찬", 102);

		
		// 자료 저장(추가)
		set.add(std1);
		set.add(std2);
		set.add(std3);
		set.add(std4);
		
		// 자료 출력 - 객체를 출력하면 리스트 형태로 출력
		System.out.println(set);
		
		
		
	}

}
