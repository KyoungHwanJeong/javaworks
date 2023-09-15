package whileexample;

import java.util.Scanner;

public class ClassGrade_2 {

	public static void main(String[] args) {

		// 학점 계산 프로그램
		// A(90점 이상), B(80점~), C(70점~), D(60점~), E(60미만)
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("점수를 입력하세요(0 ~ 100점): ");
			int score = scan.nextInt();
			
			if(100 >= score && score >= 90) {
				System.out.println("A 학점입니다.");
			}else if(90 > score && score >= 80) {
				System.out.println("B 학점입니다.");
			}else if(80 > score && score >= 70) {
				System.out.println("C 학점입니다.");
			}else if(70 > score && score >= 60) {
				System.out.println("D 학점입니다.");
			}else {
				System.out.println("E 학점입니다.");
			}

		}

	}

}
