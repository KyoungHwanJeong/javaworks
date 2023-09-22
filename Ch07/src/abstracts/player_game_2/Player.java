package abstracts.player_game_2;

public class Player {

	private PlayerLevel level;
	
	public Player() {
		level = new Beginner();
		level.showLevelMessage();
	}
	
	public void setLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
