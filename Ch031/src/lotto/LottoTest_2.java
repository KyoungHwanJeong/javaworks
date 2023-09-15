package lotto;

public class LottoTest_2 {

	public static void main(String[] args) {

		/*
		 * 로또 번호 생성기
		 * 1~45 숫자 중에 6개 생성
		 * 중복 숫자가 나오지 않게 6개를 출력
		 */
		
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.print(lotto[5]);
		System.out.println();
		
		LottoTest lottotest = new LottoTest();
		System.out.println(lottotest);
	}
	

}
