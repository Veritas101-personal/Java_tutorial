package day14;

import java.util.*;

public class BaseballTest_List {
	
	static ArrayList<Integer> pitching = new ArrayList<Integer>();
	static ArrayList<Integer> hit = new ArrayList<Integer>();
	
	static int strike = 0;
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("플레이볼!");
		
		hitter(scan);
		pitcher();
		detect();

		while (strike != 3) {
			
			hitter(scan);
			detect();
		}
		
		
	}

	
	public static void pitcher () {
		
		int min = 1, max = 9;
		int inning = 3;
		int cnt=0;
		
		while (cnt<inning) {
			
			int random = new Random().nextInt(max-min+1)+min;
			
			if (!(pitching.contains(random))) {
				pitching.add(random);
				cnt++;
			} else {
				
			}
			
		}
	}
	
	public static void hitter (Scanner scan) {
		
		int min = 1, max = 9;
		int inning = 3;
		int cnt=0;
		hit.clear();
		
		System.out.println("1~9까지 번호를 입력하세요.");
		while (cnt<inning) {
		
			int trial = scan.nextInt();
			if (trial > 9 || trial <= 0) {
				System.out.println("범위를 초과한 값을 입력했습니다. 다시 입력하세요.");
			} else if (hit.contains(trial)) {
				System.out.println("중복된 숫자를 입력했습니다. 다시 입력하세요.");
			} else {
				hit.add(trial);
				cnt++;
			}
		}
		
		System.out.println(hit);
		
	}
	
	public static void detect () {
		
		int ball = 0;
		int cnt = 0;
	
		
			while (cnt<9 || ball < 3) {
				
				for (int i = 0 ; i < 9 ; i ++) {
					strike = 0;
					if (pitching.indexOf(i)==hit.indexOf(i)) {
						strike++;
						
					} else if (pitching.contains(hit.get(i))) {
						ball++;
				
					} else {
						
					}
				}
				cnt++;
			}
			

		System.out.println("Strike : " + strike + " / Ball : " +ball);

			
	}
	
	
}
