package datareadwriter;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) {

		
		// try(객체 생성) ~catch문
		try(Reader reader = new FileReader("c:/File/test.txt")){
			
			while(true) {
				int data = reader.read();
				//System.out.println((int)data);
				if(data == -1) break;
				System.out.print((char)data + " ");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
