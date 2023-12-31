package reference.subject2;

import reference.subject.Subject;

public class Student {

	private int studentId;		//int studentId = 0
	private String studentName;	// String studentName=null
	private Subject[] subjects;
	
	
	public Student(int studentId, String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
		subjects= new Subject[10];	// 과목을 저장할 배열의 크기
									// 10개 생성
	
	}
	
	
	//과목 추가(생성자로 넣을 수도 있다.)
	public void addSubject(String name, int score) {
		//과목 객체를 생성해서 값을 저장한다.
		//Subject subject = new Subject();
		//subject.setSubjectName(name);
		//subject.setscorePoint(score);
		Subject subject = new Subject(name, score);
		
		//과목을 배열에 저장
		//subjects[0]= subject; // 1개 저장
		for(int i=0;i<subjects.length;i++) {
			// 배열의 요소가 비어있을때
			if(subjects[i]== null) {
				// 배열의 객체를 저장
				subjects[i]= subject;
				break;	// 빠져나옴.
			}
		}

	}
	
	// 학생 정보 출력
	public void showStudentInfo() {
		int total = 0;			// 총점
		double average =0.0;	// 평균
		int count=0;			//개수
		for(int i=0;i<subjects.length;i++) {
			// 배열의 요소가 차 있을 때(비어 있지 않을 때)
			if(subjects[i]!=null) {
				// subject에 subjects[i] 배열을 저장한다.
				//객체를 생성하고 출력
				//Subject subject = subjects[i];		//(없어도 되긴함)
				total += subjects[i].getscorePoint();	// 점수 누적.
				count++;	// if문이 true이면 1 증가
				
				System.out.println(studentId + "번 학생 " 
						+ studentName
						+ "의 " + subjects[i].getSubjectName()
						+ "점수는 " + subjects[i].getscorePoint()
						+ "점 입니다.");
				}
		}
		average =(double)total/count;
		System.out.printf("과목의 총점은: %d점이고,"
				+ "평균은 %.1f 입니다.\n", total, average);
	}
}
