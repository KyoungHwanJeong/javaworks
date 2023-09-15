package ifexample;

import java.util.Scanner;

public class ScorePointTest_2 {

	public static void main(String[] args) {
		// 점수에 따른 학점 출력 프로그램
		// 변수 - score(정수형 int), grade(문자형 String, char)
		// A학점 = 90 점 ~ 100 점
		// B학점 = 80 점 ~ 90 점
		// C학점 = 70 점 ~ 80 점
		// D학점 = 60 점 ~ 70 점
		// F학점 = 0 점 ~ 60점
		
		System.out.println("점수를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		char grade;
		
		if(score <= 100 && score >= 90) {
			grade = 'A';
		}else if(score < 90 && score >= 80) {
			grade = 'B';
		}else if(score < 80 && score >= 70) {
			grade = 'C';
		}else if(score < 70 && score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println(score + "점은 " + grade + " 학점입니다.");

		
	}

}
