package day8;

public class OverridingEx1 {

	public static void main(String[] args) {
		// public : 나 + 패키지 + 자식클래스들 + 일반 클래스들
		// protected : 나 + 패키지 + 자식 클래스들
		// default : 나 + 패키지
		// private : 나
		
		// this()와 super()는 생성자 코드에서만 사용가능하다
		// 다른 메소드에서는 사용할 수 없다.

		Duck d = new Duck();
		d.cry();
		System.out.println(d.getWing());
		Sparrow s = new Sparrow();
		s.cry();
		s.cry(0);
		Sparrow s2 = new Sparrow(1);
		System.out.println(s.getWing());
		System.out.println(s2.getWing());
		
	}
}
class Bird{
	protected int wing;
	public void cry () {
		System.out.println("새가 웁니다");
	}
	public Bird( ) { wing = 2;}
	public Bird(int wing) { this.wing = wing; }
	
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	
}
class Duck extends Bird {
	// 메소드 오버라이딩
	@Override
	public void cry() {
		// 메소드 오버라이딩을 하는데 작업하는 메소드의 명과 같은 부모 클래스의 메소드를 super 없이 호출하면 부모 클래스의 메소드가 아닌
		// 내 클래스의 메소드로 호출되서 재귀함수로 인한 무한호출 발생.
		// 때문에 부모클래스의 메소드를 의미하기 위해 앞에 super를 붙임.
		// cry();//Duck클래스의 cry()로 호출되어 재퀴호출이 된다. 에러발생
		
		// this는 내 객체정보, this()는 내 생성자
		// super는 부모 객체정보, super()는 부모 생성자
		
		super.cry();
		System.out.println("오리: 꽥꽥");
	}
	//public Duck() {super();}// 생성자가 하나도 없으면 기본 생성자가 자동으로 생성이 된다.
}
	
class Sparrow extends Bird {
	// 메소드 오버로딩
	public void cry(int num) {
		super.cry();
		System.out.println("참새: 짹짹!");
	}
	
	public Sparrow() {
		super(); // 부모클래스 생성자
		// TODO Auto-generated constructor stub
	}

	public Sparrow(int wing) {
		super(wing);
		// TODO Auto-generated constructor stub
	}
}
	

	
