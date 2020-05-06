package day10;

public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface RemoteController {  // 작성할 때 멤버 변수가 없다고 생각하면서 작성해야 함
	int num = 10;
	public int chUp(int ch);
	public int chDown(int ch);
	public int volUp(int vol);
	public int volDown(int vol);
	/*인터페이스에 새로운 추상 메소드를 추가하면 해당 인터페이스를 구현한 모든 클래스에 에러 발생! (해당 부분이 오버라이딩을 안한 상태라서)
	 * 때문에 이를 일일이 수정해야하는 번거로움을 해결하고자 디폴트 메소드 사용
	 * 디폴트 메소드는 구현된 내용이 없는 메소드지만 추상 메소드와의 차이는 추상 메소드는
	 * 구현 클래스에서 꼭 오버라이딩을 해야하지만 디폴트는 안해도 괜찮음*/
	public default void test() {}
	
	// 책의 목차처럼 해당 기능을 한눈에 파악 가능
	
}

class TvRemoteController implements RemoteController{ //인터페이스를 실제로 구현하려면 이를 받아줄 클래스가 필요. 그 다음 오버라이딩
	
	@Override
	public int chUp(int ch) {
		// TODO Auto-generated method stub
		return ++ch;
	}

	@Override
	public int chDown(int ch) {
		// TODO Auto-generated method stub
		return --ch;
	}

	@Override
	public int volUp(int vol) {
		// TODO Auto-generated method stub
		return ++vol;
	}

	@Override
	public int volDown(int vol) {
		// TODO Auto-generated method stub
		return --vol;
	}
	
	
}