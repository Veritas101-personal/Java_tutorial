package day14;

import java.util.*;

public class MapTest1 {

	public static void main(String[] args) {
		/* id와 pw를 등록하고 id를 이용하여 pw를 검색하는 코드를 작성하세요.
		 * 
		 * 1. 등록
		 * 2. 검색
		 * 3. 종료
		 * 메뉴를 선택하세요 1
		 * id: abcde
		 * pw: 1234
		 * 
		 * 메뉴
		 * 1. 등록
		 * 2. 검색
		 * 3. 종료
		 * 메뉴를 선택하세요 2
		 * id: abcde
		 * abcde의 pw는 1234입니다.
		 * 
		 * 
		 * */

		Scanner scan = new Scanner(System.in);
		
		HashMap<String,String> dB = new HashMap<String,String>();
		

		
		int num = 0;
		while(num !=4) {
			System.out.println("메뉴");
			System.out.println("1.등록");
			System.out.println("2.검색");
			System.out.println("3.비밀번호변경");
			System.out.println("4.종료");
			System.out.print("메뉴를 선택하세요 : ");
			num = scan.nextInt();
			
			if (num==1) {
				System.out.print("id : ");
				String iD = scan.next();
				System.out.print("pw : ");
				String password = scan.next();
				dB.put(iD,password);
				
				
			} else if (num==2) {
				Set set = dB.entrySet();
				Iterator it = set.iterator();
				System.out.print("id : ");
				String iD = scan.next();
				
				if(!(dB.containsKey(iD))) {
					System.out.println("입력하신 id는 존재하지 않습니다.");
				} else {
					System.out.println(iD+"의 pw는 "+dB.get(iD)+"입니다.");
				}
			
			} else if (num==3) {
				System.out.print("id : ");
				String iD = scan.next();
				System.out.print("pw확인 : ");
				
				while (true) {
					String pwCheck = scan.next();
					String pw= dB.get(iD);
				
					if (pw==null) {
						System.out.println(iD+"는 없는 아이디입니다.");
						break;
					
					} else if (!(pwCheck.equals(dB.get(iD)))) {
						System.out.println("비밀번호가 틀립니다. 다시 입력하세요.");
				
					} else {
						System.out.print("새로운 비밀번호를 입력하세요 : ");
						String pwChange = scan.next();
						dB.replace(iD,pwChange);
						break;
					}
				}
			} else {
				System.out.println("종료합니다.");
			}
			
		}
		
	
		
		
		
		
	}

}
