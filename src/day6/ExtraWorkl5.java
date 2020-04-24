package day6;

public class ExtraWorkl5 {

	public static void main(String[] args) {
		/* 정수형 배열 5개짜리를 생성하여 0번지에는 0을, 1번지에는 1을 넣도록 작성하세요.
		 * 그리고 배열의 값을 출려가여 제대로 들어갓는지 확인하세요
		 */
		
		int arr[] = new int[5];
		
		/*
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		*/
		printArray(arr);
		
	}
	public static void printArray (int []num1) {
				
		for (int tmpa : num1) {
			System.out.print(tmpa + " ");
		}
		
	}
	
	
}
