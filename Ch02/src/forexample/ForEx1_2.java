package forexample;

public class ForEx1_2 {

	public static void main(String[] args) {

		/*
		 * 1 ~ 10 출력
		 * 아스키 코드값 알파벳 출력 'A'
		 * 아스키코드 66, 65~90까지 아스키 코드
		 * 영어 아스키 코드값 65~123까지 출력
		 * 한글 유니 코드값 12593~12686까지 출력 
		*/

		
		for(int i=1;i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		char val1='A';
		System.out.println(val1);
		int val2=66;
		System.out.println((char)val2);
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+ " ");
		}
		System.out.println();
		for(int i=65;i<=123;i++) {
			System.out.print((char)i+ " ");
		}
		System.out.println();
		for(int i=12593;i<=12686;i++) {
			System.out.print((char)i+ " ");
		}
	}

}
