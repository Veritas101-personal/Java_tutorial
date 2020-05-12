package day12;

import java.util.Objects;

public class ObjectsEx1 {

	public static void main(String[] args) {
		String str=null;
		System.out.println("객체 str은 null입니까? " +Objects.isNull(str));
		System.out.println("객체 str은 null이 아닙니까? " +!Objects.isNull(str));
		System.out.println("객체 str은 null이 아닙니까? " +Objects.nonNull(str));
		String str2 = "";
		//System.out.println(str.equals(str2)); // str의 값이 없는데 (null) 그걸 기준으로 str2과 비교하려 해서 예외발생
		System.out.println(Objects.equals(str,str2)); 

	}

}
