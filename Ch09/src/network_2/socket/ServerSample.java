package network_2.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSample {

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
		
		// TCP 서버 종료
		stopServer();
		
	}
	
	private static void startServer() {
		// 작업 스레드
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						Socket socket = serverSocket.accept();
						
						InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
						
						String clientIp = isa.getHostString();
						System.out.println("[서버] " + clientIp + "연결 요청을 수락함");
						
					}

					
				} catch (IOException e) {
					System.out.println("[서버] " + e.toString());
				}
			}
		}; thread.start();	// 스레드 시작
	}
	
	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
