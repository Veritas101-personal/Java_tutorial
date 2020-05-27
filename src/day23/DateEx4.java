package day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strDate = "2020-05-25 15:24:10";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		try {
			Date date = format.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
