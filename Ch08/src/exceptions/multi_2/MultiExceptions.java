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

package exceptions.multi_2;

public class MultiExceptions {

	public static void main(String[] args) {

		String array[] = {"123", "456a"};
		
		for(int i=0;i<=array.length;i++) {
			try {
				int val = Integer.parseInt(array[i]);
				System.out.print(val + " \n");
			}catch(NumberFormatException e){
				System.out.println("숫자로 변환할 수 없는 항목이 있습니다.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다.");
			}
		}
	}

}
