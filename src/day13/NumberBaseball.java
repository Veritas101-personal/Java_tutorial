package day13;

import java.util.*;

public class NumberBaseball {

	public static void main(String[] args) {

		HashSet<Integer> ball = new HashSet<Integer>();
		int pitching = 3;
		int min = 1, max = 9;
			while(ball.size() < pitching) {
				int randomize = new Random().nextInt(max-min) + min;
				System.out.print(randomize + " ");
				ball.add(randomize);
			}
			System.out.println();
			for (Integer tmp : ball) {
				System.out.print(tmp +" ");
			}
			
	}
}
class Pitcher {
	
	int num;
	public Pitcher() {}
	public Pitcher (int num) {this.num = num;}

	@Override
	public String toString() {
		return "Pitcher [num=" + num + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
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
		Pitcher other = (Pitcher) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}