package day11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest2_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요 : ");
		String peopleNum = scan.nextLine();
		
		
		Pattern p = Pattern.compile("(\\d{6}-\\d{7})");
		Matcher m = p.matcher(peopleNum);
		if(!m.matches()) {
			System.out.println("올바른 주민번호 형태가 아닙니다.");
		
			return;
		}
		
				
		if (isValid(peopleNum.substring(0,6))) {
			System.out.println("유효하지 않은 생년월일 입니다.");
			scan.close();
			return;
		}
		char gender;
		
		if(peopleNum.contains("-")) {
			gender = peopleNum.charAt(8);
			
		} else {
			gender = peopleNum.charAt(6);
		}
	}
	public static boolean isValid(String birth) {
		if (birth==null || birth.length()!=6) return false;
		String sYear = birth.substring(0, 2);
		String sMonth = birth.substring(3, 4);
		String sDay = birth.substring(4, 6);
		
		int year, days, month;
		
		try {
			year = Integer.parseInt(sYear);
			month = Integer.parseInt(sMonth);
			days = Integer.parseInt(sDay);
		} catch (Exception e) {
			return false;
		}
		int lastDay = 31;
		
		if(month<1 || month>12) return false;
		
		if (year%4==0 && month==2) {
			lastDay = 29;
		} else if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			lastDay = 31;
		} else if (month==3 || month==5 || month==9  || month==11) {
			lastDay = 30;
		} else {
			return false;
		}
		if(days<1 || days > lastDay) return false;
		return true;
	}
	public static void detectGenderAndNationality () {
		
	}
}
