package lotto;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LottoTest {

	public static void main(String[] args) {

		/*
		 * 로또 번호 생성기
		 * 1~45 숫자 중에 6개 생성
		 * 중복 숫자가 나오지 않게 6개를 출력
		 */
		
		// 로또 번호 생성기
		// 1 ~ 45 숫자 중에 - 6 개 생성
		// 배열의 크기가 6개인 lotto선언
		
		int[] lotto = new int[6];
		lotto[0] = (int)(Math.random()*45+1);
		System.out.println(lotto[0]);
		System.out.println();
		
		for(int i=0; i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45+1);	// 6개를 동시에 생성
			
			// 중복 문제 해결 - 중첩 for
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;						// 이전 인덱스로 이동
				}
			}
			/*
			 *  7 9 3 9 20 16
			 *  i=0		7
			 *  i=1	j=0	9
			 *  i=2	j=1 3
			 *  i=3 j=2 9 중복(재 추첨)
			 *  i=4 j=3
			 */ 
			
			System.out.print(lotto[i] + " ");		// 6개를 출력

		}
		System.out.println();
		
		// 파일 이름 출력
		
		//LottoTest lottotest = new LottoTest();
		System.out.println(Arrays.toString(lotto));
	}

}
