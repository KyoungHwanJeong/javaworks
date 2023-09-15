package scores;

import java.util.Scanner;

public class CalcScoreTest_2 {

	public static void main(String[] args) {

		/*
		 * 		"================================================="
		 *		"|1.학생수 | 2.점수입력 | 3.점수리스트 |4. 분석 | 5. 종료"
		 *		"================================================="
		 * 		성적 처리 프로그램
		 * 		입력시 잘못된 입력이 있는 경우 - 예외 처리 try ~catch구문 사용
		 * 		1. 학생수를 입력 받고
		 * 		2. 점수는 배열에 저장
		 * 		3. 번은 점수 리스트 출력
		 * 		4. 분석은 최고점수와 평균점수
		 * 		5. 는 종료
		 * 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		boolean sw= true;
		int studentNum=0;
		int[] scores= null;
		int maxScore;
		int total=0;
		double avg=0.0;
		
		while(sw) {
				try {
			
				System.out.println("=================================================");
				System.out.println("|1.학생수 | 2.점수입력 | 3.점수리스트 |4. 분석 | 5. 종료");
				System.out.println("=================================================");
	
				int menu=Integer.parseInt(sc.nextLine());
				if(menu==1) {
					System.out.println("학생 수를 입력하세요: ");
					studentNum=Integer.parseInt(sc.nextLine());
					scores= new int[studentNum];
				}else if(menu==2) {
					for(int i=0;i<scores.length;i++) {
						System.out.print("scores [" + i + "]= ");
						scores[i]=Integer.parseInt(sc.nextLine());
					}
				}else if(menu==3) {
					for(int i=0;i<scores.length;i++) {
						System.out.println("scores [" + i +"]= "+ scores[i]);
					}
				}else if(menu==4) {
					maxScore=scores[0];
					for(int i=0;i<scores.length;i++) {
						total+=scores[i];
						if(maxScore<scores[i]) {
							maxScore=scores[i];
						}
					}
					avg= (double)total/scores.length;
					System.out.println("최대값은:" + maxScore);
					System.out.printf("평균은: %.2f\n",avg);
				}else if(menu==5) {
					sw=false;
				}else {
					System.out.println("지원하지 않는 기능입니다.");
				}
			}catch(Exception e){
				System.out.println("올바른 입력이 아닙니다. 숫자를 입력해주세요.");
			}	
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
