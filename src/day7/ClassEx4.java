package day7;

public class ClassEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.studentInfo();
		Student s2 = new Student("디지털 컨버전스 ... 자바", "이순신");
		s2.attendFunction();
		s2.outFunction();
		s2.studentInfo();
	}

}

class Student {
	
	private String name; // 만들어 지고 나서야 확인 가능한가 그 전에도 확인 가능한가? 전자면 static 불가, 후자면 ok.
	// 즉 하나의 값을 모든 객체가 공유 가능한지 불가한지 따져가면 된다. 때문에 이름은 static을 쓰면 안됨!
	private String classType;
	// 만약 한 반밖에 없으면 static 써도 되긴 한데... 보통 학원, 학교는 그렇지 않으므로 사용 불가.
	private boolean attendence;
	// 마찬가지로 출석 여부도 개개인마다 다르기 때문에 사용 불가!
	private String enterTime, outTime;

	
	public static int currentTime;
	public static int date;
	
	public void attendFunction() {
		System.out.println(name + "님이 입실했습니다.");
		attendence = true;
		enterTime = "9시";
	}
	
	public void outFunction() {
		System.out.println(name + "님이 퇴실했습니다.");
		attendence = false;
		outTime = "18시";
	}
	

	public void studentInfo() {
		System.out.println("과정: " + classType);
		System.out.println("이름: " + name);
			if (attendence==true) {
				System.out.println("입실 중입니다.");
				System.out.println("입실 시간: " + enterTime);
			} else {
				System.out.println("퇴실 했습니다.");
				System.out.println("입실 시간: " + enterTime);
				System.out.println("퇴실 시간: " + outTime);
			}
		
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public boolean isAttendence() {
		return attendence;
	}

	public void setAttendence(boolean attendence) {
		this.attendence = attendence;
	}

	public String getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public static int getCurrentTime() {
		return currentTime;
	}

	public static void setCurrentTime(int currentTime) {
		Student.currentTime = currentTime;
	}

	public static int getDate() {
		return date;
	}

	public static void setDate(int date) {
		Student.date = date;
	}

	public Student() {
			classType = "자바";
			name = "홍길동";
			
	}
	public Student(String classType, String name) {
		this.classType = classType;
		this.name = name;
	}
}