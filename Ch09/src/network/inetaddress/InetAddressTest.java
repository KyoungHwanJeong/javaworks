/*
 * IP 주소 알아내기
 * 1. InetAddress로 내 컴퓨터 IP 주소 출력하기.
 * 2. "www.naver.com"의 IP 주소 
 * 
*/

package network.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {

		// IP(Internet Protocaol)
		try {
			InetAddress local = InetAddress.getLocalHost();
									// 로컬 컴퓨터 IP 얻기
			System.out.println("내 컴퓨터 IP 주소" + local.getHostAddress());
			System.out.println("========================================");
			// 서버 컴퓨터 - 여러 대인 경우 배열로 출력
			// DNS(Domain Name Service: IP의 숫자 주소를 문자 이름으로 변경하는 서비스.
			//InetAddress server = InetAddress.getByName("www.naver.com");
			//System.out.println("네이버 컴퓨터 IP 주소: " + server);
			
			InetAddress[] server = InetAddress.getAllByName("www.naver.com");

			for(InetAddress remote : server) {
				System.out.println(remote);
				System.out.println("========================================");

			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
