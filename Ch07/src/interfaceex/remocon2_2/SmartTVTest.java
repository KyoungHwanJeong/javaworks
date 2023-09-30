/*
 * 리모콘 기능2.
 * <결과>
 * TV를 켭니다.
 * 현재 TV 볼륨: 8
 * www.naver.com를 검색합니다.
 * www.naver.com를 불러옵니다.
 * 무음 처리합니다.
 * TV를 끕니다.
 * 건전지를 교환합니다.
 * 
 * Searchable 인터페이스
 * 1. Searchable 인터페이스는 url을 검색하고, 불러오기가 선언되어 있다.
 * 
 * RemoteControl 인터페이스
 * 1. RemoteControl 인터페이스에는 티비를 켜고, 끄기가 선언 되어 있고,
 * 볼륨을 올리고 내리는 설정이 선언 되어 있다.
 * 2. 그리고 배터리를 교체하는 메서드와 무음처리(mute) 메서드가 있다.
 * 
 * SmartTV
 * 1. SmartTV는 Searchable 인터페이스와 RemoteControl 인터페이스의
 *  상속을 받는다.
 * 2. 볼륨은 0~10사이에만 설정할 수 있으며 현재 볼륨을 입력 받아
 *	"현재 TV 볼륨: "으로 출력한다.
 *
 * SmartTVTest
 * 1. TV의 볼륨을 8로 맞춰놓고 출력하기.
 * 2. url 기능을 이용하여 www.naver.com 검색해서 출력하기.
 * 3. url 기능을 이용하여 www.naver.com 을 불러와서 출력하기.
 * 4. 무음 처리 기능을 off로 하고 출력하기.
 * 5. TV를 끄고 건전지 교환 메서드를 호출해서 출력하기.
 * 
*/

package interfaceex.remocon2_2;

public class SmartTVTest {

	public static void main(String[] args) {

		SmartTV tv2 = new SmartTV();
	
		RemoteControl rc2= tv2;
		Searchable s2= tv2;
		
		rc2.tvTurnOn();
		rc2.setVolume(8);
		s2.searchUrl("www.naver.com");
		s2.readUrl("www.naver.com");
		rc2.setMute(true);
		rc2.tvTurnOff();
	
		RemoteControl.changeBattery();
	}

}
