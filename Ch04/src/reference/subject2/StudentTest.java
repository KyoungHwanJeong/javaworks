package reference.subject2;

public class StudentTest {
	
	/*
	 * 객체 내용: 학번 101, 이름 김대한
	 * 			국어 90점, 수학 85점, 과학 78점
	 * 
	 * subject 클래스의 정의
	 * 			- private로 과목이름, 과목점수를 선언하고,
	 * 			- get(),set()함수로 입출력 함수를 정의
	 * 
	 * student 클래스의 정의
	 * 			- 학번, 이름
	 * 			- 학번과 이름은 생성자로 입력을 받는다.
	 * 			- 과목 수를 subjects 배열에 입력받는다.
	 * 			- 과목을 추가하면 배열에 추가되고,
	 * 
	 * 			배열의 요소가 비어 있을 때만 저장된다.
	 * 
	 *  		학생 정보에서 총점과 평균을 출력하기.
	 */

	public static void main(String[] args) {

		Student kim = new Student(101, "김대한");
		Student park = new Student(102, "박민국");
		
		kim.addSubject("국어", 90);
		kim.addSubject("수학", 85);
		kim.addSubject("과학", 78);

		park.addSubject("코딩", 95);
		park.addSubject("Java", 88);

		kim.showStudentInfo();
		System.out.println("================================");
		park.showStudentInfo();
		
	}

}
