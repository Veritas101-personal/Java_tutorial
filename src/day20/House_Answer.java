package day20;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class House_Answer {

	public static void main(String[] args) {
		
		List<CashBook> list = new ArrayList<CashBook>();
		Scanner scan = new Scanner(System.in);
		
		CashBook cashBook = inputCashBook(scan);
		registerCashBook(list,
				new CashBook(1, "2020-05-21", "식비", "점심", 5000));
	
		
		
	}

	/* 기능 : 주어진 가계부 내역(CashBook)을 가계부(list)에 저장하는 메소드
	 * 매개변수 : 가계부, 가계부 내역 = > List<CashBook> list, CashBook cashBook 
	 * 리턴타입 : boolean (왜? : 애초에 가계부 배열을 지정해주면 에러나는 경우는 사용자가 실수로 null값을 넣어 주는 경우밖에 없는데 
	 * 					이는 boolean으로 사전 예방 가능
	 * 메소드명 : registerCashBook */
	
	public static boolean  registerCashBook (List<CashBook> list, CashBook cashBook) {
		
		if(list == null || cashBook == null) {
			return false;
		}
		list.add(cashBook);
		list.sort(new Comparator<CashBook>() {
			@Override
			public int compare(CashBook o1, CashBook o2) {
				
				/*
				int year1 = Integer.parseInt(o1.getDate().substring(0,4));
				int year2 = Integer.parseInt(o2.getDate().substring(0,4));
				int momth1 = Integer.parseInt(o1.getDate().substring(5,7));
				int month2 = Integer.parseInt(o2.getDate().substring(5,7));
				int day1 = Integer.parseInt(o1.getDate().substring(8,10));
				int day2 = Integer.parseInt(o2.getDate().substring(8,10));
				*/
				
				String arr1[] = o1.getDate().split("-");
				String arr2[] = o2.getDate().split("-");
				for (int i = 0 ; i < arr1.length ; i++) {
					if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i]))
						return -1;
					else if (Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i]))
						return 1;
				}
				return 0;
			}
		});
		return true;
	}
	
	/* 기능 : 스캐너를 통해 가계부를 입력받아 가계부 내역을 반환하는 메소드
	 * 매개변수 : 스캐너 => Scanner scan
	 * 리턴타입 : 가계부 내역 => CashBook
	 * 메소드명 : inputCashBook 	*/
	
	public static CashBook inputCashBook(Scanner scan) {
		System.out.println("수입(0), 지출(1)");
		int income = scan.nextInt();
		
		Pattern p = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
		Matcher m;
		String date;
		
		do {
			System.out.print("날짜(예: 2020-05-22)");
			date = scan.next();
			m = p.matcher(date);
		}while(!m.matches());
		System.out.print("분류 : ");
		String type = scan.next();
		System.out.print("내용 : ");
		String content="";
		while((content=scan.nextLine()).trim().length() == 0);
		System.out.print("금액 : ");
		int money = scan.nextInt();
		CashBook cashBook = new CashBook(income,date,type,content,money);
		return cashBook;
		
	}
	
	/* 기능 : 가계부에서확인하려는 종류에 맞는 검색 결과를 리스트로 반환하는 메소드
	 *  매개변수 : 가계부, 종류, 검색어 => List<CashBook> list, int kindm String search
	 *  		kind = 1 : 일시 기준 분류
	 *  		kind = 2 : 수입/지출 기준 분류
	 *  		kind = 3 : type 기준 분류
	 *  리턴타입 : 검색된 가계부 => List<CashBook>
	 *  */
	
	public static List<CashBook> searchCashBook(List<CashBook>list, int kind, String search) {
		 List<CashBook> searchList = new ArrayList<CashBook>();
		 
		 switch(kind) {
		 
		 case 1:
		 	Pattern p = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
		 	Matcher m = p.matcher(search);
		 	if (!m.matches()) {
		 		return null;
		 	}
		 	for (CashBook tmp : list) {
		 		if(tmp.getDate().equals(search)) {
		 			searchList.add(tmp);
		 			
		 		}
		 		
		 	}
		 	return searchList;
		 	
		 case 2:
			 if(!search.contentEquals("수입") && !search.contentEquals("지출")) {
				 System.out.println("검색어는 '수입' 또는 '지출' 입니다.");
				 return null;
			 }
			 boolean isIncome = search.equals("수입");
			 for (CashBook tmp : list) {
		 			if(tmp.isIncome() == isIncome) {
		 				searchList.add(tmp);
		 			}
			 }
			 return searchList;
		 case 3:
			 for (CashBook tmp : list) {
		 			if(tmp.getType().contentEquals(search)) {
		 				searchList.add(tmp);
		 			}
			 }
			 return searchList;
		 }
		
		
		 return null;
	}
	
	/* 기능 : 가계부에서 수정할 위치를 알려주면 수정 항목으로 수정하는 메소드
	 * 리턴타입 : 
	 * 메소드명 : modifyCashBook
	 * 매개변수 : 가계부, 수정할 위치, 수정항목 => List<CashBook>List, int index, CashBook cashBook
	 * */
	
	public static boolean modifyCashBook(List<CashBook>list, int index, CashBook cashBook) {
		if(list == null || cashBook == null || list.size() <index) {
			return false;	
		}
		list.remove(index-1);
		registerCashBook(list,cashBook);
		return true;
	}
	
}

class CashBook {
	
	private String date;
	private String content;
	private boolean income;
	private int money;
	private String type;
	
	public CashBook () {}
	public CashBook(int income, String date, String type, String content,int money) {
		this.date = date;
		this.content = content;
		this.income = income== 0 ? true : false;
		this.money = money;
		this.type = type;
	}


	
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isIncome() {
		return income;
	}
	public void setIncome(boolean income) {
		this.income = income;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "CashBook [date=" + date + ", content=" + content + ", income=" + income + ", money=" + money + ", type="
				+ type + "]";
	}
	
	

}