/*
 * stack 활용하기.
 * MyStack
 * 1. String형 ArrayList로 배열을 생성한다.
 * 2. 자료를 저장하는 push 메서드가 있고, 자료를 삭제하는
 *  pop 메서드가 있다.
 *  
 * MyStackTest
 * 1. 스택을 생성하고 객체 "a", "b", "c"를 넣는다.
 * 2. 객체를 4개 빼서 출력하기.
 * 
*/

package collection.stack_2;

public class MyStackTest {

	public static void main(String[] args) {

		MyStack stack1 = new MyStack();
		
		// 객체 넣기
		stack1.push("a");
		stack1.push("b");
		stack1.push("c");
		
		// 객체 빼기
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
	}

}
