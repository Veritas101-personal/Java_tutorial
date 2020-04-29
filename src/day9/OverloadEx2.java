package day9;

public class OverloadEx2 {

	public static void main(String[] args) {
		// 오버로딩: 동일한 이름을 가진 메소드/생성자가 여러 개 존재하는 것
		// 			=> 두 정수의 합을 알려주는 메소드
		// 오버라이딩: 
		
		/*
		// 아래 코드는 sum 메소드에 static이 안붙는 경우 호출방법
		OverloadEx2 obj = new OverloadEx2();
		System.out.println(obj.sum(1, 2));
		*/
	
		System.out.println(sum(1,2));
		System.out.println(sum(1.1,2.1));
		System.out.println(sum(1,4.54,5.3));
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum());
		// 문자1에 대한 유니코드값(아스키코드)인 49가 대신 들어가 자동 자료변환이 되어 연산한다.
		System.out.println(sum('1',2,3,4,5));
		
	}	
	/*
	public int sum(int num1, int num2) {
		return num1+num2;
	
		// 인스턴스(객체) 메소드는 클래스 메소드에서 사용 할 수 없다.
		//	=> 클래스 메소드는 객체를 만들지 않고 사용 가능하나 인스턴스 메소드는 
		//	     인스턴스(객체)를 생성하고 난 뒤에 사용하기 때문에 그냥 사용은 불가
	
	}
*/	
	public static int sum(int num1, int num2 ) {
		return num1 + num2;
	}

	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	
	public static double sum(double...ds) {
		double res = 0.0;
		for (double tmp : ds) {
			res+= tmp;
		}
		return res;
	}
	// 가변인자는 향상된 forㅁ문 ds(grr)[0]배열의 ds(=arr)[ㅑ]배열의 tmp ㅇㄴ
	
}

