/*
 * ServerSocket 생성과 연결 수락.
 * 1. ServerSocket 생성과 포트 바인딩.
 * 2. 연결 수락.
 * 3. 연결된 클라이언트 IP 주소 얻기.
 * 4. 연결 끊기.
 * 
 * 
 * 
 * 
*/

package network.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSample {

	
	// 서버 소켓 객체 선언
	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		
		System.out.println("=============================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("=============================================");
		
		// TCP 서버 시작
		startServer();

		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q"))
				break;
		}

		scanner.close();
		
		//TCP 서버 종료
		stopServer();
	}

	// TCP(Transmission Control Protocol) 네트워킹(연결지향적임)
	private static void startServer() {
		// 작업 스레드 생성
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
				//
				serverSocket = new ServerSocket(50001);
				System.out.println("[서버] 시작됨");
				
				while(true) {
					System.out.println("\n[서버] 연결 요청을 기다림\n");
					// 서버가 연결 요청 수락함
					Socket socket = serverSocket.accept();	// 시험에 나옴...
									// 클라이언트와 통신할 소켓 생성
					
					// IP주소 알아내기
					// getRemoteSocketAddress : null 소켓이 연결되어 있거나 연결되지 않은 경우 끝점의 주소를 반환한다.
					// 형변환...왜? getRemoteSocketAddress 메서드의 반환값이 Object이므로...
					InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
					
					String clientIp = isa.getHostString();
					System.out.println("[서버] "+ clientIp + "연결 요청을 수락함");
				}
				// 웹 브라우저에서 http://127.0.0.1:50001/을 입력함
				//							- 콘솔에서 확인
				
				
				}catch (IOException e) {
					//e.printStackTrace();
					System.out.println("[서버] " + e.toString());
				}
			}
		};
		thread.start();	//서버 스레드 시작
	
	}//startServer 끝
	
	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[서버] 종료됨");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
