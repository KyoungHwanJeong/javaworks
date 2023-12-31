package interfaceex.remocon;

// 필드, 생성자는 없음
public interface RemoteControl {

	// 인터페이스 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메서드
	public void turnOn();

	public void turnOff();
	
	public void setVolume(int volume);
	
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	// 일반(구체화) 메서드 - default 키워드를 붙인다.
	default void setMute(boolean mute) {
		if(mute) { 	// mute == true
			System.out.println("무음 처리합니다.");
		}else {		// mute == false
			System.out.println("무음 해제합니다.");
		}
	}
	
}
