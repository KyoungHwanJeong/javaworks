/*
 * 배열에 저장된 숫자를 정렬하는 ascending, descending 알고리즘 만들기.
 * 
 * "정렬 방식을 선택하세요."
 * "B: BubbleSort"
 * "H: HeapSort"
 * "Q: QuickSort"
 * 
 * BubbleSort와 HeapSort, QuickSort는 Sort 인터페이스의 상속을 받는다.
 * Sort 인터페이스
 * 1. Sort 인터페이스에는 입력된 숫자들을 오름차순, 내림차순,
 * 	"숫자를 정렬하는 알고리즘입니다."로 출력하는 문구가 선언되어 있다.
 * BubbleSort
 * 1. 입력된 숫자들을 BubbleSort의 오름차순, 내림차순으로 출력하고,
 *  "숫자를 정렬하는 알고리즘입니다." 와 함께 "BubbleSort 입니다."
 *  가 출력된다.
 * HeapSort
 * 1. 입력된 숫자들을 HeapSort의 오름차순, 내림차순으로 출력하고,
 *  "숫자를 정렬하는 알고리즘입니다." 와 함께 "HeapSort 입니다."
 *  가 출력된다.
 * QuickSort
 * 1. 입력된 숫자들을 QuickSort의 오름차순, 내림차순으로 출력하고,
 *  "숫자를 정렬하는 알고리즘입니다." 와 함께 "QuickSort 입니다."
 *  가 출력된다.
 * SortTest
 * 1. 문자를 입력 받아서 'B' 또는 'b'는  BubbleSort 방식,
 *  'H' 또는 'h'는 HeapSort 방식, 'Q' 또는 'q'는 QuickSort 방식으로 
 *  정렬한다.
 * 2. 크기가 10인 배열을 만들고, 배열 안에 문자를 입력 받아서
 * 3. 오름차순 정렬을 출력하기.
 * 4. 내림차순 정렬을 출력하기.
 * 5. description을 출력하기.
 * 
 */

package interfaceex.sortp346_2;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {

		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B 또는 b: BubbleSort");
		System.out.println("H 또는 h: HeapSort");
		System.out.println("Q 또는 q: QuickSort");
		
		int ch=System.in.read();
		Sort sort=null;
		
		if(ch=='B'||ch=='b') {
			sort=new BubbleSort();
		}else if(ch=='H'||ch=='h') {
			sort=new HeapSort();
		}else if(ch=='Q'||ch=='q') {
			sort=new QuickSort();
		}else {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		int arr[] = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
