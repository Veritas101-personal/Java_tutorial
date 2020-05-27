package day23;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx3 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.add(Calendar.DATE, 0);
		
		Date today = date.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(format.format(today));
		format = new SimpleDateFormat(("yyyy년 MM월 dd일 HH:mm:ss.SSS"));
		System.out.println(format.format(today));
	}

}
