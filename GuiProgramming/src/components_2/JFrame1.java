/*
 * 1. "처음 만드는 윈도우" 프레임 생성하기
 * 2. "안녕~ Java" 레이블을 넣기
 * 3. 레이블을 수평정렬, 중앙에 배치하기
 * 4. "확인" 버튼을 생성하고 아래에 배치하기
 */
package components_2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame1 {

	public static void main(String[] args) {

		// 프레임
		JFrame frame = new JFrame();
		frame.setTitle("처음 만드는 윈도우");
		frame.setSize(300, 200);
		frame.setLocation(100, 100);
		
		JLabel label = new JLabel("안녕~ Java");
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.add(label, BorderLayout.CENTER);
		
		// 버튼 생성
		JButton button = new JButton("확인");
		frame.add(button, BorderLayout.SOUTH);
		
		// 윈도우 종료(닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
