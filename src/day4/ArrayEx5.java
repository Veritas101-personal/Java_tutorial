package day4;

public class ArrayEx5 {

	public static void main(String[] args) {
		// 배열의 내용을 정렬하는 예제
		
		int [] num = new int[10];
		int max = 100;
		int min = 1;
		for (int i =0; i<num.length; i++) {
			num[i] = (int)(Math.random()*(max-min+1)+min);
		}
		
		System.out.println("배열값들");
		for (int tmp:num) {
			System.out.printf("%3d", tmp);
			//  54 96 90 71 13 58 81 64 97  3
			//  54 90 71  1 58 81 63 96  3 97
			//  54 71  1 58 81 63 90  3 96 97
			//  54  1 58 71 63 81  3 90 96 97
			//   1 54 58 63 71  3 81 90 96 97
			//   1 54 58 63  3 71 81 90 96 97
			//   1 54 58  3 ...
			//   1  3 54 58 63 71 81 90 96 97
		}
		for (int i=0; i<num.length-1; i++) { 
			for(int j=0; j<num.length-1; j++) { //옆에 서로 있는 배열값끼리 비교 대조
				if(num[j] > num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
	
		}
		System.out.println();
		for (int tmp:num) {
			System.out.print(tmp + " ");
		}
	}

}
