package merchandiseManagement;

import java.util.Scanner;

public class MainOutput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int select = 0;
		
		while (select!=3) {
			
			System.out.println("-----번호 입력-------");
			System.out.println("1.상품등록");
			System.out.println("2.등록상품출력");
			System.out.println("3.프로그램종료");
			
			select = scan.nextInt();
			
				if(select==1) {
					Product.AddList();
				}
		}
		
	}

}

/*
 * 상푸을 등록하고 등록된 상품을 출력하는 코드를 작성
 * 
 * 상품을 등록? y/n y
 * 상품명: 가방
 * 가격: 1---
 * 
 * 상품등록? y/n y
 * 상품명: 마우스
 * 가격: 1000
 * 
 * 상품을 등록하겠습니까?
 * 
 * 지금까지 등록된 상품 리스트
 * 1. 상품명: 가방, 가격 10000원
 * 2. 상품명: 마우스, 가격 : 1000원
 *
 * */
