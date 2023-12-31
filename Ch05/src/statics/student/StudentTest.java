package statics.student;

public class StudentTest {
	
	/*
	 * 학생 id 변수 초기값에 1000을 저장하고,
	 * 학생이 늘어나면 값이 1씩 증가한다.
	 * static 을 사용
	 * 클래스 변수는 클래스 이름으로 직접 접근하여
	 * 학생 id값과 학번을 출력하기.
	 * 
	 */

	public static void main(String[] args) {

		// 인스턴스 객체 변수, static - 클래스 객체 변수
		// 클래스 변수는 클래스의 이름으로 직접 접근(new 하지 않음)
		// 값이 공유되고, 누적되며 프로그램이 종료되면 소멸함.
		
		Student.serialNum++;
		System.out.println(Student.serialNum);		// 1001
		
		Student.serialNum++;
		System.out.println(Student.serialNum);		// 1002

		Student s1= new Student();
		Student s2= new Student();
		
		s1.setId(101);
		s2.setId(102);
		System.out.println("학번: " + s1.getId());
		System.out.println("s2= " + s2.getId());
		
		System.out.println("=====================================");
		
/*		
		s1.serialNum++;
		System.out.println(s1.serialNum);	// 1001
		s2.serialNum++;
		System.out.println(s2.serialNum);	// 1001
*/		
		
	}

}
