package day6;

public class ExtraWork6 {

	public static void main(String[] args) {
		
	
	
		int []num = new int[10];
		for (int i = 0 ; i < num.length ; i++) {
			num[i] = i;
		}
		for (int tmp : num) {
			System.out.print(tmp + " ");
			
		}
		int num2 = 3;
		int []arr = new int[4];
		arr[0] = 3;
		arr[1] = 13;
		arr[3] = 5;
		
		printArrayMod(num);
		isDuplicated (arr, num2);
	}
	
	public static void printArrayMod (int []num) {
		
		int location = 4;
		for (int i = 0 ; i < num.length ; i++) {
			if (num[i] == location) {
				System.out.printf("%d쪽에 있습니다.",i+1);
				break;
			} 
			if (num[i] == location) {
				System.out.println("없습니다.");
			}
				
			}
		}
	
	
	/* 기능: 배열 arr에 정수 num 값이 있는지 없는지
	 * 매개변수: 배열, 정수 => int []arr, int []num
	 * 리턴타입: 있나 없나? boolean
	 * 매서드명 isDuplicated
	 */
	
	
	public static boolean isDuplicated (int []arr, int num) {
		for(int i=0 ; i < arr.length ; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	
}
