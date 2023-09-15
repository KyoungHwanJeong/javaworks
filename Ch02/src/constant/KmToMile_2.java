package constant;

import java.util.Scanner;

public class KmToMile_2 {

	public static void main(String[] args) {

		// km를 입력 받아서 mile로 출력하는 프로그램
		// 변환상수 : 1 mile = 1.609344 km
		// 변수 - kph(km per hour), mph
		final double MILE = 1.609344;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 구속을 입력하세요(Km/h):");
		double Kph = sc.nextDouble();
		double Mph = Kph / MILE;
		
		System.out.printf("당신의 구속은 %10.2f [MPH] 입니다.",Mph);
		sc.close();
	}

}
