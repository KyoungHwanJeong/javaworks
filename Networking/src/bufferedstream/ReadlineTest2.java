package bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadlineTest2 {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(
				new FileReader("word.txt"))){
			
		//	int lineNo=1;
			String data = br.readLine();
			System.out.println(data);
			
			/*while(true) {
				String data = br.readLine();	// 1행씩 읽음
				if(data == null) break;
			//	lineNo++;
				
				System.out.println(data);
			}*/
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
