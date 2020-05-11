package day11;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		String str3 = new String("abc");
		String str4 = new String("abc");
		str3 = str3.intern();
		str4 = str4.intern();
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		char []arr = new char[] {'a', 'b', 'c'};
		String str5 = new String(arr);
		System.out.println(str5.charAt(1));
		String str6 = "abcdabcd";
		String str7 = str6.replace("abc", "def");
		System.out.println(str6);
		System.out.println(str7);
		String str8 = str6.replaceAll("abc", "def");
		System.out.println(str6);
		System.out.println(str8);
		String str9 = "200101-3111111";
		String reg[] = str9.split("-");
		for(String tmp : reg) {
			System.out.println(tmp);
		}
		String str10 = "사과,배,오렌지";
		reg = str10.split(",");
		for (String tmp :reg) {
			System.out.println(tmp);
		}
		System.out.println((str10.substring(1)));
		String str11 = String.join("-", reg);
		System.out.println(str11);
		/* str1, str2는 같은 abc라는 문자열 리터럴을 저장하기 때문에 같은 주소를 가짐
		 * (문자열 리터럴은 재사용하기 때문에!)
		 * str2에 abc를 저장하기 전에 리터럴을 저장하는 메모리에 abc가 있는지 확인하여 있으면 새로 만들지 않고 재사용
		 * 때문에 str1에서 사용된 abc를 str2에 재사용하기 때문에 두 변수의 주소는 같음
		 *
		 * str3, str4는 원래 같은 문자열만 가진 다른 주소값을 지니고 있기 때문에 false로 표시
		 * 하지만 intern 메소드를 사용하면 두 값이 같아서 먼저 저장한 문자열의 주소값을 돌려주기 때문에 이 다음엔 true로 변함.
		 * */
		
		/*
		 * replace와 replaceAll은 거의 비슷하지만 
		 * */
		
	}

}
