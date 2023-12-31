package arraylist.score;

/*
 * << 결과 내용 >>
 * 학생 우영우의 국어 과목 점수는 90점 입니다.
 * 학생 우영우의 수학 과목 점수는 85점 입니다.
 * 학생 우영우의 Java 과목 점수는 82점 입니다.
 * 학생 우영우의 총점은 257점 입니다. 학생 우영우의 평균은 85.67점 입니다.
 * 
 * 과목은 ArrayList로 관리하며, 입력을 받고 저장한다. 
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
