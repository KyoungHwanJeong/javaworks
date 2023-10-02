/*
 * HashSet 활용하기.
 * Student형 객체를 저장할 HashSet을 생성한다.
 * 학생1=("이순신", 101)
 * 학생2=("강감찬", 102)
 * 학생3=("홍길동", 103)
 * 학생4=("강감찬", 102)
 * 
 * 의 학생 인스턴스를 생성하고, 저장한다.
 * HashSet을 리스트 형태로 출력하기.
 * 
*/

package collection.hashset_2;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {

		Set<Student> set=new HashSet<>();
		
		set.add(new Student("이순신", 101));
		set.add(new Student("강감찬", 102));
		set.add(new Student("홍길동", 103));
		set.add(new Student("강감찬", 102));
		
		System.out.println(set);
	}

}
