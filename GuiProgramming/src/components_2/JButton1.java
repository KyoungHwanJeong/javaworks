/*
 * 1. "레이아웃 프레임 생성하기"(JFrame을 이용)
 * 2. 버튼 "북", "남", "동", "서", "중앙"을 생성하기(JButton을 이용)
 * 3. 버튼을 프레임에 추가하기(BorderLayout을 이용)
 */
package components_2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton1 {

	public static void main(String[] args) {

		// 프레임
		JFrame frame = new JFrame("레이아웃");
		frame.setSize(300, 200);
		frame.setLocation(200, 100);
		
		// 버튼 추가하기
		JButton button1 = new JButton("북");
		JButton button2 = new JButton("남");
		JButton button3 = new JButton("동");
		JButton button4 = new JButton("서");
		JButton button5 = new JButton("중앙");
		
		// 프레임 추가, 배치
		frame.add(button1, BorderLayout.NORTH);
		frame.add(button2, BorderLayout.SOUTH);
		frame.add(button3, BorderLayout.EAST);
		frame.add(button4, BorderLayout.WEST);
		frame.add(button5, BorderLayout.CENTER);
		
		// 디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
