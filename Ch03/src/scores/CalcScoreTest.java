package scores;

import java.util.Scanner;

public class CalcScoreTest {

	
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
		
		// 성적 처리 프로그램
		// 입력시 잘못된 입력이 있는 경우 - 예외 처리
		// try~ catch 구문사용
		
		Scanner sc = new Scanner(System.in);
		boolean sw = true;		// 상태 변수
		int studentCount = 0;
		int[] scores = null;
		int sumVal = 0;
		double avg;

		
		while(sw) {
			try{
				System.out.println("=================================================");
				System.out.println("|1.학생수 | 2.점수입력 | 3.점수리스트 |4. 분석 | 5. 종료");
				System.out.println("=================================================");
				
				// 문자를 숫자로 변환 (String, Integer --- > int)
				int menu = Integer.parseInt(sc.nextLine());	// 메뉴 번호 입력
							
				if(menu == 1) {
					System.out.println("학생수> ");
					studentCount = Integer.parseInt(sc.nextLine());
					scores = new int[studentCount];	// 학생수는 배열의 크기이다.
				}else if(menu == 2) {				// 배열에 점수를 저장.
					for(int i=0; i<scores.length;i++) {
						System.out.print("scores[" + i + "]>");
						scores[i] = Integer.parseInt(sc.nextLine());
					}
				}else if(menu == 3) {				// 전체조회(출력)
					for(int i=0; i<scores.length;i++) {
						System.out.println("scores[" + i + "]>" + scores[i]);
					}
				}else if(menu == 4) {				//통계 분석
	//					int sumVal = 0;
	//					double avg;
						int maxVal = scores[0];
						for(int i=0; i<scores.length;i++) {
							sumVal +=scores[i];
							if(scores[i]> maxVal) {
								maxVal = scores[i];
							}
						}
						avg= (double)sumVal/scores.length;
						System.out.println("최고 점수: " + maxVal);
						System.out.printf("평균 점수: %.2f\n", avg);
						
				}else if(menu == 5) {
						sw= false;
				}else {
					System.out.println("지원하지 않는 기능입니다.");
				}
			}catch(Exception e) {
				System.out.println("올바른 입력이 아닙니다. 숫자를 입력해주세요.");
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
		
	}

}
