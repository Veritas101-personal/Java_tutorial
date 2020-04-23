package day4;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 배열에 임의이 수를 넣는 예제
		int arr[] = new int [3];
		int max = 9;
		int min = 1;
		// 중복가능한 임의의 수를 생성하여 배열에 생성
		for (int i = 0; i<arr.length; i++) {
			int random = (int)(Math.random()*(max-min+1)) + min;
			/*
			배열의 0번지부터 배열에 저장된 랜덤수의 갯수(즉 cnt)-1번지까지 중복여부 체크하여
			중복되지 않으면 배열에 랜덤수를 저장하고 배열에 저장된 랜덤수의 갯수를 1 증가
			*/
			arr[i] = random;
		}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		// 임의의 수를 생성하여 배열에 저장하되 중복되지 않음
		
		
		int arr2[] = new int [4];
		int max2 = 9;
		int min2 = 1;
		
		int cnt = 0; // 배열에 저장된 랜덤수의 갯수 (3만큼 저장해야 하기 때문)
		
		while(cnt < 3) { 
			int random = (int)((Math.random())*(max2-min2+1)) + min2;
			int i = 0; 
			while (i<cnt) { // 이미 입력된 값들과 비교해 중복 여부 판단 (처음 시작은 i가 0이기 때문에 생략되지만, cnt가 1인 시점, 즉 2번째 반복시엔 i가 cnt보다 작게 되기 때문에 발동)
				if(random == arr2[i]) {
					break; // 결과 값이 같으면 상위 while문에서 탈출
				}
				i++; // 결과값이 다른것이 확인 되면 i가 cnt의 값과 같아질 때 까지 반복
			}
			if(i == cnt) { // 2~3번째 같은 값이 나와도 i와 cnt는 다르기 때문에 해당 if문은 생략되고 최상위 while로 복귀
				arr2[cnt] = random;
				cnt++; // cnt가 증가함으로 패턴 중복 판단 요소 발동
			} 
			
		}
		System.out.println();
		for(int tmp:arr2) {
			System.out.print(tmp + " ");
		}
		
	}

}
