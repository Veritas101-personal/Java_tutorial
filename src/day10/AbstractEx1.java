package day10;

public class AbstractEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class A{
	int a;
	public void print() { System.out.println(a); }
	public abstract void test();
}

class B extends A { // 1. 상속받는 클래스를 오버라이딩 하거나 2. 해당 클래스를 똑같이 추상 클래스로 정의하는 식으로 

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	} 
	
	
}