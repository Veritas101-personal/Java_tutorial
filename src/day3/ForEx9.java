package day3;

public class ForEx9 {

	public static void main(String[] args) {

		for(int i = 1 ; i<=5; i++) {
		for (int j = 1 ; j<=5-i ; j++) {
			System.out.println(" ");
		} 
		
		for (int j = 1 ; j<=i ; j++) {
				System.out.print("*");
			}
		
		}
		System.out.println();
	}
}
