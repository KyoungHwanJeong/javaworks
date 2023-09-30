package interfaceex.remocon2_2;

public class SmartTV implements Searchable, RemoteControl{

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

		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}

	@Override
	public void searchUrl(String url) {

		System.out.println(url +"를 검색합니다.");
	}

	@Override
	public void readUrl(String url) {

		System.out.println(url +"를 불러옵니다.");
	}

}
