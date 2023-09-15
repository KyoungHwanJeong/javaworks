package ifexample;

import java.util.Scanner;

public class AdmissionFee_2 {

	public static void main(String[] args) {

		// 놀이 공원 입장료 계산
		// 취학 전 아동(8) - 1000, 초등(14) - 2000, 중고등(20) - 2500, 일반 -3500
		// 변수 - 나이(age), 입장료(fee)
		
		int fee;
		
		System.out.println("나이를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if(0 <= age && age < 8) {
			fee = 1000;
			System.out.println("취학 전 아동의 요금은 " + fee + "원 입니다.");
		}else if(8 <= age && age < 14) {
			fee = 2000;
			System.out.println("초등학생의 요금은 " + fee +"원 입니다.");
		}else if(14 <= age && age < 20) {
			fee = 2500;
			System.out.println("중, 고등학생의 요금은 " + fee +"원 입니다.");
		}else {
			fee = 3500;
			System.out.println("성인의 요금은 " + fee +"원 입니다.");
		}
		scan.close();
	}


}
