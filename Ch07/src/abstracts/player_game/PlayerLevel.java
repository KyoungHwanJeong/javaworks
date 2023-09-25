package abstracts.player_game;

public abstract class PlayerLevel {

	// 추상메서드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	
	// 템플릿 메서드
	public final void go(int count) {
		run();
		
		for(int i=0; i<count ;i++) {		// jump()는 횟수가 있다.
			jump();
		}

		turn();
	}
}