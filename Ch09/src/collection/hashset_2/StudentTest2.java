/*
 * HashMap 활용하기.
 * key(String)와 value(Student)를 저장할 HashMap 객체를 생성한다.
 * 학생1=("이순신", 101)
 * 학생2=("강감찬", 102)
 * 학생3=("홍길동", 103)
 * 학생4=("강감찬", 102)
 * 
 * 의 인스턴스를 생성하고 저장한다.
 * HashMap을 출력하기.
 * 
*/

package collection.hashset_2;

import java.util.HashMap;
import java.util.Map;

public class StudentTest2 {

	public static void main(String[] args) {

		Map<String, Student> map= new HashMap<>();
		
		Student stu1= new Student("이순신", 101);
		Student stu2= new Student("강감찬", 102);
		Student stu3= new Student("홍길동", 103);
		Student stu4= new Student("강감찬", 102);
		
		map.put("이순신", stu1);
		map.put("강감찬", stu2);
		map.put("홍길동", stu3);
		map.put("강감찬", stu4);
		
		System.out.println(map);
	}

}
