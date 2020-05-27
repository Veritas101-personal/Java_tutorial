package day23;

import java.util.Scanner;

public class EnumEx1 {

	public static void main(String[] args) {
		// p.691 열거형 : 서로 관련된 상수를편리하게 선언하기 위한 것.
		/* 열거형.valueOf() : 문자열을 열거형으로 변환
		 * 열거형.values() : 열거형에 이는 모든 값을 하나의 열거형으로 만들어서 배열을 생성
		 * */

		Type t = Type.교통비;
		Scanner scan = new Scanner(System.in);
		
		
		do {
		System.out.println("분류리스트 ");
		int cnt = 1;
		for (Type tmp : Type.values()) {
			System.out.println(cnt++ + ". " + tmp);
		}
		System.out.println("분류를 입력하세요 : ");
		String type = scan.next();
		for(Type tmp : Type.values()) {
			if(tmp.toString().equals(type)) {
				t = Type.valueOf(type);
			}
		}
		}while(t==null);
		System.out.println(t);
		
	}

}
enum Type {
	
	통신비, 식비, 교통비, 월세, 주거비
	
}