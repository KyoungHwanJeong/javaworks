/*
 * 지역 내부 클래스 사용하기. Runnable 인터페이스 사용하기.
 * 1. 지역 내부 클래스 Outer 안에 int형 변수 outNum=100을 선언하고,
 *  static int형 변수 sNum=200을 선언한다.
 * 2. 내부에 Runnable 인터페이스를 사용하고, Runnable에는 int형 변수 num=10을
 * 	선언하고, MyRunnable 클래스의 객체를 생성한다.
 * 3. Runnable의 내부 클래스 MyRunnable 클래스는 Runnable 인터페이스의 상속을 받으며,
 *  int형 변수 local=20과 run()메서드를 가지고 있다.
 * run()
 * 1. int형 변수 localNum=30으로 바꾸고 OutNum과 sNum, localNum, num을 각각 출력한다.
 * Main()
 * 1. Outer 클래스의 객체를 생성하고, run()을 호출한다.
 * 
 * 
*/

package nestedclass.localinner;

// 지역 내부 클래스
class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	// 메서드 - MyRunnable 클래스
	Runnable getRunnable() {
		int num = 10;	//로컬 변수(인터페이스 상수)
						// Runnable에서는 상수, final효과
		
		class MyRunnable implements Runnable{// Runnable인터페이스
			int localNum =20;
			
			@Override
			public void run() {
				//num =20;	// 상수로 변환되어 변경할 수 없음.(final이 있음)
				localNum =30;
				System.out.println(outNum + "(외부클래스의 인스턴스 변수)");
				System.out.println(sNum + "(외부클래스의 정적 변수)");
				System.out.println(localNum + "(내부클래스의 멤버 변수)");
				System.out.println(num);
				}
			
		}
		
		MyRunnable myRun = new MyRunnable();
		return myRun;
		//return new MyRunnable();
	}
}



public class LocalInnerClass {

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.getRunnable().run();
		
	}

}
