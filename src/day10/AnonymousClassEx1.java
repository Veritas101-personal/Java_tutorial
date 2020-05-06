package day10;

public class AnonymousClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		// A1 a = new A();
		test(c); // c는 아래 B 인터페이스를 이용해서 만든 클래스이기 때문에 B를 받을 test가 C를 받는 건 가능. 그러나 a는 그렇지 않으므로 에러
		/* 인터페이스 B1을 구현한 클래스를 아래에서 바로 만든 후 만들어진 클래스의 객체를 
		 * 매개변수로 전달하여 test메소드를 실행
		 * 이 과정과 같은 내용이 위에 있는 클래스 C를 이용한 방법이다.*/
		test(new B1() {
			public void func() {}
		});
	}
	public static void test(B1 b) {
		
	}

}
class A1{
	
}
interface B1{
	public void func();
}
class C implements B1{

	@Override
	public void func() {
	
		
	}
	
}