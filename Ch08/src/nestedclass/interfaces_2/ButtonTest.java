/*
 * 중첩 인터페이스 구현하기.
 * 
 * Button
 * 1. Button 클래스에 내부 인터페이스 OnClickListener가 있고,
 *  추상 메서드 onClick()을 선언한다.
 * 2. setListener() 메서드에서 외부에서 구현된 객체를를 입력 받아
 *  멤버 변수 listener에 저장한다.
 * 3. touch() 메서드에서 onClick() 메서드를 호출한다.
 * 
 * CallListener
 * 1. 내부 인터페이스 OnClickListener의 상속을 받고,
 * 2. onClick()메서드에는 "전화를 겁니다."를 출력한다.
 * 
 * MessageListener
 * 1. 내부 인터페이스 OnClickListener의 상속을 받고,
 * 2. onClick()메서드에는 "문자를 보냅니다."를 출력한다.
 * 
 * ButtonTest
 * 1. 전화 걸기 객체를 생성하고, setListener에 객체를 전달하고,
 * touch() 메서드로 출력하기.
 * 2. 익명 객체로 문자보내기 객체를 생성하고, setListener에 객체를
 * 전달하고, touch() 메서드로 출력하기.
 * 3. 익명 클래스로 사진찍기 객체를 생성하고, setListener에 객체를 
 * 전달하고, touch() 메서드로 "사진을 찍습니다."를 출력하기.
 * 4. 익명 클래스로 쇼핑하기 객체를 생성하고, setListener에 객체를 
 * 전달하고, touch() 메서드로 "상품을 구매합니다."를 출력하기.
 * 
 * 
*/

package nestedclass.interfaces_2;

public class ButtonTest {

	public static void main(String[] args) {

		Button button1 = new Button();
		
		System.out.println("===========1====================");
		
		CallListener call1 = new CallListener();
		button1.setListener(call1);
		button1.touch();
		
		System.out.println("===========2====================");

		button1.setListener(new MessageListener());
		button1.touch();
		
		System.out.println("===========3====================");

		
		button1.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		button1.touch();
		
		System.out.println("===========4====================");

		button1.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("상품을 구매합니다.");
			}
		});
		button1.touch();
	}

}
