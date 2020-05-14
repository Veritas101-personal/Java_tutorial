package day14;

import java.util.*;


public class LottoTest_ArrayListVer {

	static ArrayList<Integer> lotto = new ArrayList<Integer>();
	static ArrayList<Integer> bonusNum = new ArrayList<Integer>();
	static ArrayList<Integer> input = new ArrayList<Integer>();
	
	static int limits = 6;
	
	public static void main(String[] args) {
		
		inputNum();
		System.out.println();
		System.out.println("------추첨 결과-------");
		System.out.println();
		result();

	}

	public static void inputNum () {
		
		
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		
		System.out.println("1~45 사이의 숫자를 입력하세요.");
		
			while (cnt<limits) {
				int userNum = scan.nextInt();
				if (userNum > 45 || userNum <= 0) {
					System.out.println("범위를 초과한 값을 입력했습니다. 다시 입력하세요.");
				} else if (input.contains(userNum)) {
					System.out.println("중복된 숫자를 입력했습니다. 다시 입력하세요.");
				} else {
					input.add(userNum);
					cnt++;
				}
			}
			
		System.out.println(input);
		
	}
	
	
	public static void lottoRandom () {
		
		
		int min = 1, max = 45;
		int bonus = 1;
		int cnt=0;
		
		while (cnt<(limits+bonus)) {
			
			while (cnt<limits) {
				
				int random = new Random().nextInt(max-min+1)+min;
					if (!(lotto.contains(random))) {
						lotto.add(random);
						cnt++;
					} else {
						
					}
				
			}
			int bonusRandom = new Random().nextInt(max-min+1)+min;
				if (!(lotto.contains(bonusRandom))) {
					bonusNum.add(bonusRandom);
					cnt++;
				} else {
					
				}
		}
		
		System.out.println(lotto+ " 보너스 : " + bonusNum);
	}
	
	static void result () {
		
		lottoRandom();
		
		int prize = 0;
		boolean bonusDetect = false;
		
		for (int i = 1 ; i < 45 ; i++ ) {
			if (input.contains(i) && lotto.contains(i)) {
				prize++;
			} else {
				
			}
			if (input.contains(i) && bonusNum.contains(i)) {
				bonusDetect = true;
			}
		}
		
		System.out.println("맞추신 갯수: " + prize +  "/ 보너스 번호 일치여부 : " + bonusDetect);
		
		
		switch (prize) {
		
		case 6:
			System.out.println("1등!");
			break;
			
		case 5:
			
			if (bonusDetect=true)
				System.out.println("2등!");
			else
				System.out.println("3등!");
			
			break;
			
		case 4:
			
			System.out.println("4등!");
			
			break;
			
		case 3:
			
			System.out.println("5등!");
			
			break;
			
		default:
			
			System.out.println("꽝!");
			break;
		}
		
	}
	
}
