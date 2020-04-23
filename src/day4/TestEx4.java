package day4;

import java.util.Arrays;

public class TestEx4 {

	public static void main(String[] args) {
		// 정수 10개짜리 배열에 값을 랜덤으로 생성하여 저장(랜덤 ㅇ)
		// 저장된 배열 값 중에서 가장 큰 값과 가장 작은 값을 출력하는 코드를 작성하라

		int [] num = new int[10];
		int max = 100;
		int min = 1;
		for (int i =0; i<num.length; i++) {
			num[i] = (int)(Math.random()*(max-min+1)+min);
		}
		
		System.out.println("배열값들");
		for (int tmp:num) {
			System.out.print(tmp+" ");
		}
		
		min = max = num[0];
		for (int i = 0; i<num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			} 
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println();
		System.out.printf("배열 난수의 최댓값: %d, 최소값: %d", max,min);
		
	}
}