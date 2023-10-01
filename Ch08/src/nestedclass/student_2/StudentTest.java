/*
 * 중첩 내부 클래스 이용하기.
 * 1. 외부클래스 Student에 객체 jang을 생성하고, "장그래"를 입력받는다.
 * 2. Main에서 영어 점수=88점, 수학 점수=73점을 입력 받고, 외부클래스 Student의
 *  내부 클래스 Score에서 받아서 이름과 영어점수, 수학점수를 출력하기.
 * 
*/

package nestedclass.student_2;

class Student{
	
	private String name;
	
	public Student(String name) {
		this.name=name;
	}
	
	class Score{
		int engScore;
		int mathScore;
		
		public void showStudentInfo() {
			System.out.println("이름: " + name);
			System.out.println("영어 점수: " + engScore);
			System.out.println("수학 점수: " + mathScore);
		}
		
	}
}



public class StudentTest {

	public static void main(String[] args) {

		Student jang = new Student("장그래");
	
		Student.Score stuScore = jang.new Score();
		stuScore.engScore =88;
		stuScore.mathScore =73;
		
		stuScore.showStudentInfo();
	}

}
