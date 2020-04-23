package day4;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 향상된 for문 예제
		
		int [] arr = new int[] {1,3,5,7,2,4,6,8};
		/* 향상된 for문을 주로 사용하는 경우
		 * 1. 배열의 모든 값을 탐색하는 경우
		 * 2. 배열의 값을 수정하지 않는 경우
		 * => 특정 값을 탐색하거나 값을 수정 할 거면 그냥 일반 탐색이 더 낫기 때문
		 */
		
		// for문에 있는 arr의 정보를 tmp로 자료 이동
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}

	}

}
