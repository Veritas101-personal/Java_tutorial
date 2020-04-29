package day7;

public class FinalEx1 {

	public static void main(String[] args) {
		// final
		//	- 변수: 상수 / 지역변수는 자동 초기화 불가능
		//	- 메소드: 오버라이딩 불가! / 오버로딩은 가능
		//	- 부모 클래스로 취급 불가
		// 	- final 멤버 변수는 명시적 초기화를 하던지 생성자에서 초기화를 해야한다
		
		final double PI = 3.141592; // => 초기화
		//PI = 3.14; => 초기화된 final 실수를 수정하려 해서 오류
		A a = new A();
		a.print();
		int arr[] = new int[10];
		System.out.println(arr.length);
		//arr.length =11; 
		Array array = new Array(5);
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		//System.out.println(array.get(3));
		//System.out.println(array.get(4));
		for (int i=0; i<5 ; i++) {
			System.out.println(array.pop());
		}
		System.out.println(array.length);
	}

}
final class A{
	public void print() {
		System.out.println("A클래스입니다.");
	}
}
class B { // extends A { => 클래스 a는 final 클래스이기 때문에 상속하려 하면 에러 발생 (다른 클래스의 자식이 되는건 가능)
	
}

class D{
	// print 메소드에 final을 붙이면 아래 클래스 E에서 print 매소드를 오버라이드 할 수 없다.
	public void print() {
		System.out.println("D클래스입니다.");
	}
}
class E extends D{
	@Override
	public void print() {
		System.out.println("E클래스입니다.");
	}
}

class Array {
	public final int length; // 변수 초기화는 가능하지만, 앞으로 수정이 불가능 하기 때문에 초기값을 설정하라는 의미
	private int arr[];
	private int index = 0;
	public Array() {
		length = 10;
		arr = new int[length];
	}
	public Array(int length) {
		this.length = length;
		arr = new int[length];
	}
	public void push(int num) {
		if (index < length) {
			arr[index] = num;
			index++;
		
		}
		/*
		 * else {
		 * 		//1. 안내 메시지만 처리
		 * 		//2. 배열을 확장하여  추가하는 경우
		 * }
		 */
	}
	public int get(int index) {
		if(this.index > index) {
			return arr[index];
		}
		return 0; // 잘못된 접근이기 때문에 예외처리 클래스 이용하는게 맞지만, 아직 학습하지 않아서 일단 이걸로...
	}
	
	public int pop() {
		if (index==0) {
			return 0; // 여기도 throw로 예외 발생시키는게 맞음. 이건 나중에.
		}
		int res = arr[--index];
		return res;
	}
}
