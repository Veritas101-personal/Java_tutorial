package day11;

public class ObjectEx1 {

	public static void main(String[] args) {
		// a1에서 만든 객체를 a2가 같이 공유함
		A a1 = new A();
		// A클래스에 속한 a1이란 객체
		A a2 = a1;
		// a1 객체값을 복사한 a2
		System.out.println(a1.num + "," + a2.num);
		a1.num = 20;
		System.out.println(a1.num + "," + a2.num); 
		a2.num = 30;
		System.out.println(a1.num + "," + a2.num); // 즉 a1,a2를 담고 있던 num값이 바뀌면서 a1,a2 둘다 다른값이 같이 출력
		try {
			A a3 =(A)a1.clone();
			a3.num = 40;
			System.out.println(a1.num + "," + a3.num);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---------깊은 복사(clone) 예제-------------");
		B b1 = new B();
		b1.a = new A();
		b1.a.num = 10;
		B b2 = b1.clone();
		System.out.println(b1.a.num+","+b2.a.num);
		b2.a.num = 30;
		System.out.println(b1.a.num+","+b2.a.num);
		System.out.println("--------equals 예제-------------");
		A a4 = new A();
		A a5 = new A();
		System.out.println(a4.num+","+a5.num);
		System.out.println(a4.equals(a5));
		System.out.println("--------toString 예제-------------");
		C c = new C();
		System.out.println(c);
		
	}

}
class A implements Cloneable{
	int num;
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
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
		A other = (A) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}

class B implements Cloneable{
	A a;
	@Override
	public B clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(Exception e) {
			System.out.println("예외");
		}
		return (B)obj;
	}
}

/*
class B implements Cloneable{
	A a;
	@Override
	public B clone() {
		B  obj = null;
		try {
			obj = (B)super.clone();
		}catch(Exception e) {
			System.out.println("예외");
		}
		if (obj instanceof B) {
			obj.a = new A(((B)obj).a.num);
		}
		return (B)obj;
	}
}
*/
class C {
	int num1,num2,num3,num4,num5;

	@Override
	public String toString() {
		return "C [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5 + "]";
	}
	
	
	
}
//얕은 복사는 멤버변수가일반 변수일 때 문제없이 사용된느 경우
//멤버변수가 참조 변수인 경우 얕은 복사를 하면 해당 참조 변수를 공유하기 때문에 문제 발생할 수 있다.
// 이를 해결하기 위해 참조변수인 멤버변수를 단순히 복사하는 게 아니라 ㅐ로운 객체를 만들고 만들어진 객체에 값을 복사하여
// 공유하지 않도록 하는 것이 깊은 복사이다