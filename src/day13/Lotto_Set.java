package day13;

import java.util.*;

public class Lotto_Set {


	static int limits = 6;
	static int min = 1, max = 45;
	static HashSet<Integer> lotto = new HashSet<Integer>();
	static HashSet<Purchase> input = new HashSet<Purchase>();
	
	public static void lottoNum () {
		
		int bonusRandom = 0;
		while(lotto.size() < limits) {
			int random = new Random().nextInt(max-min)+1;
					
			lotto.add(random);
		}
		
		for(Integer tmp : lotto) {
			System.out.print(tmp + " ");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		

		Scanner scan = new Scanner (System.in);
		
		System.out.println("입력하실 6개의 수를 입력하세요 (1-45) 중복으로 입력하신 수는 자동으로 제외됩니다.");
		System.out.println();
		
			while(input.size() < limits) {
				int inputNum = scan.nextInt();
				if (inputNum > 45 || inputNum < 1) {
					System.out.println("범위 값을 초과 혹은 미달한 수를 입력했습니다. 다시 입력해주십시오.");
				} else {
					input.add(new Purchase (inputNum));
				}
			}
			for (Purchase tmp : input) {
				System.out.print(tmp);
			}
			
			System.out.println("--------로또 추첨 결과 ----------");
			lottoNum();
	}
	
	public static void result() {
		lottoNum();
	
	}
	
	static boolean contains (int []arr, int inputNum) {
		for(int tmp: arr) {
			if(tmp==inputNum) {
				return true;
			}
		}
		return false;
	}
	
}
class Purchase {
	
	int inputNum;

	public Purchase() {}
	public Purchase(int inputNum) {this.inputNum = inputNum;}
	
	@Override
	public String toString() {
		return inputNum + " ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + inputNum;
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
		Purchase other = (Purchase) obj;
		if (inputNum != other.inputNum)
			return false;
		return true;
	}
	
	
	
}