package day7;

import java.util.Scanner;


public class NumberBaseball {

	public static void main(String[] args) {
		
		System.out.println(playBall());
		
		int size = 3;
		int com[] = new int[size];
		int min = 1, max = 9;
		createArray(min, max, size, com);
		printArray(com);
		/* 사용자가 세 수를 입력
		 * 스트라이크 판별 -> 볼 판별 - > 3 아웃판별 (힌트! 3out은 만들 필요 없다! 왜냐면 스트라이크와 볼만 판별하면 자동으로 아웃이라서)
		 * 사용자가 다 맞출 때 (3S)까지 반복
		 */
		
		
		
		
		
		
		
		
	}
	/* 기능: min에서 max사이의 중복되지 않는 n개의 랜덤값을 생성하여 배열에 저장하는 메소드
	 * 매개변수: min에서 max, n개, 배열 => int min, int max, int n, int []arr
	 * 리턴타입: 예외처리를 위해 true이면 배열 생성
	 * 			false이면 배열생성 실패 (예를 들면 1~3사이인데 4개의 배열자리가 있어서 중복이 되지 않으면 무한루프로 빠지는 걸 방지)
	 * 메소드명: createArray
	 * 
	 * 번지 0 1 2 3
	 * 값 1 3 2 ?
	 * r 1 3 1 3 1 2 
	 * max - min + 1 >= n이면 배열 생성가능, 아니면 실패!
	 * 
	 * 
	 * */
	
	public static int playBall() {
		
		Scanner scan = new Scanner(System.in);
		
		int [] pitcher = new int[3];
		int pitching = pitcher.length;
		
		for (int i=0; i<pitching; i++) {
			System.out.println("1-9까지 수를 입력하세요.");
			pitcher[i] = scan.nextInt();

		}
		int result = pitcher[0];
		
		return result;
		
	
	public static int strike(int []com, int [] user) {
		
		int cnt = 0;
		for(int i = 0; i<=com.length; i++) {
			
		}
		
		
	}
		
	}
	
	public static boolean createArray (int min, int max, int n, int []arr) {
		if(arr==null) // 까봤는데 배열공간도 아예 없었다?! 그럼 바로 false.
			return false;
		if(max - min + 1 < n)
			return false;
		int cnt = 0; // 현재 ㅂ열에 저장된 원소의 갯수
		while(cnt < n) {
			int r = random(max,min);
			if(!isDuplicated(arr,r)) {
				//arr[cnt++] = r; // 아래 두 줄을 합친 코드
				arr[cnt++] = r;
				
			}
		}
		return true;
	}
	
	
	public static int random(int max, int min) {
		
		if (max<min) { // 만약 최댓값과 최소값을 반대로 입력했을 경우 치환
			int tmp = min;
			min = max;
			max = tmp;
		}
		int r= (int)((Math.random()*(max-min+1)+min));
		return r;
	}
	
	public static void printArray (int []num) {
		
		for (int i = 0 ; i < num.length ; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	public static boolean isDuplicated (int []arr, int num) {
		for(int i=0 ; i < arr.length ; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
}
