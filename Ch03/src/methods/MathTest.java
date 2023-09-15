package methods;

public class MathTest {

	public static void main(String[] args) {

		/*
		 * v1 = -10 절대값 출력, v2 = 5.67 반올림 출력, v3 = 3.31 버림 출력
		 * rand = random 출력, dice = 주사위random 출력
		 * 1 ~ 10까지 자연수(int) number를 random 출력
		*/
		
		// 내장 함수 - 수학(Math)
		// 절대값, 반올림, 버림
		
		int v1 =  Math.abs(-10);	// 절대값(거리): 양수 ->양수, 음수 ->양수
		System.out.println("v1 = "+ v1);
		
		long v2 = Math.round(5.67);	// 6 : 반올림해서 정수로 반환
		System.out.println("v2 = "+ v2);
		
		double v3 = Math.floor(3.31);	// 3.0 : 버림
		System.out.println("v3 = "+ v3);
		
		//random() - 무작위 수 0.0 <= rand 범위 < 1.0
		double rand = Math.random();
		System.out.println(rand);
		
		// dice - 주사위(1~6)
		int dice = (int)(Math.random()*6 + 1);	// 0.9*6 -5(반올림)
											// 0이 안나오게 하려면 +1
		System.out.println(dice);
		
		// 1 ~ 10까지 자연수를 무작위로 출력
		
		int number = (int)(Math.random()*10 + 1);
		System.out.println(number);
		
		
		}

}
