package layouts;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginWindow {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Login");
		JLabel lbl1 = new JLabel("아이디");
		JTextField txt1 = new JTextField();
		JLabel lbl2 = new JLabel("비밀번호");
		JTextField txt2 = new JTextField();
		JButton button1 = new JButton("로그인");

		
		// 프레임
		frame.setSize(300, 250);
		frame.setLocation(700, 300);
		frame.setLayout(null);
				
		// 아이디
		lbl1.setSize(125, 30);
		lbl1.setLocation(30, 30);
		frame.add(lbl1);
				
		// 아이디
		txt1.setSize(125, 30);
		txt1.setLocation(110, 30);
		frame.add(txt1);

		// 비밀번호
		lbl2.setSize(80, 30);
		lbl2.setLocation(30, 70);
		frame.add(lbl2);
				
		// 비밀번호
		txt2.setSize(125, 30);
		txt2.setLocation(110, 70);
		frame.add(txt2);
		
		// 로그인버튼		
		button1.setSize(100, 50);
		button1.setLocation(90, 130);
		frame.add(button1);
				
				
		// 디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
			
}
