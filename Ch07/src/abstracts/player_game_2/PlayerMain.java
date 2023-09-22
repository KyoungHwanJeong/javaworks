package abstracts.player_game_2;

/* <출력결과>
 * *** 초보자 레벨입니다 ***
 * 천천히 달립니다.
 * jump 할 줄 모름
 * turn 할 줄 모름
 * *** 중급자 레벨입니다 ***
 * 빨리 달립니다.
 * 높이 jump 합니다.
 * 높이 jump 합니다.
 * turn 할 줄 모름
 * *** 고급자 레벨입니다. ***
 * 엄청 빨리 달립니다.
 * 매우 높이 jump 합니다.
 * 매우 높이 jump 합니다.
 * 매우 높이 jump 합니다.
 * turn 할 수 있음
 * 
 * 플레이어의 BeginnerLevel, AdvancedLevel, SuperLevel은 
 * PlayerLevel 추상 메서드의 상속을 받는다.(로 구현된다.)
 * 
 * PlayerLevel 추상 메서드는 jump횟수를 출력하는 템플릿 메서드가 있고,
 * Player 클래스는 레벨 정보 입출력과 레벨 업그레이드 메서드, 
 * Player가 게임하는 메서드가 있다.
 * 
 * Main함수: 일반 플레이어 1명, 중급자 1명, 고급자 1명을 생성하고
 * 			플레이 결과를 출력하기
 * 
*/

public class PlayerMain {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.setLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.setLevel(sLevel);
		player.play(3);
		
	}

}
