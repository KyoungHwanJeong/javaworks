/*
 * 1. "처음 만드는 윈도우" 프레임 생성하기
 * 2. "안녕~ Java" 레이블을 넣기
 * 3. 레이블을 수평정렬, 중앙에 배치하기
 * 4. "확인" 버튼을 생성하고 아래에 배치하기
 */
package components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame1 {

	public static void main(String[] args) {

		// 프레임 - 윈도우 전체
		JFrame frame = new JFrame();
		// 제목 표시줄 - 내용
		frame.setTitle("처음 만드는 윈도우");
		frame.setSize(300, 200);		// 크기: 300px- 너비, 200px- 높이
		frame.setLocation(100, 100);	// 위치: x좌표 - 100, y좌표 - 100
		
		// 레이블(글자 출력)
		JLabel label = new JLabel("안녕~ Java");	// 저도 틀렸음 ㅋㅋ
		//label.setText("안녕~ Java");
		//레이블 정렬(alignment: 왼쪽, 가운데, 오른쪽)
		
		label.setHorizontalAlignment(JLabel.CENTER);	// 수평 정렬
		// BorderLayout - 프레임을 동, 서, 남, 북, 중앙으로 배치
		frame.add(label, BorderLayout.CENTER);			// 프레임에 라벨을 추가해야 화면에 출력됨
		
		// 버튼 생성
		JButton button = new JButton("확인");
		frame.add(button, BorderLayout.SOUTH);

		
		// 윈도우 종료(닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 윈도우 디스플레이
		frame.setVisible(true);

	}

}
