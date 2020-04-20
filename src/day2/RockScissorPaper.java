package day2;

import java.util.Scanner;

public class RockScissorPaper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min = 0;
		int max = 10;
		
		
		int result = 0;
		result = (int) (Math.random()*(max-min+1))+min;
		System.out.println(result);
		result = (int) (Math.random()*(max-min+1))+min;
		System.out.println(result);
		result = (int) (Math.random()*(max-min+1))+min;
		System.out.println(result);
		result = (int) (Math.random()*(max-min+1))+min;
		System.out.println(result);
		result = (int) (Math.random()*(max-min+1))+min;
		System.out.println(result);
		
		
	}

}
