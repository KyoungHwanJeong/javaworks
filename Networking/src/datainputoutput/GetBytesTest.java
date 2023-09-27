package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GetBytesTest {

	public static void main(String[] args) {

		// OutputStream은 문자열 쓰기를 지원하지 않지만
		// String 클래스가 getByte를 지원하고 있다.(= getByte를 이용한다)
		// 바이트 기반으로 데이터 보내기
		try (OutputStream os = new FileOutputStream("c:/File/out.txt")){
			//OutputStream os = new FileOutputStream("c:/File/out.txt");
			String data = "안녕하세요.\n좋은 하루 되세요!\nThank you~!";
				
			os.write(data.getBytes());
			
			os.flush();		// 잔류 버퍼 지우기
			//os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
