package network_2.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSample {

	private static ServerSocket serverSocket;
	
	// TCP 서버 시작
	private static void startServer() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
													// 클라이언트와 송신할 소켓
						Socket socket = serverSocket.accept();
						
						InetSocketAddress isa=
								(InetSocketAddress)socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						
						System.out.println("[서버] " + clientIp + "의 연결 요청을 수락함");
						// 웹 브라우저에서 http://192.168.25.3:50001/을 입력함
											// - 콘솔에서 확인
						socket.close();
						System.out.println("[서버] " + clientIp + "의 연결을 끊음");

					}
					
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("[서버] " + e.toString());

				}
				super.run();
			}
		};
		thread.start();
	}
	
	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
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
		
		stopServer();
	}

}
