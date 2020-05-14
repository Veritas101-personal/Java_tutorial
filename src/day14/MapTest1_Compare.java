package day14;

import java.util.*;

public class MapTest1_Compare {

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Map 인터페이스를 이용하여 객체를 만들 수는 없지만 (new를 통해서)
		 * Map 인터페이스를 구현한 HashMap을 이용하여 객체를 만들어서
		 * Map 인터페이스의 객체에 저장할 수 있다. 
		 * 
		 * 부가설명: 인터페이스 자체로는 불가능 하지만 hashmap은 클래스 속성이기 때문에 오버라이딩하는 과정을 통해 구현 가능!
		 * */
		Map<String,String> map = new HashMap<String,String>();
		
		int menu = 3;
		do {
			printMenu();
			menu = scan.nextInt();
			switch (menu) {
			
			case 1: 
				
				inputInfo(scan,map);
				
				break;
				
			case 2:	
				
				searchInfo(scan,map);
				
				break;
			case 3: 
				
				modifyPasswords(scan,map);
				
				break;
			case 4: System.out.println("종료합니다."); break;
			default: System.out.println("잘못된 메뉴입니다.");
			}
			
		} while(menu != 4);

	}
	
	public static void printMenu () {
		System.out.println("===메뉴====");
		System.out.println("1.등록");
		System.out.println("2.검색");
		System.out.println("3.비밀번호변경");
		System.out.println("4.종료");
		System.out.println("==========");
		System.out.print("메뉴를 선택하세요 : ");
		
	}
	
	public static void inputInfo(Scanner scan, Map<String,String> map) {
		/* 스캐너를 이용하여 id와 pw를 입력받아 map에 저장하는 메소드
		* 매개변수: 스캐너, map => 
		* 리턴타입: 읎음 => 값을 주거나 변화시키는거 없이 그냥 결과 그대로출력하면 끝이라서 =>void
		*/
		
		System.out.print("ID : ");
		String iD = scan.next();
		System.out.print("PW : ");
		String pw = scan.next();
		map.put(iD, pw);
		
	}
	
	public static void searchInfo (Scanner scan, Map<String,String> map) {
		System.out.print("ID : ");
		String iD = scan.next();
		String pw= map.get(iD);
		
		if (pw==null) {
			System.out.println(iD+"는 없는 아이디입니다.");
		} else {
			System.out.println(iD+"의 비밀번호는 "+pw+" 입니다.");
		}
		
		// 스캐너를 이용하여 id를 입력받아 map에 해당 id와 일치하는 id있는지 확인 / 있으면 id와 비밀번호를, 없으면 없다고 출력
		
	}
	
	public static void modifyPasswords (Scanner scan, Map<String,String> map) {
		
		
		
		System.out.print("ID : ");
		String iD = scan.next();
		System.out.print("pw확인 : ");
		
		while (true) {
			String pwCheck = scan.next();
			String pw= map.get(iD);
		
			if (pw==null) {
				System.out.println(iD+"는 없는 아이디입니다.");
				break;
			
			} else if (!(pwCheck.equals(map.get(iD)))) {
				System.out.println("비밀번호가 틀립니다. 다시 입력하세요.");
		
			} else {
				System.out.print("새로운 비밀번호를 입력하세요 : ");
				String pwChange = scan.next();
				map.replace(iD,pwChange);
				break;
			}
		}
	
	}
	
}
