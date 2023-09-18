package array2d;

public class ArrayAlphabet2 {

	public static void main(String[] args) {

		// 2차원 배열에 알파벳 대문자 저장하기
		char[][] alphabets = new char[13][2];	// 26개
		char ch= 'A';
		
		for(int i=0;i<alphabets.length;i++) {
			for(int j=0; j<alphabets[i].length;j++) {
				alphabets[i][j]= ch;
				ch++;
			}
		}
		
		
		// 배열 요소 전체를 출력
		
		for(int i=0;i<alphabets.length;i++) {
			for(int j=0; j<alphabets[i].length;j++) {
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();	// 행 바꿈(줄 바꿈)
		}
		
		System.out.println("=====================================");
		
		
		// 2차원 배열에 알파벳 소문자 저장하기
		char[][] alphabets2 = new char[13][2];	// 26개
		char ch2= 'a';
				
		for(int i=0;i<alphabets2.length;i++) {
			for(int j=0; j<alphabets2[i].length;j++) {
				alphabets2[i][j]= ch2;
				ch2++;
			}
		}
				
					
		// 배열 요소 전체를 출력
				
		for(int i=0;i<alphabets2.length;i++) {
			for(int j=0; j<alphabets2[i].length;j++) {
				System.out.print(alphabets2[i][j] + " ");
				}
			System.out.println();	// 행 바꿈(줄 바꿈)
		}
	}

}
