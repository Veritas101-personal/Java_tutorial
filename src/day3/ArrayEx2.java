package day3;

public class ArrayEx2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		num1 = num2;
		System.out.println(num1);
		
		int arr1[] = new int[4];
		int arr2[] = new int[4];
		arr1[0] = 1;
		arr2[2] = 3;
		// arr1 = arr2; 
		// int arr1[] = int arr2[] 하고 같지 않음! 위의 식은 arr1[]의 값이 변경된것이 아니라 arr2[]주소값이 arr1에도 저장된 것
		// 즉 arr2[]의 주소값이 arr2과 arr1과  arr1[]의 주소값은 그대로 유지
		
		for (int i=0 ; i<arr1.length; i++) {
			//arr1[i] = arr2[i];
			int tmp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = tmp;
		}
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
			
		}
		System.out.println();
		System.out.println("--------------------------");
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for (int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
			
		}
		System.out.println();
	}

}
