package day11;

import java.util.Scanner;

public class StringTest1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("제목을 입력하세요 : ");
		String title = scan.nextLine();
		System.out.print("단어를 입력하세요 : ");
		String compare = scan.nextLine();
		
		if (title.contains(compare)) {
			System.out.printf("%s에는 %s라는 단어가 있습니다.",title,compare);
		} else {
			System.out.printf("%s에는 %s라는 단어가 없습니다.",title,compare);
		}

	}

}
