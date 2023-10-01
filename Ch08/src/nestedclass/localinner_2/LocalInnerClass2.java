/*
 * 익명 클래스 사용하기.
 * 1. LocalInnerClass를 익명 클래스로 구현하기.
 * 
 * 
*/

package nestedclass.localinner_2;

class Out{
	int outNum=100;
	static int sNum=200;
	
	Runnable myRun = new Runnable() {

		int localNum=20;
		@Override
		public void run() {
			localNum=30;
			System.out.println(outNum + "(외부 클래스의 인스턴스 변수");
			System.out.println(sNum + "(외부 클래스의 정적 변수)");
			System.out.println(localNum + "(내부 클래스의 멤버 변수)");
		}
		
	};
}

public class LocalInnerClass2 {

	public static void main(String[] args) {

		Out out= new Out();
		out.myRun.run();
	}

}
