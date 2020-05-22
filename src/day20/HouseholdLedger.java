package day20;

import java.util.*;

public class HouseholdLedger {

	public static void main(String[] args) {
		
		List<DataBase> list = new ArrayList<DataBase>();
		Scanner scan = new Scanner(System.in);
		DataBase date = null;
		
		int i = 0;
		
		while (i!=5) {
			printMenu();
			i = scan.nextInt();
			if (i==1) {
				date = inputDate(list,scan);
				System.out.println(date);
			} else if (i==2) {
				
			} else if (i==3) {
				
			} else if (i==4) {
				
			} else if (i==5) {
				
			} else {
				
			}
		
		}

	}

	public static DataBase inputDate (List<DataBase> list,Scanner scan) {
		
		DataBase input = new DataBase(); 
		
		System.out.print("날짜를 입력하세요. :");
		String date = scan.next();
			if (input.date.contains(date)) {
				scan.nextLine();
				System.out.println("이미 추가된 날짜입니다.");
				System.out.println("수입 또는 지출을 추가하시겠습니까? (y/n)");
				
				while (true) {
					char y = scan.next().charAt(0);
					if (y=='y' || y=='Y') {
						input.date.add(date);
						inputHistory(input,scan);
						break;
					} else if (y=='n' || y=='N'){
						return null;
					} else {
						System.out.println("허용되지 않은 입력!");
					}
				}
			} else {
				input.date.add(date);
				scan.nextLine();
				input = inputHistory(input,scan);
				return input;
			}
		
		return null;
		
	}
	
	public static DataBase inputHistory (DataBase input,Scanner scan) {
	
		System.out.println("수입 또는 지출 내역을 입력하세요.");
		input.history = scan.nextLine();
		System.out.print("수입은 a / 지출은 b를 입력하세요. : ");
		
		while(true) {
			char a = scan.next().charAt(0);
				if (a=='a') {
					System.out.println("금액을 입력하세요.");
					input.income.add(scan.nextInt());
					return input;
				} else if (a=='b') {
					System.out.println("금액을 입력하세요.");
					input.spend.add(scan.nextInt());
					return input;
				} else {
					System.out.println("허용되지 않은 입력!");
				}
		}
	}

	public static void printMenu () {
		
		System.out.println("-----번호를 입력하세요------");
		System.out.println("1.내역 입력");
		System.out.println("2.내역 수정");
		System.out.println("3.내역 삭제");
		System.out.println("4.내역 검색");
		System.out.println("5.종료");
		System.out.println("-----------------------");
	}
	
	
}


class DataBase {
	
	
	String history;
	List <String> date = new ArrayList<String>();
	List <Integer> income = new ArrayList<Integer>();
	List <Integer> spend = new ArrayList<Integer>();
	
	public DataBase () {} b
	public DataBase(String history, List<String> date, List<Integer> income, List<Integer> spend) {
		super();
		this.history = history;
		this.date = date;
		this.income = income;
		this.spend = spend;
	}




	@Override
	public String toString() {
		return "날짜 : " + date + ", 내역 : " + history + ", 수입 : " + income + ", 지출 : " + spend;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataBase other = (DataBase) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}
	
	
}