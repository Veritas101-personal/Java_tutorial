package day12;

public class WrapperEx1 {

	public static void main(String[] args) {
		boolean b1 = true;
		Boolean b2 = true;
		char ch1 = 'a'; // ch1변수에 a저장
		Character ch2 ='a'; // a가 저장된 주소를 ch2에 전달, 오토박싱
		ch1 = ch2; // 언박싱
		Integer num2 = 10;
		Integer num = null; // 그냥 int로는 받지 못함

		double dnum1 = 1.23;
		Double dnum2 = 1.23;
		Double dnum3 = new Double(1.23);
	}

}
