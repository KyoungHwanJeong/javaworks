package whileexample;

import java.util.Scanner;

public class ClassGrade {

	public static void main(String[] args) {
	
		// 학점 계산 프로그램
		// A(90점 이상), B(80점~), C(70점~), D(60점~), E(60미만)
		
		Scanner scan = new Scanner(System.in);

		
		
		while(true) {
			System.out.println("학점을 입력하세요: ");
			int gradeNum = scan.nextInt();
			String grade;
			
			if(gradeNum >=90) {
				grade ="A";
				System.out.println("학점은 "+ grade + "입니다.");

			}else if(gradeNum < 90 && gradeNum >=80) {
				grade ="B";
				System.out.println("학점은 "+ grade + "입니다.");
				
			}else if(gradeNum < 80 && gradeNum >=70) {
				grade ="C";
				System.out.println("학점은 "+ grade + "입니다.");

			
			}else if(gradeNum < 70 && gradeNum >=60) {
				grade ="D";
				System.out.println("학점은 "+ grade + "입니다.");
				
			}else {
				grade ="E";
				System.out.println("학점은 "+ grade + "입니다.");
			}
			

		}
		
		
	
	}

}
