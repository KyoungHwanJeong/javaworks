package bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadlineTest {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(
				new FileReader("word.txt"))){
			
			//int lineNo=1;
			//String data = br.readLine();
			//System.out.println(data);
			String data;
			String [] word =null;
			while((data = br.readLine()) != null) {
			//System.out.println(data);
			word = data.split(" ");
			}
			System.out.println(Arrays.toString(word));
			
			int dice = (int)Math.random()*6 + 1;
			//System.out.println(dice);
			//System.out.println(word.length);
			
			int rnd = (int)(Math.random()*word.length);
			System.out.println(rnd);
			System.out.println(word[rnd]);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
