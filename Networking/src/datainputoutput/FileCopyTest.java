package datainputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {

		String orignFile= "C:/File/img1.webp";	//원본 파일
		String copyFile= "C:/File/img2.webp";	//사본 파일
		
		try {
			InputStream is = new FileInputStream(orignFile);
			OutputStream os = new FileOutputStream(copyFile);
			
			while(true) {
				int num = is.read();	// 읽은 데이터
				if(num == -1) break;
				os.write(num);			// 파일에 쓰기
				
				
			}
			os.flush();				// 버퍼 비우기
			is.close();				// read() 닫기
			os.close();				// write() 닫기
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
