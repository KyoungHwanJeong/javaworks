package interfaceex.remocon2_2;

public interface RemoteControl {

	public final int MAX_VOLUME =10;
	public final int MIN_VOLUME =0;
	public void tvTurnOn();
	public void tvTurnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean m) {
		if(true) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음을 해제합니다.");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
