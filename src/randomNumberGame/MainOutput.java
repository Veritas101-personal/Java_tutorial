package randomNumberGame;

import java.util.Scanner;

public class MainOutput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1~50까지 무작위 수를 맞추는 게임입니다.");
		System.out.println("수를 입력한 후 랜덤값보다 낮으면 down, 높으면 up이 나타납니다.");
		System.out.println("수를 입력하세요.");
		System.out.print("입력 : ");
		
		int input = scan.nextInt();
		
		GameData.compare(input, scan);
	
	}
}
