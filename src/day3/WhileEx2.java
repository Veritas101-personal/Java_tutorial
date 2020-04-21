package day3;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2의 최소 공배수를 구하는 코드를 작성하세요.
		 * 1. 반복회수 : i는 1부터 num1*num2까지 1씩 증가 
		 * 2. 규칙성 : i가 num1의 배수이고 i가 num2의 배수이면 i를 출력하고 반복문을 종료
		 * 3. 반복문 종료 후 : X
		 */
		
		
		

		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		int i = 1;
		int cnt = 0;
		
		System.out.println("두 정수를 입력하시오 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	
		while (i <= num1*num2) {
			i++;
			if (num1%i==0 && num2%i==0) {
				System.out.printf("%d와 %d의 최소공약수는 : %d, 반복횟수: %d\n",num1,num2,i,cnt);
				break;
			}
			i++;
		}
		// 위의 예제는 i가 1부터 시작해서 최소공배수를 구하기 때문에 최소 공배수가 큰 경우 반복횟수가 많아진다.
		// 때문에 아래처럼i를 num1부터 시작해서 num1의 배수로 하면 반복횟수가 줄어든다.
		if(num1 < num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		i=num1;

		while (i <= num1*num2) {
			cnt++;
			if (i % num2==0) {
				System.out.printf("%d와 %d의 최소공배수는 : %d, 반복횟수: %d\n",num1,num2,i,cnt);
				break;
			}
			i+=num1;
	}
	
	}
}
