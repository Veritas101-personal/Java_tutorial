package day23_review;

public class Practiceex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1, sum = 0;
		while (a++ < 10)
			sum += a * 3 >= sum ? a : 1;
		System.out.printf("%d",sum);
		
	}

}
