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
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("번호를 입력하세요.");
		System.out.println("1.학생정보입력");
		System.out.println("2.학생정보수정");
		System.out.println("3.학생정보삭제");
		System.out.println("4.학생정보출력");
		System.out.println("5.프로그램종료");
		int a = scan.nextInt();
		
			if (a==1) {
				
			} else if (a==2) {
				
			} else if (a==3) {
				
			} else if (a==4) {
				
			} else if (a==5) {
				
				
			} else {
				
			}
		
		
		StudentInfo s = new StudentInfo();
		s.setScore(new Subject("국어",40,40,10,10));
		s.printScore();
		
		
		
	}
	
	

}
