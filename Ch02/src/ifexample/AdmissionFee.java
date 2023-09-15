package ifexample;

import java.util.Scanner;

public class AdmissionFee {

	public static void main(String[] args) {

		
		// 놀이 공원 입장료 계산
		// 취학 전 아동(8) - 1000, 초등(14) - 2000, 중고등(20) - 2500, 일반 -3500
		// 변수 - 나이(age), 입장료(fee)
		
		int memberAge, fee=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요: ");			// 나이를 입력 받음
		memberAge = scan.nextInt();
		
		if(memberAge >= 0 && memberAge < 8) {
			
			fee= 1000;									// 입장료
			System.out.println("취학 전 아동입니다.");
		}else if(memberAge >= 8 && memberAge < 14) {
			
			fee = 2000;
			System.out.println("초등 학생입니다.");
		}else if(memberAge >= 14 && memberAge < 20) {
			
			fee = 2500;
			System.out.println("중, 고등 학생입니다.");
		}
		else {
			
			fee = 3500;
			System.out.println("성인 입니다.");
		}
		
		
		System.out.println("입장료는 "+ fee +" 입니다.");
		
		scan.close();

	}

}
