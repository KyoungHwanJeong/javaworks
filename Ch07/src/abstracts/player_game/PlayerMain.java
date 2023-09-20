package abstracts.player_game;

public class PlayerMain {

	public static void main(String[] args) {

		// Player 인스턴스 생성
		Player player = new Player();
		player.play(1);
		
		// 중급자 레벨
		AdvancedLevel aLevel = new AdvancedLevel();
		player.setLevel(aLevel);	// setLevel = upgradeLevel
		player.play(2);
		
		// 고급자 레벨
		SuperLevel sLevel = new SuperLevel();
		player.setLevel(sLevel);
		player.play(3);

	}

}
