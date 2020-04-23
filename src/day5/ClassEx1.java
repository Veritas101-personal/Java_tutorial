package day5;

import day4.TextEx3;
import day5_1.DefaultClassEx1;



public class ClassEx1 {

	public static void main(String[] args) {
		/* 비유
		 * 카메라 설계도 = 클래스
		 * 카메라 = 객체 (인스턴스)
		 * 사진을 찍는 행위 = 메소드
		 * 렌즈, 셔터 = 멤버 변수
		 * 
		 * 클래스
		 * 1) 멤버변수: 부품
		 * 2) 메소드 : 기능
		 * 3) 생성자: 멤버변수의 초기화
		 * 
		 * (접근제한자) 클래스명{
		 * 접근제한자 멤버변수;
		 * 접근제한자 메서드
		 * 생성자
		 */
	
		/* 접근 제한자
		 * - public : 누구나 사용가능
		 * - private : 나만 사용가능 (해당 클래스 내에서만 사용가능) / 일반적으로 클래스에 붙이지는 않음
		 * - protected : 나 + 패키지 + 자식클래스
		 * - default (접근제한자를 쓰지 않으면 무조건 얘! 그렇다고 쓰면 안됨..) : 나 + 패키지
		 * 
		 * 메소드 - 기능(중요! 아무리 카메라(클래스)를 만드는 것도 중요하지만 기능이 안좋으면?) 
		 * 기본 포맷
		 * 		|
		 * 		V
		 * 접근제한자 (static) 리턴타입 메소드명 (매개변수들)
		 * 			구현;
		 * 	
		 * 		return 값;
		 * 
		 */
		
	
		TextEx3.main(null);
		DefaultClassEx1.main(null);
		// DefaultClassEx2는 다른 패키지에 있는 클래스고 접근제한자가 default라서 사용 불가
		//DefaultClassEx2.main(null);
		Point p1 = new Point ();
		p1.x1 = 10;
		p1 = new Point(1,2);
		//p1 = new Point(3,4,5); - 생성자 3개짜리 변수를 안만들어서 불가! 
		
		//Point클래스의 x2s는 Point클래스의 x2는 private이기 때문에 다른 클래스에서 사용 불가
		//p1.p2. = 10;
		
	

	}
// point: 2차원 좌표평면에서 점 1개를 나타내는 클래스

}

class Point {
	int x1;//x축의 좌표
	int y1;//y축의 좌표
	private int x2;
	private int y2;
	public int x3;
	public int y3;
	public Point () { // 0,0인 상태에서 만드는 걸 선언
		x1 = x2 = x3 = 0; // 의미는 읎다
		y1 = y2 = y3 = 0; // 이것도 읎다
	}
	// 생성자 오버로딩!
	public Point(int x, int y) { // x,y 지점에서 만드는 걸 선언
		x1 = x2 = x3 = x;
		y1 = y2 = y3 = y;
	}
	
	
}