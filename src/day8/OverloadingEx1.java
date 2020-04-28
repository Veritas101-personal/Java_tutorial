package day8;

public class OverloadingEx1 {

	public static void main(String[] args) {
		// println 메소드 오버로딩
		
		System.out.println(5); // int형
		System.out.println('5'); // char형
		System.out.println("5"); // string형
		System.out.println(5.0); // double형
		System.out.println(5.0f); // float형
		System.out.println(false); // boolean형
		System.out.println(5L); // long형

		// => 알고보면 우린 무의식적으로 오버로딩을 쓰고 있었단 말씀.
		
		printString();
		printString("홍길동");
		printString("홍길동","임걱정");
		printString("홍길동","임꺽정","이순신");
		
		
		
	}
	// 매개변수를 가변인자로 하는 메소드 예제
	public static void printString(String...str) { // str이 자동으로 배열로 지정됨 / 주의할 건 str이 배열로 지정되도 str[]은 안됨
		for(String tmp : str) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	
}
