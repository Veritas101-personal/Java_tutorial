package day10;

public class PolymorphismEx2 {

	public static void main(String[] args) {
		/* 아래는 제조사 종류와 상관없이 10개짜리의 배열에 차량 관리 가능*/
		
		/*
		Car [] arr = new Car[10]; // 입고됱 차량을 관리하기 위한 배열 / 뭔 브랜드의 차가 올진 모르기 때문에 일단 부모클래스의 변수로
		arr[0] = new KiaCar(); // 첫 입고차는 기아
		arr[1] = new HyundaiCar(); 
		*/
		
		/* 아래는 제조사가 추가되면 해당 제조사를 관리하기 위한 배열을 추가로 생성해서 관리
		KiaCar karr[] = new KiaCar[10];
		HyundaiCar harr[] = new HyundaiCar[10];
		karr[0] = new KiaCar();
		harr[0] = new HyundaiCar();    이런 식으로 따로 관리를 하는 방법이 있지만 추가 작업이 꽤 번거로움
		*/
		
		Car arr[] = new Car[10];
		arr[0] = new KiaCar("모닝");
		arr[1] = new KiaCar("K3");
		arr[2] = new KiaCar("쏘울");
		arr[3] = new HyundaiCar("아반떼");
		arr[4] = new HyundaiCar("쏘나타");
		arr[5] = new HyundaiCar("그랜저");
		
		showCar(arr);
		
	}
	public static void showCar(Car []arr) {
		
		System.out.println("입고된 차량 리스트");
		
		for (int i = 0; i < arr.length; i++) {
				if(arr[i] != null) {
					if(arr[i] instanceof KiaCar) {
							System.out.println(arr[i].manufacturer+" : "+arr[i].name + " : " + ((KiaCar)arr[i]).Kia); 
					}
					if (arr[i] instanceof HyundaiCar) {
							System.out.println(arr[i].manufacturer+" : "+arr[i].name + " : " + ((HyundaiCar)arr[i]).h);
					}
				}
		}
	
	}
}
class Car{
	int wheel;
	String type;
	String manufacturer;
	String name;
	public Car() {}
	public Car(String manufacturer, String name) {
		this.manufacturer = manufacturer;
		this.name = name;
	}
}

class KiaCar extends Car {
	String Kia = "기아차입니다.";
	public KiaCar() {manufacturer = "Kia";}
	public KiaCar(String name) {
		super("Kia",name);
	}
}
class HyundaiCar extends Car{
	String h = "현대차입니다.";
	public HyundaiCar() {manufacturer = "Hyundai";}
	public HyundaiCar(String name) {
		super("Hyundai", name);
	}
	

}