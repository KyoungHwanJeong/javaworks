/*
 * HashMap 활용하기.
 * - 중복은 되지만, 순서가 없다.
 * 1. Student형 HahsMap을 생성한다.
 * 2. 학생 인스턴스를 생성하고,
 * 객체:	학생1 = ("이순신", 101)
 * 		학생2 = ("강감찬", 102)
 * 		학생3 = ("홍길동", 103)
 * 		학생4 = ("강감찬", 102)
 * 를 저장하고 자료를 리스트 형태로 출력하기.
 * 
*/

package collection.set_2;

import java.util.HashMap;
import java.util.Map;

public class StudentTest2 {

	public static void main(String[] args) {

		Map<String, Student> map1 = new HashMap<>();
		
		// 학생 인스턴스 생성
		Student stu1 = new Student("이순신", 101);
		Student stu2 = new Student("강감찬", 102);
		Student stu3 = new Student("홍길동", 103);
		Student stu4 = new Student("강감찬", 102);
		
		// 객체 저장
		map1.put("이순신", stu1);
		map1.put("강감찬", stu2);
		map1.put("홍길동", stu3);
		map1.put("강감찬", stu4);
		
		// 자료 출력
		System.out.println(map1);
	}

}
