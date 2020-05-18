package day18;

import java.util.*;


public class ReviewTest3 {
	

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		
		while(i!=3) {
			
			System.out.println("------번호를 입력하세요-------");
			System.out.println("1.단어검색");
			System.out.println("2.검색기록열람");
			System.out.println("3.종료");
			System.out.println("-------------------------");
			i = scan.nextInt();
			
			if (i==1) {
				System.out.println();
				// 단어 받는 메소드 구현  예정
				System.out.println();
				
			} else if (i==2) {
				System.out.println();
				// 단어 검색 기록 구현 예정
				
				
			} else if (i==3) {
				System.out.println("프로그램 종료.");
				break;
				
			} else {
				System.out.println("잘못 입력했습니다. 다시 입력하세요.");
				i=scan.nextInt();
			}
		}
	}
	

	

	
	
}
class Word {
	
	String word; // 단어 검색
	
	ArrayList<String> words = new ArrayList<String>(); // 단어들
	ArrayList<String> definition = new ArrayList<String>(); // 단어 뜻들

	
	public Word() {}
	public Word(String word) {this.word=word;}
	
	@Override
	public String toString() {
		return "Word [word=" + word + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
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
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
}

class Dictionary {
	
	List<Word> dictionary = new ArrayList<Word>();
	// 단어추가
	// 단어 수정 => 품사수정이나 뜻 수정
	// 단어 삭제
	// 사전 출력 => 한 단어의 정보를 출력이나 특정단어가 들어간 단어들을 출력
	
}




/* 단어 클래스
 * - 단어, 품사, 뜻을 저장하는 클래스
 * 
 * */
 