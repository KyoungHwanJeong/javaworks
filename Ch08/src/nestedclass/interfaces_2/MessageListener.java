package nestedclass.interfaces_2;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {

		System.out.println("문자를 보냅니다.");
	}

}
