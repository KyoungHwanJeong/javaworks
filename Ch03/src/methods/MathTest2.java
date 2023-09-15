package methods;

public class MathTest2 {

	public static void main(String[] args) {

		/*
		 * 주사위 10 번 던지기
		 * 전체 출력
		 * word ={"나", "너", "우리", "나라", "우주"} 배열 출력
		 * 배열에서 문자열 랜덤 추출
		 */
		
		
		// 주사위 10 번 던지기
		
		for(int i=0; i<10;i++) {
			int dice = (int)(Math.random()*6+1);
			System.out.println(dice);
		}
		
		String[] word ={"나", "너", "우리", "나라", "우주"};
		System.out.println(word[0]);

		// 전체 출력
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);
		}
		
		
		// 배열에서 문자열 랜덤 추출

		int idx = (int)(Math.random()*word.length);	// 0~4
		//System.out.println("idx =" + idx);
		System.out.println(word[idx]);
		
	}

}
