package whileexample;

public class WhileIfBreak_2 {

	public static void main(String[] args) {

		// 반복 조건문
		// 1부터 10까지 출력 if문 break를 써서...
		
		
		int i = 0;
		
		while(true) {
			i++;
			System.out.print(i);
			
			if(i == 10)
				break;
		}
		
	}

}
