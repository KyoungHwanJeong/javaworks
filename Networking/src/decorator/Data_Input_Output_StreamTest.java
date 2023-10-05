package decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Data_Input_Output_StreamTest {

	public static void main(String[] args) {

		// 정수, 실수, 문자열 쓰기
		
		try (OutputStream os = new FileOutputStream("./data.db");){
			// 기반 스트림 객체 생성(상대 경로), 지금은 FileOutputStream 기반.
			//OutputStream os = new FileOutputStream("./data.db");
										// ./ 는 같은 위치를 의미한다.(생략 가능함)
			
			// 보조 스트림 객체 생성
			DataOutputStream dos = new DataOutputStream(os);
			
			// 기본 타입 자료 쓰기
			dos.writeInt(1);		// 정수형 자료
			dos.writeUTF("우영우");	// 문자열 자료
			dos.writeDouble(95.2);	// 실수형 자료
			
			
			dos.writeInt(2);
			dos.writeUTF("장그래");
			dos.writeDouble(88.5);
			
			dos.flush();
//			dos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// 바이트 데이터 읽기
		// 데이터를 쓴 순서대로 읽어야 한다.
		try(InputStream is = new FileInputStream("./data.db");
				DataInputStream dis = new DataInputStream(is)){
			
			// 기본 타입 자료 읽기
			for(int i=0;i<2;i++) {		// 데이터 수만큼 반복
				
				int num = dis.readInt();	// 데이터를 쓴 순서대로 읽어야 한다.
				String name = dis.readUTF();// 문자만(를) 읽어서 name에 저장.
				
				double score = dis.readDouble();	// 숫자를 읽어서 score에 저장.
				System.out.println(num + " / " + name + " / " + score);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
