package singleton.student;

public class StudentMain {

	public static void main(String[] args) {

		School sc1 = School.getinstance();
		School sc2 = School.getinstance();
		
		Student student1 = sc1.newStudent();
		Student student2 = sc1.newStudent();
		Student student3 = sc1.newStudent();
		
		System.out.println("학번: " + student1.getstuId());
		System.out.println("학번: " + student2.getstuId());
		System.out.println("학번: " + student3.getstuId());
		
		// 학교 객체의 주소
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println();
		
		// 학생 객체의 주소
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
	}

}
