package network_2.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSample {

	public static void main(String[] args) {

		// Socket 객체 생성
		try {
			Socket socket = new Socket("localhost", 50001);
			System.out.println("[클라이언트] 연결 성공");
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
