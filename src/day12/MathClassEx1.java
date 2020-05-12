package day12;

import java.lang.Math.*;

public class MathClassEx1 {

	public static void main(String[] args) {
		System.out.println(Math.ceil(1.5));
		//1.5를 소수점 첫째자리에서 올림
		System.out.println(Math.floor(1.5));
		//1.5를 소수점 첫째자리에서 버림
		System.out.println(Math.round(1.5));
		//1.5를 소수점 첫째자리에서 반올림
		double num = 1.51;
		num = num * 10;
		
		System.out.println(Math.ceil(num)/10);
		//1.51를 소수점 둘째자리에서 올림
		System.out.println(Math.floor(num)/10);
		//1.51를 소수점 둘째자리에서 버림
		System.out.println(Math.round(num)/10.0);
		//1.51를 소수점 첫째자리에서 반올림
	}

}
