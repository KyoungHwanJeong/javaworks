/*
 * 이중 예외처리하기.
 * 1. 문자열 배열에 "100", "123a"를 넣고, 이 값들을 숫자로 변환하는 것을
 * try-catch 문으로 만들기.
 * 2. 변환된 값을 출력하고,
 * 3. 예외 발생으로 NumberFormatException 은 "숫자로 변환할 수 없는 항목이 있습니다."
 * 를 ArrayIndexOutOfBoundsException 은 "배열의 범위를 초과했습니다."를 출력한다.
 * 
 * 
*/

package exceptions.multi;

public class MultiExceptions {

	public static void main(String[] args) {

		// 문자열을 숫자로 변환 - NumberFormatException
		// 인덱스 범위 에러 - ArrayIndexOutOfBoundsException
		String[] array = {"100", "123a"};	// array[0], array[1]
		
		for(int i = 0; i <= array.length; i++) {
			try {
				//System.out.println(array[i]);
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
				
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없는 항목이 있습니다.");
			}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("배열의 범위를 초과했습니다.");
			}
			// 에러 1. NumberFormatException : 123a를 숫자로 변환할 수 없음.
			// 에러 2. ArrayIndexOutOfBoundsException
			//					: i=2가 되면 배열 범위를 초과함.
								
		}
	}

}
