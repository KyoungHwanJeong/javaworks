package reference.subject;

public class StudentMain {

	public static void main(String[] args) {

		/*
		 * 객체들: 학생(학번, 이름): (101,"홍길동"), (102,"임꺽정"), (103,"임상옥")
		 * 		
		 * 				홍길동의 	"국어", 90점 
		 * 						"수학", 83점
		 *
		 *				임꺽정의	"국어", 80점
		 *						"수학", 77점
		 *
		 *				임상옥의 	"국어", 95점
		 *						"수학", 90점
		 * 
		 * Subject 클래스의 정의 : 과목이름, 점수를 private로 정의하고,
		 * 						getter, setter함수로 입력받고 출력하는 내용,
		 * 
		 * Student 클래스의 정의 : 학생이름, 학번, 국어과목, 수학과목
		 * 						생성자로 학번과 이름 입력받기(korean, math 객체 생성)
		 * 						국어 과목과 수학 과목 추가 메서드,
		 * 						학생의 정보 출력하기 "학생의" "점수는" "점 입니다."
		 * 
		 * Main 함수의 정의 : 학생 전체의 국어와 수학 점수를 출력하고,
		 * 					향상된 for문으로도 출력하기.
		 * 
		*/
		
		
		/*
		// std1, std2 객체 생성하기
		Student std1 = new Student(101,"홍길동");
		Student std2 = new Student(102,"정경환");
		
		// 과목추가
		std1.koreanSubject("국어", 90);
		std1.mathSubject("수학", 83);
		
		std2.koreanSubject("국어", 11);
		std2.mathSubject("수학", 22);
		
		// 학생 정보 출력
		std1.showStudentInfo();
		std2.showStudentInfo();
*/		
		// 객체 배열
		Student[] students = {
			new Student(101,"홍길동"), new Student(102,"임꺽정"),
			new Student(103,"임상옥")
		};
	
		students[0].koreanSubject("국어", 90);
		students[0].mathSubject("수학", 83);

		students[1].koreanSubject("국어", 80);
		students[1].mathSubject("수학", 77);
		
		students[2].koreanSubject("국어", 95);
		students[2].mathSubject("수학", 90);
		
		students[0].showStudentInfo();
		students[1].showStudentInfo();
		students[2].showStudentInfo();
		
		System.out.println("=============================");
		//전체 출력
		for(int i=0; i<students.length;i++) {
			students[i].showStudentInfo();
		}
		System.out.println("=============================");
		// 향상 for문
		for(Student student11: students) {
			student11.showStudentInfo();
		}
	
	}
}
