package decorator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadlineTest {

	public static void main(String[] args) {

		//기반 스트림
		try {
			Reader reader = new FileReader("message.txt");
			BufferedReader br = new BufferedReader(reader);
			
			//String data = br.readLine();	// 1행 읽기
			//System.out.println(data);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;		// 읽을 data가 없으면 빠져 나온다.
				System.out.println(data);
			}
			
			br.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// 보조 스트림에 기반 스트림 연결
		
	}

}
