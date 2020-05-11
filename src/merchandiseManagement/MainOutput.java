package merchandiseManagement;

import java.util.Scanner;

public class MainOutput {

	public static void main(String[] args) {
		
		int size = 50;
		Product []product = new Product[size];
		
		int arrNum = 0;
		
		
		Scanner scan = new Scanner(System.in);

		int select = 0;
		
		while (select!=3) {
			
			System.out.println("------번호 입력-------");
			System.out.println("1.상품등록");
			System.out.println("2.등록상품출력");
			System.out.println("3.프로그램종료");
			
			select = scan.nextInt();
			
				if (select==1) {
					
					Product stuff = receivingInfo(scan);
				
					product[arrNum] = stuff;
					
					arrNum++;
					stuff=null;
					
					
				} else if (select==2) {
					printProduct(product);
					
				} else if (select==3 ) {
					System.out.println("프로그램 종료.");
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					select = scan.nextInt();
				}
		}
		
	
	}

	public static Product receivingInfo (Scanner scan) {
		
		Product stuff = new Product();
		
		System.out.print("상품명: ");
		stuff.setProductName(scan.next());
		System.out.print("가격 : ");
		stuff.setPrice(scan.nextInt());

		
		return stuff;
		
	}
	
	public static void printProduct (Product product[]) {
		if (product==null) {
			return;
		} else {
			for (int cnt = 0 ; cnt < 50 ; cnt++) {
				for (Product tmp : product) {
					tmp.print();
				}
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
