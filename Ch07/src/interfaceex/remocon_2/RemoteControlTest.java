	/*
	 * 리모콘 기능.
	 * <결과>
	 * TV를 켭니다.
	 * 현재 TV 볼륨: 10
	 * 무음 처리합니다.
	 * 무음 해제합니다.
	 * TV를 끕니다.
	 * 건전지를 교환합니다.
	 * 
	 * RemoteControl 인터페이스
	 * 1. RemoteControl 인터페이스에는 티비를 켜고, 끄기가 선언되어 있고,
	 * 볼륨을 올리고 내리는 설정이 선언 되어 있다.
	 * 2. 그리고 배터리를 교체하는 메서드와 무음처리(mute) 메서드가 있다.
	 * 
	 * Television
	 * 1. TV는 RemoteControl 의 상속을 받는다.
	 * 2. 볼륨은 0 ~ 10사이에만 설정할 수 있으며 현재 볼륨을 입력받아 
	 *  "현재 TV 볼륨: "으로 출력한다.
	 * 
	 * RemoteControlTest
	 * 1. TV를 켜고 볼륨을 12와 0으로 맞추고 출력하기.
	 * 2. 무음처리 기능 true, false로 출력하기.
	 * 3. TV를 끄고 건전지 교환 메서드를 호출해서 출력하기.
	 * 
	*/

package interfaceex.remocon_2;

public class RemoteControlTest {

	public static void main(String[] args) {

		
	}

}
