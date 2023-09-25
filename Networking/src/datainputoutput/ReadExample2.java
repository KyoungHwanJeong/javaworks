package datainputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) {

		//입력 스트림 객체 생성
		try {
			InputStream is = new FileInputStream("C:/File/test2.db");
			
			byte[] data = new byte[1024];	// 데이터를 읽을 배열 생성
			while(true) {
			// 일반적으로 read하기
			/*	
				int data = is.read();
				if(data == -1) break;
				System.out.print(data + " ");
			*/
				
				
			// 배열로 read하기(속도가 더 빠름)
				
				int num = is.read(data);	// 배열을 읽은 바이트 수
				//System.out.println(num);

				if(num == -1) break;
				
				for(int i=0;i<num;i++) {
					System.out.print(data[i] + " ");
				}
				System.out.println();
							
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
