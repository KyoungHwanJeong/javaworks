package whileexample;

import java.util.Scanner;

public class ClassGrades {

	public static void main(String[] args) {
	
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
