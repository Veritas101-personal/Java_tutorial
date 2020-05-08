package randomNumberGame;

import java.util.Scanner;

public class GameData {
	
	int input;
	
	
	public static void compare (int input, Scanner scan) { // 본 게임 시작!
		
		int result = RandomNumber();
		
		while (true) {
			
			if (input < result) {
				System.out.println("up");
				System.out.print("입력 : ");
				input = scan.nextInt();
				
			} else if (input > result) {
				System.out.println("down");
				System.out.print("입력 : ");
				input = scan.nextInt();
			
			} else {
				System.out.println("정답!");
				break;
			}
			
		}
		
	}
	
	public static int RandomNumber () { // 1부터 50까지 무작위 출력
		
		int result = (int)(Math.random()*(50-1+1)+1);
		
		return result;
	}
	
}
