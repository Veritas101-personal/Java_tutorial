package day19_review;

import java.util.*;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		int a = 0;
				
		while (a!=5) {
			
			System.out.println("번호를 입력하세요.");
			System.out.println("1.학생정보입력");
			System.out.println("2.학생정보수정");
			System.out.println("3.학생정보삭제");
			System.out.println("4.학생정보출력");
			System.out.println("5.프로그램종료");
			System.out.println("---------------");
			System.out.print("명령을 입력하세요: ");
			
			a = scan.nextInt();
			System.out.println();
			
				if (a==1) {
					addStudent(list,scan);
				} else if (a==2) {
					modifyStudent(list,scan);
				} else if (a==3) {
					deleteStudent(list, scan);
				} else if (a==4) {
					studentInfo (list);
				} else if (a==5) {
					System.out.println("프로그램 종료");
					break;
				} else {
					System.out.println("번호를 입력하세요.");
				}
				
			System.out.println();
		}
	
	}

	
	public static void addStudent(ArrayList<Student> list,Scanner scan) { // 학생 정보 입력, 경우에 따라선 성적 입력도 선택
		// 배열 없으면 student 클래스 내에서만 데이터가 머물러서 다른 곳에선 확인이 안된다잉
		
		
		Student stu = new Student();
		
		System.out.print("이름을 입력하세요. : ");
		stu.setName(scan.next()); // 학생이름
		System.out.print("학년을 입력하세요. : ");
		stu.setGrade(scan.nextInt()); // 학년 (편입 여부도 있을 수 있기 때문에...)
		System.out.print("전공을 입력하세요. : ");
		stu.setMajor(scan.next());
		System.out.print("학생번호를 입력하세요. : ");
		stu.setStudentNum(scan.nextInt()); // 학생번호
		
		
		if(list.contains(stu)) { // 클래스내 불리언 메소드 기준을 학생번호로 이미 잡아놨기 때문에 이렇게만 입력해줘도 상관 없음
			System.out.println("해당 학생은 이미 존재합니다.");
		} else {
			list.add(stu);
		}
		
		
	}
	
	
	public static void studentInfo (ArrayList<Student> list) { // 학생 정보 열람
		
		System.out.println("학생번호-성명--학년--전공");
		System.out.println();
		
		for (Student tmp : list) {
			System.out.println(tmp);
		}
		
	}
	
	
	public static void deleteStudent (ArrayList<Student> list,Scanner scan) { // 졸업이나 기타 사유등으로 인해 정보 삭제
		
		Student stu = new Student();
		
		System.out.print("학생번호를 입력하세요. : ");
		stu.setStudentNum(scan.nextInt());
		
		if (list.contains(stu)) {
			System.out.print("정말로 삭제하시겠습니까? (Y/N) : ");
			
			char a = scan.next().charAt(0);
			
			switch(a) {
			
			case 'y': case 'Y':
				list.remove(stu);
				System.out.println("삭제가 완료되었습니다.");
				break;
			
			case 'n': case 'N':
				break;
				
			default:
				System.out.print("잘못된 명령어입니다. (Y/N) : ");
				a = scan.next().charAt(0);
			}
			
		} else {
			System.out.println("해당 학생은 존재하지 않습니다.");
		}
		
	}
	
	public static void modifyStudent(ArrayList<Student> list, Scanner scan) {
		
		Student stu = new Student();
		
		if (detectDuplicate(list, scan)==false) {
			System.out.println("해당 학생은 존재하지 않습니다.");
		} else {
			list.remove(stu);
			addStudent(list,scan);
		
		}
		
		
	}
	
	
	public static boolean detectDuplicate(ArrayList<Student> list, Scanner scan) { // 중복 데이터 확인
		
		Student stu = new Student();
		
		System.out.print("학생번호를 입력하세요. : ");
		stu.setStudentNum(scan.nextInt());
		
		if(!list.contains(stu)) {
			return false;
		} else {
			return true;
		}
	}
	
}

class Student {
	
	private String name;
	private int grade;
	private String major;
	private int StudentNum;
	
	
	String course;
	double score;
	
	public Student () {}
	public Student (String name, int grade, String major, int StudentNum) {
		super();
		this.name=name;
		this.grade=grade;
		this.major=major;
		this.StudentNum=StudentNum;
	}
	
	@Override
	public String toString() {
		return StudentNum + "    " + name + "    " + grade + "    " + major;
	}
	public void score(double nextDouble) {
		// TODO Auto-generated method stub
		
	}

	public void course(String next) {
		// TODO Auto-generated method stub
		
	}

	public Student (String name, int grade, String major) {
		this.name=name;
		this.grade=grade;
		this.major=major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStudentNum() {
		return StudentNum;
	}

	public void setStudentNum(int studentNum) {
		StudentNum = studentNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + StudentNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) { // 정보 중복 기준이 학생번호!
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (StudentNum != other.StudentNum)
			return false;
		return true;
	}
	
	
}