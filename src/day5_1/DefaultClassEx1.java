package day5_1;
/* 클래스에 조건제한자 public 퍼블릭이 붙는 조건 
 * - 파일명과 클래스 이름이 같은 경우에만 public 사용
 */

public class DefaultClassEx1 {

	public static void main(String[] args) {
		System.out.println("접근제한자 : public");

	}

}
/* DefaultClassEx2 클래스는 접근제한자가 default이므로 같은 패키지나 같은 클래스 호출 가능
 * 다른 패키지에선 불가
 */
class DefaultClassEx2 {

	public static void main(String[] args) {
		System.out.println("접근제한자 : default");

	}

}