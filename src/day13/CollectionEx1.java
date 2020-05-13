package day13;

import java.util.*;


public class CollectionEx1 {

	public static void main(String[] args) {
	
		ArrayList<Object> list = new ArrayList<Object>();  //<>는 어떠한 정보를 저장할 건지 지정. 이를 제네릭 클래스라고 함.
				// 생략할 수 도 있지만 저장할 수 있는 종류가 한정 될 수도 있어서 가급적이면 정의해서 쓸 것을 권장
		ArrayList<Num> list1 = new ArrayList<Num>(); // 여기선 Num클래스의 객체만 저장 가능한 list를 ArrayList로 생성한다는 의미
		list1.add(new Num());
		// ch클래스를 이용한 객체는 Num클래스를 이용한 객체가 아니므로 에러 발생 
		//list1.add(new ch());
		// 하지만 자식 클래스를 이용한 방법은 가능, 왜냐하면 자식 클래스가 부모클래스로 자동 형변환이 가능하기 때문에
		list1.add(new Num());
		list1.add(new Num(1));
		list1.add(new Num(100));
		printList(list1);
		list1.remove(new Num());
		System.out.println("num이 0인 객체를 지운 후");
		printList(list1);
		ArrayList<Num> list2 = new ArrayList<Num>(list1); // 앞선 생성자를 이용해서 리스트 생성
		System.out.println("복사생성자를 이용한 list2");
		printList(list2);
		list1.add(1,new Num(200));
		System.out.println("1번지에 200을 추가 후 list1");
		printList(list1);
		list2.clear();
		System.out.println("list2를 clear한 후 list2");
		printList(list2);
		list2.addAll(list1);
		System.out.println("list1를 list2에 추가 후 list2");
		printList(list2);
		System.out.println("향상된 for문을 이용하지 않은 반복문");
		for(int i=0; i<list1.size(); i++) {
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		System.out.println("Iterator를 이용한 출력문");
		Iterator<Num> it = list1.iterator();
		while(it.hasNext()) { // iterator의 탐색 방식이 계속해서 값이 있는지 확인하기 때문에 값이 없는게 확인되면 자동 종료
			System.out.print(it.next() + " ");
		}
		System.out.println();
		list1.ensureCapacity(100); // 최대로 저장할 수 있는 배열의 공간을 확보, 만약 넘어버리면 자동으로 저장공간을 더 확보하는 메소드
		List<Num> list3 = list1.subList(0,2);
		System.out.println("0번지에서 2번지 사이의 부분리스트(2번지 제외)");
		// 익명클래스는 주로 메소드에서 구현한 클래스가 필요한데
		// 해당 메소드는 기능이 하나뿐이여서 따로 정의하기 귀찮으 경우 익명클래스를 이용.
		printList(list3);
		list1.sort(new Comparator<Num>() {
			@Override
			public int compare(Num n0, Num n1) {
				if(n0.num > n1.num)
					return 1;
				if(n0.num < n1.num)
					return-1;
				return 0;
			}
		});
		System.out.println("정렬 후 list1");
		printList(list1);
	}

	private static void printList(List<Num> list1) {
		for(Num tmp : list1) {
			System.out.print(tmp+" ");
		}		
		System.out.println();
	}

}
class Num {
	int num;

	@Override
	public String toString() {
		return "[num=" + num + "]";
	}
	public Num() {}
	public Num(int num) {this.num = num;}
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
		Num other = (Num) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}
class Num1 extends Num {}
class Ch{
	char ch;

	@Override
	public String toString() {
		return "Ch [ch=" + ch + "]";
	}
	
	
	
}
// Collection Framework
/* Collection
 * - 하나의 데이터(객체)를 저장
 * 
 * List 
 * - 순서가 있음
 * - 데이터의 중복을 허용 (1,2,3,4,1,2,3을 입력하면 그대로 1,2,3,4,1,2,3을 저장)
 * - ArrayList, LinkedList, Stack, Vector...
 * 
 * Set
 * - 순서가 없음 (운이 좋으면 순서가 맞을 수 있다.)
 * - 데이터의 중복을 허용하지 않는다. (1,2,3,4,1,2,3을 입력하면 1,2,3,4만 저장되고 순서는 모름)
 * - 이때 중복을 equals()를 통해 중복을 체크한다. (모든 클래스는 object에서 상속 받기 때문에 이것이 가능)
 * - HashSet, TreeSet...
 * 
 * Map
 * - key(객체)와 value(객체) 두가지 값을 저장
 * - key는 중복불가(아이디)
 * - value는 중복 가능(비밀번호)
 * - HashMap, TreeMap...
 * 
 * Interface
 * - 상수와 추상메스드로만 구성된 것 (추상메소드는 어떠한 기능을 할지 추상적으로 정해둔 메소드)
 * - 추상메소드는 구현부ㅏ 없다
 * - 인터페이스를 이요해 구현 클래스를 행성
 * 
 * 팁!
 * 탐색, 검색을 주로 할 경우엔 ArrayList, 삽입 삭제가 주가 될 경우엔 LinkedList가 편하다.
 * 왜냐하면 배열을 기반으로 한 ArrayList는 삽입삭제를 하면 정보를 추가하거나 삭제할 경우 배열을 재정의해야하지만
 * LinkedList는 그냥 연결만 바꿔주면 끝남
 * 
 * */