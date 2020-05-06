package day10;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		/* 자식 객체를 생성하여 부모가 참조하는 경우에는
		/* 자식 클래스의 멤버 변후 power, ch, text가 만들어진 후 부모가
		 * power와 ch만 사용하기 때문에 이 경우엔 가능
		 * */
		Tv t1 = new CaptionTv();
		/*부모객체를 생성하여 자식이 참조하는 경우에는
		 * 부모 클래스의 멤버 변수 power, ch만 만들어진상태에서 자식이 text를 사용하려고하면
		 * 문제가 되기 때문에 이 경우엔 불가능*/
		//CaptionTv ct1 = new Tv();
		t = ct; // 자손타입 -> 조상타입
		// t = new Tv(); /*조상타입 ->자손타입은 항상 가능한 것이 아니라 조건부 가능
		 				// 상황에 따라서 classCastException 에러가 발생*/
		/*가능한 경우는 부모객체 t가 부모클래스를 통해 생성된 객체가 아니라 자식 클래스를 통해 생성된 객체와 연결이 된 경우는 가능*/
		ct = (CaptionTv)t;// 조상타입 -> 자손타입 / 이 방법이 항상 가능한 건 아님
		SmartTv st = new SmartTv();
		ct =new CaptionTv();
		Tv.display(st);
		Tv.display(ct);
		
	}

} 


class Tv{
	
	boolean power = false;
	int ch;
	void power() { power = !power; }
	void chUp() {ch++;}
	void chDown() {ch--;}
	public static void display(Tv t) {
		if(t instanceof CaptionTv) { // instanceof는 이런 식으로 조건문과 같이 많이 사용됨
			// 이런식으로 사용 안하면 클래스가 생길 때마다 이를 새로 작성해야 하는 번거로움 발생
			System.out.println("캡션TV");
		}
		else if(t instanceof SmartTv) {
			System.out.println("스마트TV");
		}
	}
	
	
}
class CaptionTv extends Tv{
	String text;
	void cation() {System.out.println("캡션 : " + text );}
	
}
class SmartTv extends Tv{
	String ip;
}