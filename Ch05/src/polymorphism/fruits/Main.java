package polymorphism.fruits;

import java.util.Scanner;

public class Main {

	/*
	 * 메뉴 선택화면
	 * 1. 포토 | 2. 바나나 | 3. 복숭아
	 * 
	 * 객체- 포도, 바나나, 복숭아는 과일에 상속받는다.
	 * 이름: 포도, 무게 700g, 가격 5000
	 * 이름: 바나나, 무게 600g, 가격 4000
	 * 이름: 복숭아, 무게 900g, 가격 10000
	 * 
	 * showFruitInfo 에서 
	 * 과일 이름, 무게, 가격을 출력한다.
	 * 
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" 1. 포도 | 2. 바나나 | 3. 복숭아");
		System.out.print("선택> ");
		
		// 문자를 숫자형으로 변환
		int selectNo = Integer.parseInt(sc.nextLine());
		
		// 객체 생성시 다형성을 이용
		Fruit fruit = null;
		
		if(selectNo==1) {
			fruit = new Grape();		
		}else if(selectNo==2) {
			fruit = new Banana();
		}else if(selectNo==3) {
			fruit = new Peach();
		}else {
			System.out.println("지원되는 기능이 없습니다.");
		}
		fruit.showFruitInfo();
		
		sc.close();
	}

}
