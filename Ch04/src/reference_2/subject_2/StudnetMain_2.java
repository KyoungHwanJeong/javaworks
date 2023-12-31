package reference_2.subject_2;

public class StudnetMain_2 {

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
	
	public static void main(String[] args) {

		
		Student_2[] students ={
			new Student_2("홍길동", 101),
			new Student_2("임꺽정", 102),
			new Student_2("임상옥", 103)
		};
		
		students[0].koreanSubject("국어", 90);
		students[0].mathSubject("수학", 83);
		students[1].koreanSubject("국어", 80);
		students[1].mathSubject("수학", 77);	
		students[2].koreanSubject("국어", 95);
		students[2].mathSubject("수학", 90);
		
		for(int i=0; i<students.length;i++) {
			students[i].showStudent_2Info();
		}
		System.out.println("===================================");
		for(Student_2 stuArr1:students) {
			stuArr1.showStudent_2Info();
		}
	}

}
