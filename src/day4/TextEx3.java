package day4;

public class TextEx3 {

	public static void main(String[] args) {
		
		
		int [] num1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for (int tmp : num1) {
			System.out.print(tmp + " ");
		} 
		int isEven = 0;
		
		for (int i = 0; i < 10 ; i++) {
			if (i%2==0) {
			num1[i] = num1[i]*2;
			} else {
			
			}
		}
		System.out.println();
		for(int tmp2:num1) {
		System.out.print(tmp2 + " ");
		}

	}
}