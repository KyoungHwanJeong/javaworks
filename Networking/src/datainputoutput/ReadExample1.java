package datainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) {

		
		//입력 스트림 객체 생성
		try {
			InputStream is = new FileInputStream("C:/File/test1.db");
			while(true) {
				int data = is.read();
				if(data == -1) 		// data= -1은 데이터가 없음.
					break;
				
				System.out.println(data);		// 결과: 10 20 30
			}
			is.close();
		}catch( IOException e) {
			e.printStackTrace();
		}
		
	}

}
