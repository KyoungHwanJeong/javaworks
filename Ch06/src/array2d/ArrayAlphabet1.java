package array2d;

public class ArrayAlphabet1 {

	/*
	 * 대문자 26자를 배열에 저장하고,
	 * 일반 for문을 사용해서 아스키 코드값 65~90까지의 알파벳 출력하기.
	 * 알파벳의 마지막 값을 출력하기.
	 * char 문자 'A'부터 +1한 26개의 문자를 배열에 저장하고,
	 * 다시 알파벳을 출력하기.
	 * 
	 * 
	*/
	
	public static void main(String[] args) {

		// 대문자 26자를 배열에 저장
		// for문 출력
/*		
		char c ='A';
		System.out.println(c);
		System.out.println((int)c);
		
		char c2 = 66;
		System.out.println(c2);
*/		
		
		System.out.println("=== 일반 for문을 사용 알파벳 출력 ====");
		char c;
		for(c=65; c<=90; c++) {	// ch = 65, ASCII코드 'A' 코드값
			System.out.print(c +" ");
		}
		System.out.println("\n변수의 마지막 값: " +(char)(c-1));	// Z
		
		System.out.println("\n\n== 알파벳을 배열에 저장하고 출력 ==");
		char[] alphabets = new char[26];
		char ch ='A';
		
		//alphabets[0] = ch;
		//System.out.println(alphabets[0]);	// A
		
		//alphabets[1] = (char)(ch + 1);
								// ch= 2byte, 1= 4byte
								// JAVA에서 덧셈 연산하면 int형으로 바뀜.
								// -> 다시 형변환.
		/*
		ch++;				// ch = ch + 1, 1 증가(후 증가)
		alphabets[1] = ch;
		*/
		//System.out.println(alphabets[1]);	// B
		
		// 알파벳을 배열에 저장 - 1증가
		for(int i=0; i< alphabets.length;i++) {
			alphabets[i] = ch;
			ch++;

		}
		
		// 알파벳 출력
		for(int i=0; i< alphabets.length;i++) {
			System.out.print(alphabets[i]+ " ");
		}
		
		
	}

}
