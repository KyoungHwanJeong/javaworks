package interfaceex.remocon_2;

public class Television implements RemoteControl{

	private int volume;

	@Override
	public void tvTurnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void tvTurnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>10) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<0) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
	}

}
