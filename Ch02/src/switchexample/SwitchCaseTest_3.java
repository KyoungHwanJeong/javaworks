package switchexample;

public class SwitchCaseTest_3 {

	public static void main(String[] args) {

		// 랭킹에 따른 메달 출력
		// 1 - 금메달, 2 - 은메달, 3 - 동메달
		// 변수 - rank
		
		int rank =1;
		
		switch(rank) {
		case 1:
			System.out.println("금메달입니다.");
			break;
		case 2:
			System.out.println("은메달입니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
	}

}
