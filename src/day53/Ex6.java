package day53;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b = 0;
		
		for (a=1;a<=10;a++) {
			if (a%2!=0) {
				continue;
			}
			b += a;
		}
		System.out.println(b);
		
	}

}
