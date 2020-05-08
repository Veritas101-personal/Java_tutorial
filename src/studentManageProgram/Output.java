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
		
		int size = 30;
		StudentInfo student[] = new StudentInfo[size];
		
		int arrNum=0; // 현재 저장된 학생수 카운팅
		
		int a = 0;
	
		
		
		String stuName;
		int stuGrade;
		int stuSection;
		String stuNum;
		
		Subject subjectList[];
		String title;
		int midterm, finals, performance, attendance;
		
		
		Scanner scan = new Scanner(System.in);
		
		while(a!=5) { // while문으로 한 명령이 완료되면 바로 메인 화면으로 복귀. 단, 5가 입력되면 프로그램 종료 그 이외엔 지정된 명령어를 받을 때 까지 반복수행
			
			System.out.println("번호를 입력하세요.");
			System.out.println("1.학생정보입력");
			System.out.println("2.학생정보수정");
			System.out.println("3.학생정보삭제");
			System.out.println("4.학생정보출력");
			System.out.println("5.프로그램종료");
			System.out.println("-----------------------");
			System.out.print("명령을 입력하세요: ");
			
			a = scan.nextInt();
			System.out.println();
						
			
				if (a==1) {
					
					// 학생정보 입력
					
					StudentInfo stu = searchInfo(scan);
					System.out.println("이름을 입력하세요.");
					stu.setName(scan.nextLine());
					
				
					if (isDuplicated(student, arrNum, stu) !=-1) { // pos 값이 -1이 아닌 다른 값으로 바뀌면 중복 데이터 있는것으로 간주
						System.out.println("이미 있는 학생입니다.");
						break;
					}
					student[arrNum] = stu;
					
					System.out.printf("%d학년 %d반 %s번 %s\n",stu.getGrade(),stu.getSection(),stu.getStudentNum(),stu.getName());
					System.out.println("");
					
					
					// 과목 정보 작업
					System.out.println("과목 정보를 입력하시겠습니까? (y/n)");
					char subjectMenu = scan.next().charAt(0);
					// yes or no?
					while(true) {
						if(subjectMenu == 'y' || subjectMenu == 'Y') {
							inputSubject(scan,student[arrNum]);
							break;
						} else if (subjectMenu == 'n' || subjectMenu == 'N') {
							break;
						} else {
							System.out.println("y/n중 하나를 입력하세요.");
							subjectMenu = scan.next().charAt(0);
						}
				
						
					}
					
					arrNum++;
					stu=null; // student 배열과 stu와 내용 공유를 막기 위해 stu에 입력된 값을 무효화
	
			
				} else if (a==2) {
					
					modifyStudent(student,arrNum,scan);
					
				} else if (a==3) {
					
					System.out.println("삭제할 학생 정보를 입력하세요.");
					StudentInfo stu = searchInfo(scan);
					if(deleteStudent(student, stu, arrNum)) arrNum--;
					
				} else if (a==4) {
					printStudent(student,arrNum);
				 
					
				} else if (a==5){
					System.out.println("시스템을 종료합니다.");
					
				} else {
					System.out.println("잘못된 값입니다. 다시 입력하세요.");
					a = scan.nextInt();
					
				}
			}

		/*
		StudentInfo student1 = new StudentInfo("gg",1,1,"1");
		student1.setScore(new Subject("국어",40,40,10,10),
				new Subject("수학",30,10,10,10),
				new Subject("영어",70,40,10,10));
		student1.printScore();
		
		System.out.println(student1.getName());
		*/
	}
	
	// 학생 정보 입력
	public static StudentInfo searchInfo(Scanner scan) {
		
		StudentInfo stu = new StudentInfo();
		
		System.out.println("학년을 입력하세요.");
		stu.setGrade(scan.nextInt());
		System.out.println("반을 입력하세요.");
		stu.setSection(scan.nextInt());
		scan.nextLine();
		System.out.println("학생번호를 입력하세요");
		stu.setStudentNum(scan.nextLine());
		
		
		
		return stu;
	}
		/* 만약 이런경우는
		 * int 학생 수를 체크하거나 그럴 때
		 * boolean 학생 정보를 출력했다면 true, 실패시 false  
		 * */
	public static void printStudent(StudentInfo []student, int arrNum) { // 왜 void냐면 그냥 학생 정보 결과를 출력하기 위한 (리턴이 읎다!) 클래스 메소드 이기 때문에!

		for(int i=0 ; i < arrNum; i++) {
			System.out.println("이름: " + student[i].getName());
			System.out.println("학년: " + student[i].getGrade());
			System.out.println("반: " + student[i].getSection());
			System.out.println("번호: " + student[i].getStudentNum());
			System.out.println("--------------------------------------");
			System.out.println();
			student[i].printScore();
		}
	}

	/* 기능 : 콘솔에서 정보를 입력받고 입력받은 정보를 통해 과목들을 저장하고 저장한 과목을 학생정보에 추가하는 기능
	 * 
	 * A:
	 * void = 매개변수를 통해서 원본값을 받을 수 있기 때문!
	 * int : 추가된 과목수 (요것도 가능함!)
	 * 
	 * B:
	 * Scanner : 콘솔에서 입력을 받기 위해
	 * Student : 학생 정보
	 */
	public static void inputSubject(Scanner scan, StudentInfo stu) { //scan은 입력값을 직접 받아야 되서
		System.out.print("입력할 과목 수 : ");
		int subjectCnt = scan.nextInt();
		Subject []subjectList = new Subject[subjectCnt];
		
		// 여러 과목 정보 입력
		for (int i = 0 ; i <subjectCnt ; i++) {
			System.out.print("과목명 : ");
			String title = scan.next();
			System.out.print("중간고사 : ");
			int midterm = scan.nextInt();
			System.out.print("기말고사 : ");
			int finals = scan.nextInt();
			System.out.print("수행평가 : ");
			int performance = scan.nextInt();
			System.out.print("출석점수 : ");
			int attendance = scan.nextInt();
			subjectList[i] = new Subject(title, midterm, finals, performance, attendance);
		}
		if(stu == null) {
			return; // 학생 정보가 없으면 그냥 강제종료 선언
		}
		stu.setScore(subjectList);
		
		
	}
	/*
	 * A 두가지 선택권
	 * 
	 * int - 이 경우엔 삭제돈 뒤의 학생 수를 표현
	 * boolean - 삭제 여부만 확인 / 상세 내용은 메인 메소드에서 확인해야 함 
	 * 
	 * B
	 * int arrNum : 현재 학생수
	 * StudentInfo student[]
	 * StudentInfo stu : 삭제할 학생 정보
	 *  
	 * */
	public static boolean deleteStudent(StudentInfo student[], StudentInfo deleteStudent, int arrNum) {
		if(student == null || deleteStudent == null || arrNum <= 0) return false;
		for (int i = 0 ; i < arrNum ; i++) {
			// 하나씩 검색해서 tmpStudent와 같은 학생이 있는지 확인
			// 있으면 삭제 후 하나씩 자리 수를 밀어줌.
			if (deleteStudent.equal(student[i])) {
				for(int j=i; j<arrNum-1; j++) {
					student[j] = student[j+1];
				}
			
				System.out.println("삭제가 완료되었습니다.");
				System.out.println();
			
			}
		}
		return true;
		
	}
	/*
	 * A
	 * int : 중복되면 번지를 알려주고, 중복 안되면 -1로변환
	 * boolean : 중복되면 true, 아니면 false
	 * 
	 * B
	 * Student [] student
	 * Student stu
	 * */
	
	public static int isDuplicated (StudentInfo student[], int arrNum, StudentInfo stu) {
		for (int i =0; i <arrNum ; i++) {
			if (student[i].equal(stu)) {
				return i;
				
			}
		}
		return -1; // -1로 리턴되면 중복 데이터 없음, 그 이외는 데이터가 있는걸로 간주
	}
	/* A
	 * void: 딱히... 줘야 할 정보는 수정이 되고 
	 * B
	 * StudentInfo student[] : 학생들 정보
	 * arrNum : 저장된 학생 수
	 * Scanner scan : 학생 정보를 입력 받기 위해서 필요
	 * 
	 * */
	public static void modifyStudent(StudentInfo student[], int arrNum, Scanner scan) {
		
		System.out.println("수정할 학생 정보를 입력하세요.");
		StudentInfo stu = searchInfo(scan);
		int pos =isDuplicated(student, arrNum, stu);
		if (pos == -1) {
			System.out.println("없는 학생 정보입니다.");
			return ;
		}
		System.out.println("이름 : ");
		String stuName = scan.next();
		stu.setName(stuName);
		System.out.println("------과목 수정--------");
		System.out.println("1. 수정");
		System.out.println("2. 삭제");
		System.out.println("3. 종료");
		System.out.println("번호를 선택해 주세요.");
		int selectNum = scan.nextInt();
		
		switch(selectNum) {
		
		case 1:
			Subject sList[] = student[pos].getScore();
			if (sList == null) {
				System.out.println("수정할 과목이 없습니다.");
				break;
			}
			System.out.print("과목 : ");
			String title1 = scan.next();
			
			int subPos = -1;
			for (int i = 0; i<sList.length; i++) {
				if(sList[i].getTitle().equals(title1)) {
					subPos = i;
					break;
				}
			}
			if(subPos == -1) {		
				System.out.println("등록되지 않은 과목입니다!");
				break;
			}
			System.out.print("중간고사 : ");
			int midterm = scan.nextInt();
			System.out.print("기말고사 : ");
			int finals = scan.nextInt();
			System.out.print("수행평가 : ");
			int performance = scan.nextInt();
			System.out.print("출석점수 : ");
			int attendance = scan.nextInt();
			sList[subPos].setMidterm(midterm);
			sList[subPos].setFinals(finals);
			sList[subPos].setPerformance(performance);
			sList[subPos].setAttendance(attendance);
			break;
			
		case 2:
			StudentInfo s = new StudentInfo();
			inputSubject(scan, s);
			student[pos].addScore(s.getScore());
			break;
		}
		
		
	}
	
}

