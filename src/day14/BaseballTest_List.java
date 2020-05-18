package day14;

import java.util.*;

public class BaseballTest_List {
	
	static ArrayList<Integer> pitching = new ArrayList<Integer>();
	static ArrayList<Integer> hit = new ArrayList<Integer>();
	
	static int strike = 0; 
	
	// 여기까진 모두 클래스 변수들 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("플레이볼!");
		
		
		pitcher(); // 먼저 공부터 던져야지
		

		while (strike != 3) { // 스트라이크 3될때 까지 못지나간다
			
			hitter(scan);
			detect();
		}
		
		System.out.println("게임셋!");
		
	}

	
	public static void pitcher () { // 컴퓨터의 랜덤 배열
		
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
		//System.out.println(pitching); // 확인용!
	}
	
	public static void hitter (Scanner scan) { // 입력값 받는 메소드
		
		int min = 1, max = 9;
		int inning = 3;
		int cnt=0;
		hit.clear(); // 이거 안하면 니가 했던거 초기화 안되서 그대로 남는다...
		
		System.out.println("1~9까지 번호를 입력하세요.");
		
		int trial = 0;

		while (cnt<inning) {
			try { 
				
				trial = scan.nextInt();
				
			} catch (NoSuchElementException e) {
				
				System.out.println("허용되지 않은 구동입니다. 다시 시도하세요.");
				break;
			}
			
			if (trial > max || trial < min) {
				System.out.println("범위를 초과한 값을 입력했습니다. 다시 입력하세요.");
			} else if (hit.contains(trial)) { // 입력한 수가 이미 배열에 있으면 바로 else if 걸린다!
				System.out.println("중복된 숫자를 입력했습니다. 다시 입력하세요.");
			} else {
				hit.add(trial);
				cnt++;
			}
		}
		
			System.out.println(hit);
		}
			
		
	
	
	public static void detect () { // 확인 단계 및 결과 출력 메소드
		
		int ball = 0;
		strike = 0; // 이거 안하면 스트라이크, 볼 초기화 안된다...
		
				for (int i = 0 ; i < 9 ; i ++) {
					if (pitching.contains(i) && hit.contains(i)) {
						if (pitching.indexOf(i)==hit.indexOf(i)) {
							strike++;
						} else if (pitching.contains(i) && hit.contains(i)) {
							ball++;
							 	
						}
						
					}
					
				}
			
		System.out.println("Strike : " + strike + " / Ball : " +ball);

			
	}
	
	
}
