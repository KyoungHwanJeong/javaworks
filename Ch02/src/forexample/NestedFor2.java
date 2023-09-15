package forexample;

public class NestedFor2 {

	public static void main(String[] args) {

		/*
		 * num = 22까지 숫자를 5열에 배치하는 프로그램
		*/
		
		// 숫자가 1증가 패턴
		/*
		 							첫 번째 열 -1, 6, 11, 16
		 							5- 열의 개수, i - 0, 1, 2, 3
		 1 2 3 4 5				---> (5*0)+1
		 6 7 8 9 10				---> (5*1)+1
		 11 12 13 14 15			---> (5*2)+1
		 16 17 18 19 20			---> (5*3)+1
		
		 */
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<=5;j++) {
				//System.out.print(5*i+j+ " ");
				int num = 5*i+j;
				if(num>22)
					break;
				System.out.print(num + " ");

			}
			System.out.println();
		}
		
	}

}
