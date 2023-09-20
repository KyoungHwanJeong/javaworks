package arraylist.score;

/*
 * 
 * 
 * 
 * 
 * 
 * 
 *
 * 
 * 
*/

public class Main {

	public static void main(String[] args) {

		// Student 객체 생성
		Student std = new Student(101, "우영우");
		
		std.addSubject("국어", 90);
		std.addSubject("수학", 85);
		std.addSubject("Java", 82);
		
		std.showStudentInfo();
	}

}
