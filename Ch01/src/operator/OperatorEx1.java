package operator;

public class OperatorEx1 {
	
	
	
/*	
	public static int SumScore(int korScore, int mathScore) {
		
		
		return (korScore+mathScore);
	}
	
	public static double avgScore(int korScore, int mathScore) {
		
		return (double)SumScore(korScore, mathScore)/2;
	}
*/
	public static void main(String[] args) {
		// 산술연산자(산술 +, -, *, /, %(나머지)
		// 계산의 결과는 기본이 정수형이 됨
		// 자바의 기본형은 int와 double

		System.out.println(4+8);	// 11
		System.out.println(4-8);	// -3
		System.out.println(4*8);	// 28
		System.out.println((double)4/8);// 11, 형 변환(type conversion)
		System.out.println(4%8);	// 0
	
		// 나머지 연산자
		System.out.println(5%2);
		// 홀수, 짝수 판별
		System.out.println(4%2);	// 0 (짝수)
		
		
		System.out.println("================");
		
		// 산술 연산자(변수 사용)
		
		int num1=4, num2=8;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println((double)num1 / num2);
		
		
		
		// 점수의 합계, 평균
		int korScore = 95, mathScore= 80;	// 국어점수가 90점 ('='은 대입연산자)
		int sumScore = 0;	// 합계 변수 선언
		double avgScore =0.0;	// 평균 = 총점 / 과목수 
		
		sumScore = korScore + mathScore;	// 합계
		avgScore = (double)sumScore/2;				// 평균
		
		System.out.println("총점: "+sumScore);
		System.out.println("평균: "+avgScore);

		

		
//		System.out.println("총점: "+SumScore(korScore,mathScore));
//		System.out.println("평균: "+avgScore(korScore,mathScore));
	

	}



}
	

