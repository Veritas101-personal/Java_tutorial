package studentManageProgram;

import java.util.Scanner;


public class Output {

	public static void main(String[] args) {
		// 학생정보: 학년, 반, 번호. 이름, 국어. 영어. 수학 등등..
		// 기능: 학생 정보 추가, 학생정보 수정, 학생정보 삭제, 학생정보출력
		
		/* 1. 데이터 관리를 위한 작업
		 * => 변수나 클래스 이용
		 * 학생정보 => student 클래스
		 * 과목정보 => subject 클래스
		 * 2. 기능구현
		 * => 기능을 인터페이스로 정의후 해당 인터페이스를 구현하는 구현 클래스
		 * 3. 테스트
		 * */
		
		StudentInfo []student = new StudentInfo[10];
		int arrNum = 0;
		int a = 0;
		
		String stuName;
		int stuGrade;
		int stuSection;
		String stuNum;
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		while(a!=5) {
			
			System.out.println("번호를 입력하세요.");
			System.out.println("1.학생정보입력");
			System.out.println("2.학생정보수정");
			System.out.println("3.학생정보삭제");
			System.out.println("4.학생정보출력");
			System.out.println("5.프로그램종료");
			
			a = scan.nextInt();
			
				if (a==1) {
					
					StudentInfo stu = new StudentInfo();
						
						System.out.println("학년을 입력하세요.");
						stu.setGrade(scan.nextInt());
						System.out.println("반을 입력하세요.");
						stu.setSection(scan.nextInt());
						scan.nextLine();
						System.out.println("학생번호를 입력하세요");
						stu.setStudentNum(scan.nextLine());
						System.out.println("이름을 입력하세요.");
						stu.setName(scan.nextLine());
						
						System.out.printf("%d학년 %d반 %s번 %s\n",stu.getGrade(),stu.getSection(),stu.getStudentNum(),stu.getName());
						System.out.println("");
						
						student[arrNum] = stu;
						
						student[arrNum].printStuInfo();
						
					arrNum++;
					
				} else if (a==2) {
					
					StudentInfo stu = new StudentInfo();
					
					System.out.println("학년을 입력하세요.");
					stu.setGrade(scan.nextInt());
					System.out.println("반을 입력하세요.");
					stu.setSection(scan.nextInt());
					scan.nextLine();
					System.out.println("학생번호를 입력하세요");
					stu.setStudentNum(scan.nextLine());
					System.out.println("이름을 입력하세요.");
					stu.setName(scan.nextLine());
					
					System.out.printf("%d학년 %d반 %s번 %s\n",stu.getGrade(),stu.getSection(),stu.getStudentNum(),stu.getName());
					if(student[0].getGrade()==stu.getGrade()) {
						
					}
						
					if(student[0].getName().equals(stu.getName())) {
						
					}
					
				} else if (a==3) {
				
				} else if (a==4) {
					
					System.out.println("어떤 과목을 출력하시겠습니까?");
					String classes = scan.nextLine();
					
				
				} else if (a==5){
					
				} else {
					System.out.println("잘못된 값입니다. 다시 입력하세요.");
					a = scan.nextInt();
				}
			}
		
		
		
			
		
		
		
		StudentInfo student1 = new StudentInfo("gg",1,1,"1");
		student1.setScore(new Subject("국어",40,40,10,10),
				new Subject("수학",30,10,10,10),
				new Subject("영어",70,40,10,10));
		student1.printScore();
		
		System.out.println(student1.getName());
		
	}
	
	

}
