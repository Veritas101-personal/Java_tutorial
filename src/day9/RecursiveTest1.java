package day9;

public class RecursiveTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum(10));
	
	}


	public static int sum(int a) {
		
		if (a < 0) {
			return 0;
		} 
		return a + sum(a-1);
	}
	
	public static int sum(int min, int max) {
		if(min>max) 
			return 0;
		if(max==min)
			return min;
		 return max + sum(min, max-1);
		
	}
	
	
}
