package statics.student_2;

public class StudentTest {

	/*
	 * 학생	: 학번, 이름
	 * 
	 * 학생 id 변수 초기값에 1000을 저장하고,
	 * 학생이 늘어나면 값이 1씩 증가한다.
	 * static 을 사용
	 * 클래스 변수는 클래스 이름으로 직접 접근하여
	 * 학생 id값과 학번을 출력하기.
	 * 
	 */
	
	public static void main(String[] args) {

		
		Student stu1= new Student();
		Student stu2= new Student();
		
		Student.serialNumber++;		// 클래스 이름으로 접근
		stu1.setStudentId(101);
		System.out.println(Student.serialNumber);
		System.out.println("학번: "+stu1.getStudentId());
		
		Student.serialNumber++;		// 클래스 이름으로 접근
		stu2.setStudentId(102);
		System.out.println(Student.serialNumber);
		System.out.println("학번: "+stu2.getStudentId());
		
	}

}
