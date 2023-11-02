package datascraping;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class ExchangeRate {

	public static void main(String[] args) {
		String url = "https://finance.naver.com/marketindex/";
		
		Connection conn = Jsoup.connect(url);
				
	}

}
