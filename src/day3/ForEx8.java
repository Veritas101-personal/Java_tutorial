package day3;

public class ForEx8 {

	public static void main(String[] args) {
		/* break: 반복문을 빠져나가는 역할, 무조건 조건문과 같이 사용
		 * continue: 스킵, for문에서는 증감연산식 위치로, while문에서는 조건식 위치로 이동 
		 */
		
		for(int i = 1; i <=5; i++) {
			System.out.println("Hi!");
			if (i==3) {
				break;
			}
		}
		for(int i = 1; i <=10 ; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);	
		}
	}

}
