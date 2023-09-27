package datainputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) {

		try {
			OutputStream os = new FileOutputStream("C:/File/test2.db");
			// 배열로 데이터를 생성
			byte[] array = {10, 20, 30, 40 ,50};
			
			// 배열의 모든 바이트를 쓰기
			os.write(array);
			
			os.flush();			// 버퍼를 비워준다.
			os.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
