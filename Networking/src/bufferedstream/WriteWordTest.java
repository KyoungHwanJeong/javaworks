package bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteWordTest {

	public static void main(String[] args) {

		// ant bear chicken cow eagle elephant horse monkey penguin tiger
		try(Writer writer = new FileWriter("word.txt")){
			// 문자열 쓰기
			String msg = "ant bear chicken cow eagle"
					+ " elephant horse monkey penguin tiger";
			
			writer.write(msg);
			writer.flush();
			
			
			System.out.println(msg);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader br = new BufferedReader(
				new FileReader("word.txt"))){
			
			int lineNo=1;
			
			while(true) {
				String data = br.readLine();	// 1행씩 읽음
				if(data == null) break;
				lineNo++;
				
				System.out.println(lineNo + "" + data);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

