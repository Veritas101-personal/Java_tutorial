package day7;

import java.util.Scanner;

public class ClassEx3 {

	public static void main(String[] args) {
		// 메소드 : 하나의 기능을 하도록 모아놓은 코드
		// 클래스: 어떠한 정보를 나타내기 위해 모아놓은 코드 
		// 	     - 변수: 정보를 관리 (예 차 - 바퀴 몇개 와이퍼 몇개 엔진 몇기통...)
		//       - 메소드: 기능을 관리(차- 바퀴는 움직이도록 보조 와이퍼는 비, 눈 제거, 엔진은 차 기동...) - 근데 왜? 편하게 쓰려고

		// point (원하는 정보에 정확히 접근하도록 해줌)
		// 	- private int x,y
		//	- public void print(){}
		//	- public void move(int x1, int y1){}
		// 	- public void setX(int x1){}
		//	- public int getX(){}
		
		// 그럼 언제 호출하는가? (메소드, 생성자 호출시기)
		// 메소드: 메소드르 호출할 때 사용
		// 생성자: 객체를 생성할 때만 실행, 그러나 생성자는 중간에 직접 호출 불가!
		
		// 오버로딩 : 동일한 이름을 가진 생성자나 메소드가 2개 이상인 경우 / 다름과 같은 경우는 오버로딩, 아니면 오류발생
		// 1. 매개변수가 달라야 한다
		// 	- 갯수
		// 	- 자료형
		// 클래스 변수/메소드 : static 있다!
		// 객체 변수/메소드 : static 없음.
		
		// 클래스 변수는 객체 메소드에서 사용가능? o
		// 객체 변수는 클래스 메소드에서 사용가능? x
		// 클래스 메소드는 객체 메소드에서 사용가능? o
		// 객체 메소드는 클래스 메소드에서 사용가능? x
		
		// The local variable 변수명 may not have been initialized = 변수 초기화 안하고 값 사용 => 변수초기화
		
		// Duplicate local variable 변수명 => 변수 중복 선언 변수명 수정 또는 삭제
		
		// Syntax error on token "else", delete this token => if문이 ;에 의해 끋난 후 else가 온 경우
		
		// The left=hand side of assignment must be a variable => else if 를 써야하나 else를 쓰고 조건문을 쓸 경우
		// 조건문이 실행문으로 인식이 되고 따라서 왼쪽에 변수명이 와야 한다. (else if를 쓰던지 조건문 제거)
		
		
		//클래스 메소드 호출은 클래스명.클래스메소드명또는 객체.클래스명 둘다 가능
		
		KiaCar.printInfo();
		KiaCar c1 = new KiaCar();
		c1.printCarInfo(); // 가능하나 권장 X
		KiaCar.printInfo();
		KiaCar c2 = new KiaCar("뉴그랜버드", 6);
		c2.printCarInfo();
		KiaCar.printInfo();
		for(int i = 0; i<10; i++) {
			c2.speedUp();
			c2.printSpeed();
		}
		for(int i = 0; i<20; i++) {
			c2.speedDown();
		}
	}
}
// 모닝, k3, 쏘렌토
class KiaCar {
	// 클래스 변수
	private static String manufacturer = "KIA"; // 기업명을 멋대로 바꾸는거 방지
	private static int salesNumber = 0; // 판매량 조작 방지
	
	// 객체 변수
	int wheel;
	boolean power;
	int speed;
	String carName ="미정";
	String carNum;
	public static String getManufacturer() {
		return manufacturer;
	}
	public static int getSalesNumber() {
		return salesNumber;
	}
	public static void printInfo() {
		System.out.println("제조사: " + manufacturer);
		System.out.println("판매량: " + salesNumber +"대");
	}
	//클래스 메소드
	
	
	//객체 메소드
	public void turnOn() {
		System.out.println("시동이 켜졌습니다.");
	}
	
	public void turnOff () {
		if(speed==0) {
			System.out.println("시동이 꺼집니다.");
		} else {
			System.out.println("속도가 0이 아니어서 시동을 끌 수 없습니다.");
		}
	}
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		if (speed!=0) {
			speed--;
		}
	}
		
	public void printSpeed () {
		System.out.println("현재 주행 속도는 " + speed + "km/h입니다.");
	}
	public void printCarInfo() {
		System.out.println("차종 : " +carName);
		System.out.println("바퀴수 : " + wheel);
		printSpeed();
	}
	//생성자
	public KiaCar() {
		wheel = 4;
		salesNumber++;
		carName = "";
		
	}
	public KiaCar(String carName, int wheel) {
		/* 멤버 변수의 이름과 매개변수의 이름이 같으면 매개변수의 우선순위가 높다.
		 * 이러한 경우 멤버 변수를 의미하기 위해 변수명 앞에 this.를 써서
		 * this.멤버변수명으로 사용
		 * this는 자기 자신을의미하는 개체
		 * */
		this.carName = carName;
		this.wheel = wheel;
		salesNumber++;
		
	}
	
	
	
}

