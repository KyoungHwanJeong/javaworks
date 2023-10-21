package tcpnetwork;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EcoClient {

	public static void main(String[] args) {

		//Socket 객체 생성
		try {
			// Socket 객체 생성 및 연결 요청
			Socket socket = new Socket("localhost", 50001);
			System.out.println("[클라이언트] 연결 성공");
			
			// 데이터 보내기
			String sendMessage = "자바 네트워크 프로그래밍!";
			
			OutputStream os = socket.getOutputStream();
			byte[] bytes = sendMessage.getBytes("utf-8");	// 인코딩
										// getBytes 문자가 안보내지므로
			os.write(bytes);
			
			os.flush();
			
			System.out.println("[클라이언트] 데이터 보냄: "+ sendMessage);
			
			//서버가 보낸 데이터 받기
			InputStream is = socket.getInputStream();
			bytes = new byte[1024];
			int readBytes = is.read(bytes);
					//문자열로 복원(디코딩)
			String receiveMessage = new String(bytes, 0, readBytes, "utf-8");
			//String​(byte[] bytes, int offset, int length, String charsetName)
			//String지정된 문자 세트를 사용하여 지정된 바이트 하위 배열을 디코딩하여 새 항목을 생성합니다 .
			System.out.println("[클라이언트] 데이터 받음: "+ receiveMessage);

			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
