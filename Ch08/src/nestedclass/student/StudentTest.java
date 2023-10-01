/*
 * 중첩 내부 클래스 이용하기.
 * 1. 외부클래스 Student에 객체 jang을 생성하고, "장그래"를 입력받는다.
 * 2. Main에서 영어 점수=88점, 수학 점수=73점을 입력 받고, 외부클래스 Student의
 *  내부 클래스 Score에서 받아서 이름과 영어점수, 수학점수를 출력하기.
 * 
*/

package nestedclass.student;

// 중첩 클래스는 클래스간 밀접한 관련이 있거나,
// 다른 클래스와 협력할 일이 없는 경우에 사용한다.
class Student{
	private String name;
	
	public Student(String name) {
		this.name= name;
	}
	
	// 중첩 클래스(내부 클래스)
	class Score{
		int eng;
		int math;
		
		void showInfo() {
			System.out.println("이름: " + name);
			System.out.println("영어 점수: " + eng);
			System.out.println("수학 점수: " + math);
		}
	}
	
}

public class StudentTest {

	public static void main(String[] args) {

		// 외부 클래스의 객체(인스턴스) 생성
		Student jang = new Student("장그래");
		
		// 내부 클래스의 인스턴스 생성
		// 외부클래스.내부클래스 인스턴스 = 내부 인스턴스.new 내부클래스()
		Student.Score score = jang.new Score();
		score.eng = 88;
		score.math = 73;
		score.showInfo();
		
	}

}
