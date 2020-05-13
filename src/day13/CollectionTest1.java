package day13;

import java.util.*;

public class CollectionTest1 {

	static ArrayList<Schedule> list = new ArrayList<Schedule>();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		asking(scan);
	}

	public static void asking (Scanner scan) {
	
		char decision='y';
		
		while (decision!='n' || decision!='N') {
			
			System.out.print("오늘의 할 일을 추가하시겠습니까? (y/n) : ");
			decision = scan.next().charAt(0);
			if (decision=='y' || decision=='Y') {
				
				receivingSchedule (scan);
				
			} 	else if (decision=='n' || decision=='N') {
				termination(list);
				break;
			} else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			
			}
		}
		
	}
	
	public static void receivingSchedule (Scanner scan) {
		System.out.print("오늘의 할 일을 입력해주세요. : ");
		String plan = scan.next();
		list.add(new Schedule(plan));
		
	}
	
	public static void termination (List<Schedule> list) {
		for (Schedule tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("시스템을 종료합니다.");
	}
	
}

class Schedule {
	
	int num = 0;
	
	String work;

	@Override
	public String toString() {
		
		
		
		return work;
		
	}

	public Schedule() {}
	public Schedule(String work) {this.work = work;}


	
	
	
	
	
}