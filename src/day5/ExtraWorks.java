package day5;

public class ExtraWorks {

	public static void main(String[] args) {
		
		int num = 5;
		for(int i = 0 ; i <num ; i++) {
			for (int j=0 ; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
		for(int i=0; i<num; i++) {
			for(int j =0;j<=i; j++) {
				System.out.print((char)('a'+j));
			}
			System.out.println();
		}	
		char ch = 'a' + 1;
		
		/* 문자상수 a + 상수 1을 하면 자료형변환이 일어나지 않고 더해지기 때문에
		 * 결과가 문자 b가 나오면 바로 문자형 변수 ch에 저장이 가능하다
		 */
		
		System.out.println(ch+1);
		System.out.println((char)ch+1);

		
		/*문자 변수 ch + 상수를 하면 문자 변수 ch가 정수형 int로 형변환되어 더해지기 때문에
		 * 결과가 정수가 된다. 
		 * 
		 */
	}

}
