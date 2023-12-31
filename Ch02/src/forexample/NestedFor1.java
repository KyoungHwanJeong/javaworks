package forexample;

public class NestedFor1 {

	public static void main(String[] args) {
		
		/* 별 그리기
		   *****
		   *****
		   *****
		   *****
		   *****
		 
		   *
		   **
		   ***
		   ****
		   *****
		 
		   *****
		   ****
		   ***
		   **
		   *
		   
		   변수는 i와 j만 써서 출력
		   *****
		   ****
		   ***
		   **
		   *
		   
		       *
		      ***
		     *****
		    *******
		   *********
		   
		   *********
		    *******
		     *****
		      ***
		       *
		 */
		// 중첩 for문
		// 5행 5열에 '*' 출력


		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print('*');
			}
			System.out.println();	// 한줄 띄움

		}
		System.out.println();	// 한줄 띄움

		
		/*
		 *  	i=1 j=1 *
		 * 			j=2	**
		 * 			j=3	***
		 * 			j=4	****
		 * 			j=5	*****
		 * 		i=2 j=1 *
		 * 			j=2 **
		 * 			j=3 ***
		 * 			j=4 ****
		 * 			j=5 *****
		 * 		i=3 *****
		 * 		i=4 *****
		 * 		i=5 *****
		 */

		// 삼각형 모양1
		 /*  	i=1 j=1 *
		 * 			j=2	**
		 * 			j=3	***
		 * 			j=4	****
		 * 			j=5	*****
		*/
		
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();	// 한줄 띄움
		}
		System.out.println();	// 한줄 띄움

		
		// 삼각형 모양2
		 /*  			*****
		 * 				****
		 * 				***
		 * 				**
		 * 				*
		*/
		
		for(int i =1; i<=5; i++) {
			for(int j =1; j<=6-i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();

		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print('*');
				//System.out.print(" i=" +i+ ", j=" +j);
			}
			System.out.println(); //한줄 띄움
		}
		
		/*
			 *
			***
	       *****
		  *******
		 *********
		*/
		for(int i= 1; i<=5; i++) {
			for(int j =1; j<=5-i; j++) {
				System.out.print(' ');
			}
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		/*
		 *********
		  *******
		   *****
		    ***
		     *
		*/
		
		for(int i= 0; i<5;i++) {
			for(int j=0; j<i; j++) {
				System.out.print(' ');
			}
			for(int k=0; k<9-i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		System.out.println();

		
	}

}
