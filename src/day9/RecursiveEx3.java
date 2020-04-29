package day9;

public class RecursiveEx3 {

	public static void main(String[] args) {
		// 재귀메소드
		// 1.메소드 안에서 자신을 호출하는 메소드
		// 2.빠져나가기 위한 조건도 같이 걸어야함
		// 3.재귀메소드를 사용하기 전에 먼저 반복문을 써서 해결해보고
		// 	  그 다음 재귀메소드 작업이 더 간결하게 작성되는것이 좋다 생각되면 사용
		// * 상속에서 실수 할 때도 있다... 자세한건 라인 17~29 까지 읽어보셈
			ClassB b = new ClassB();
			b.print();
	}
}

class ClassA {
	public void print() {
		System.out.println("A클래스입니다.");
	}
}
class ClassB extends ClassA {
	//print 메소드 오버라이딩
	public void print() {
		// print(); => 이건 부모 클래스의 print가 아니라 자기 자신의 print를 불러서 재귀 호출 발생;;
		super.print(); // 요걸로 상속 메소드를 명확하게!
		System.out.println("B클래스입니다.");
		
		// => 이런 점때문에 오버라이딩을 할 때 잘 확인해보고 작성할 것
	}
	// print 메소드를 오버로딩
	public void print(int num) {
		print();
		System.out.println("B클래스입니다.");
	}
	// => 요건 오버로딩이라서 위와 같은 문제가 발생되지 않음
}

