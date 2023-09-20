package singleton.student_2;

/*
 * 싱글톤
 * School의 객체는 1개이고,
 * School 메서드: School 객체가 없다면 생성하고, 학교의 학생 수를 증가시킨다.
 * 
 * Student 메서드: 학생 객체를 생성하면 학번을 증가시키고, 학생에게 반환한다.
 * 
 * Main: 학생 3명을 학교에 등록하고, 학번 출력하기.
 *  학교 객체의 주소를 출력하기.
 *  학생 객체의 주소를 각각 출력하기.
 * 
 */

public class StudentMain {

	public static void main(String[] args) {

		School school1 = School.getInstance();
		School school2 = School.getInstance();
		
		Student student1 = school1.newStudent();
		Student student2 = school1.newStudent();
		Student student3 = school1.newStudent();
		
		System.out.println("학번: " + student1.getStudentId());
		System.out.println("학번: " + student2.getStudentId());
		System.out.println("학번: " + student3.getStudentId());
		
		System.out.println(school1);
		System.out.println(school2);
		System.out.println();
		
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		
	}

}
