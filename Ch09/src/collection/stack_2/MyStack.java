package collection.stack_2;

import java.util.ArrayList;

public class MyStack {
	
	private ArrayList<String> arrayList;
	
	public MyStack() {
		arrayList= new ArrayList();
	}
	
	//자료를 저장
	public void push(String data) {
		arrayList.add(data);
	}
	
	//자료를 빼기
	public String pop() {
		if(arrayList.size()==0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayList.remove(arrayList.size()-1);
	}

}
