package polymorphism.fruits_2;

import java.util.Scanner;

public class Main {

	/*
	 * 객체의 다형성 - fruit 객체를 만들고 선택적으로 포도, 바나나, 복숭아
	 * 				의 정보를 출력한다.
	 * 
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

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 포도 | 2. 바나나 | 3. 복숭아");
		System.out.println("선택(번호 입력)> ");
		
		int selectNum=Integer.parseInt(scanner.nextLine());
		Fruit fruit=null;
		
		if(selectNum==1) {
			fruit= new Grape();
		}else if(selectNum==2) {
			fruit= new Banana();
		}else if(selectNum==3) {
			fruit= new Peach();
		}else {
			System.out.println("유효하지 않은 값입니다.");
		}
		
		fruit.showFruitInfo();
		scanner.close();
	}

}
