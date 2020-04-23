package day4;

public class TestExExtra1 {

	public static void main(String[] args) {
		
		int [] arr = new int[10];
		for (int i = 0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for(int tmp:arr) 
		System.out.print(tmp + " ");
		
		for (int i = 0; i<arr.length; i+=2) {
			arr[i] = arr[i]*2;
		}
		System.out.println();
		for(int tmp:arr) 
		System.out.print(tmp + " ");
		

	}

}
