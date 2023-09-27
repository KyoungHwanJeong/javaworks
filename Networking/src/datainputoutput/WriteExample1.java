package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) {

		try {
			// 출력 스트림 객체 생성(생성자 - 파일 경로)
			OutputStream os = new FileOutputStream("C:/File/test1.db");
		
			//데이터 변수 선언
			byte a = 10;
			byte b = 20;
			byte c = 30;
			//char d = '가';			// byte 기반이라서 char를 인식 못한다.
			int d = 97;			// ASCII 코드 값으로 들어간다(문자로 출력 97='d')
			
			//db 파일에 데이터 쓰기
			os.write(a);
			os.write(b);
			os.write(c);
			os.write(d);
			
			
			os.flush(); // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비운다.
			os.close();	// 출력 스트림을 닫아서 사용한 메모리를 반환해준다.
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
