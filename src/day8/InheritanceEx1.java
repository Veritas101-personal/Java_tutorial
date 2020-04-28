package day8;

public class InheritanceEx1 {

	public static void main(String[] args) {
		//상속 - 부모 클래스에서 부터 멤버 변수나 멤버 메소드를 물려 받는 것 (때문에 재사용이 용이한 메소드를 만드는것도 중요!)
		// 키워드 : extends => 상속은 클래스를 선언 할 때 받는 것
		
		// class 클래스명 extends 부모 클래스명{
		// 멤버변수
		// 멤버 메소드
		// 생성자
		
		// 상속 받은 클래스는 부모 클래스의 public 또는 protected로 되어있는 멤버 변수와 멤버 메소드를 사용할 수 있다.
		// 생성자와 초기화 블럭은 상속되지 않는다. 그러나 부모의 생성자를 호출 할 수 있다.
		
		// 부모는 1명만 가능
		// A는 B이다 => 성립, 말이 되면 => 상속, B:부모 A: 자식
		// A는 B를 가지고 있다 => 성립=> 포함, A:클래스, B: 멤버변수
		
		// 원은 도형이다 +> 도형: 부모, 원: 자식
		// 원은 점(중심)을 가지고 있다 => 원: 클래스, 점: 멤버변수
		
		//예 : 스마트폰&카메라 => 스마트폰이 카메라 포함 (포함 관계)
		// 상속과 포함의 차이
		// 상속은 자식이 사용할 수 없는 것 : private으로 된 메소드나 멤버변수
		// 포함은 클래스가 메머변수에서 사용할 수 없는 것
		// : private 나 protected 된 메서드나 멤버변수
		
		// 상속은 멤버변수(일반변수)를 사용하기 위해 초기화를 하지 않아도 된다.
		// 포함에서 멤버변수(객체)는 new를 이용하여 객체를 생성한 후 해당객체의 멤버 변수(일반변수)를 사용할 수 있다.
		
		// 포함: 클래스A의 멤버 변수로 클래스 B의 객체가 오는 것
		//		Child클래스의 멤버 변수로 Point 클래스의 p1이 오는 것
		
		Child c1 = new Child();
		c1.print2();
		c1.setD(12);
		c1.print2();
		
	}

}

class Child extends Parent {
	private int e;
	Point p1 = new Point();
	public void print2() {
		System.out.printf("%d,%d\n", p1.x,p1.y);

		System.out.printf("a=%d, b=%d, c=%d, d=%d, e=%d\n",a,b,c,getD(),e);
		// 변수 d는 privated로 되어 있기 때문에 확인은 가능하지만 직접 접근은 불가. 그래서 getter / setter 호출함으로 그 값을 가져와야함
	}
	
}
class Parent{
	public int a;
	protected int b;
	int c;
	private int d=10;
	public void print() {
		System.out.printf("a=%d, b=%d, c=%d, d=%d\n",a,b,c,d);
	}
	public Parent() {}
	//public Parent(int a, int b, int c, int d) {
	//	this.a=a; this.b=b; this.c=c; this.d=d;
	//}
	
	public Parent(int a, int b, int c, int d) {
		//super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
		

}

