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

package collection.hashset;

// ctrl + shift + o
import java.util.HashMap;
import java.util.Map;

public class StudentTest2 {

	public static void main(String[] args) {
		
		// 학생의 이름과 점수를 저장할 HashMap 객체 생성
		Map<String, Student> map = new HashMap<>();
		
		// 학생 인스턴스 생성
		Student std1 = new Student("이순신", 101);
		Student std2 = new Student("강감찬", 102);
		Student std3 = new Student("홍길동", 103);
		Student std4 = new Student("강감찬", 102);
		
		// 객체 추가
		map.put("이순신", std1);
		map.put("강감찬", std2);
		map.put("홍길동", std3);
		map.put("강감찬", std4);
		
		
		//map 객체 출력
		System.out.println(map);
		
	}
}
