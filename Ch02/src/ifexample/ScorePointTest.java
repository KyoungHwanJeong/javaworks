package ifexample;

import java.util.Scanner;

public class ScorePointTest {

	public static void main(String[] args) {

		// 점수에 따른 학점 출력 프로그램
		// 변수 - score(정수형 int), grade(문자형 String, char)
		// A학점 = 90 점 ~ 100 점
		// B학점 = 80 점 ~ 90 점
		// C학점 = 70 점 ~ 80 점
		// D학점 = 60 점 ~ 70 점
		// F학점 = 0 점 ~ 60점
		
		Scanner scan = new Scanner(System.in);	// 객체(변수) scan 생성, 참조형 자료형
		// 입력
		
//		int score = 85;
		char grade = 'A';	// char - 한 문자(홑 따옴표)
//		String grade = "A";	// String - " "
	
		System.out.print("점수를 입력하세요: ");

		int score = scan.nextInt();
		
		
		// 연산
		
		if((score >= 90) && (score <= 100)) {	// true && true
			grade = 'A';
		}else if((score >= 80) && (score < 90)) {
			grade = 'B';
		}else if((score >= 70) && (score < 80)) {
			grade = 'C';
		}else if((score >= 60) && (score < 70)) {
			grade = 'D';
		}else {					// else if((score >= 0) && (score < 60))
			grade = 'F';
		}
		
		
		// 출력
		
		System.out.println(grade + " 학점입니다.");
		
		scan.close();
		
		
	}

}
