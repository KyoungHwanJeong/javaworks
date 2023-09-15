package methods;

public class MathTest_2 {

	public static void main(String[] args) {

		/*
		 * v1 = -10 절대값 출력, v2 = 5.67 반올림 출력, v3 = 3.31 버림 출력
		 * rand = random 출력, dice = 주사위random 출력
		 * 1 ~ 10까지 자연수(int) number를 random 출력
		*/
		
		int v1= Math.abs(-10);
		float v2= Math.round(5.67);
		double v3= Math.floor(3.31);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		double rand= Math.random();
		System.out.println(rand);
		
		int dice= (int)(Math.random()*6+1);
		System.out.println(dice);
		
		int number= (int)(Math.random()*10+1);
		System.out.println(number);
	}

}
