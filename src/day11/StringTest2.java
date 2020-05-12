package day11;

import java.util.Scanner;
import java.lang.Number;

public class StringTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요 : ");
		String peopleNum = scan.nextLine();
		String [] numArr = peopleNum.split("-");
		String birth = numArr[0];
		
		
		if (isValid(birth)==true) {
			if (peopleNum.indexOf("-")!=6 || peopleNum.length()!=14) {
				System.out.println("'-'이 없거나 잘못 입력했습니다.");
				peopleNum = scan.nextLine();
				numArr = peopleNum.split("-");	
			} else if (numArr[1].indexOf("1")==0 ||numArr[1].indexOf("3")==0) {
				System.out.println("대한민국 국민 남성입니다.");
				
			} else if (numArr[1].indexOf("2")==0 || numArr[1].indexOf("4")==0) {
				System.out.println("대한민국 국민 여성입니다.");	
				
			} else if (numArr[1].indexOf("5")==0 || numArr[1].indexOf("7")==0) {
				System.out.println("외국인 또는 재외국민 남성입니다.");
				
			} else if (numArr[1].indexOf("6")==0 || numArr[1].indexOf("8")==0) {
				System.out.println("외국인 또는 재외국민 여성입니다.");
				
			}
		} else {
				System.out.println("잘못 입력했습니다.");
			}
		}
	
	public static boolean isValid(String birth) {
		if (birth==null || birth.length()!=6) return false;
		String sYear = birth.substring(0, 2);
		String sMonth = birth.substring(2, 4);
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
