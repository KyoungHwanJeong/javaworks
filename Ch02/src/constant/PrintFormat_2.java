package constant;

public class PrintFormat_2 {

	public static void main(String[] args) {

		// printf("문자열 포멧", 객체)
		// 대응 서식: 정수 - %d,	실수 - %f,	문자 - %s
		// d - decimal(10진수)
		// 줄바꿈 문자 - \n	탭(tap) 띄어쓰기 - \t
		
		int year = 2023;
		float weight = 63.7F;
		String nick = "얼음공주";
		
/*
		System.out.printf("올해는 %d년 입니다.", year);
		System.out.println();
		System.out.println("올해는 " + year +"년 입니다.");
*/
		
		System.out.printf("올해는 %d년 입니다.\n",year);
		System.out.printf("그것의 무게는 %.2fkg 입니다.\n", weight);
		System.out.printf("그녀의 별명은 %s 입니다.\n", nick);
		
		String table = "";
		table += "------------------------------\n";
		table += "이름\t 나이\t 나라\n";
		table += "------------------------------\n";
		table += "강감찬\t 82\t 고려\n";
		table += "이순신\t 53\t 조선\n";
		table += "------------------------------\n";
		
		System.out.println(table);
	}

}
