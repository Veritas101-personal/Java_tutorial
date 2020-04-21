package day3;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayEx1 {

	public static void main(String[] args) {
		/* 배열: (같은 의미와) 같은 자료형을 가진 변수들의 집합
		 * 이유
		 * 일반 변수 10개를 이용해서는 반복문을 사용할 수 없다. 
		 * 더욱 효율적으로 변수를 관리하기 위해
		 * 
		 * 배열이 없으면 아래와 같은 5개의 정보를 입력받아 저장하려면, 5개 변수선언, Scanner를 통해 5번 입력받아야함
		 * 그러나 배열을 이용하면 효율적으로 입력받는 코드작성 가능
		 */ 
	
		int n1, n2, n3, n4, n5;
		Scanner scan = new Scanner(System.in);
		
		
		 /* 배열 선언
		 *
		 * 자료형[] 배열명
		 * 자료형 배열명[]
		 * 
		 */

		int [] arr1, arr2;		// 둘다 배열,
		int arr3[], arr4;		// arr3은 배열, arr4는 일반 변수
		arr1 = new int[5];		// 배열 생성 (배열을 선언과 생성을 둘다 진행해야 함)
		int []arr5 = new int[5]; // 배열과 생성을 동시 진행하는 법
		
		arr1[0] = 1;
		arr1[2] = 3;
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		for(int i =0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
