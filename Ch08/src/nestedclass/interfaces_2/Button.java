package nestedclass.interfaces_2;

public class Button {

	private OnClickListener listener;	// 인터페이스 멤버 변수
	
	interface OnClickListener{
		public void onClick();
	}
	
	public void setListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	public void touch() {
		listener.onClick();
	}
}
