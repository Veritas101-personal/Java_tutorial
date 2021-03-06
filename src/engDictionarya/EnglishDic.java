package engDictionarya;

import java.util.*;

public class EnglishDic {

	public static void main(String[] args) {
		List<Word> list = new ArrayList<Word>();
		Scanner scan = new Scanner(System.in);
		Word word = null;
		char menu = '1';
		do {
			printMenu();
			menu = scan.next().charAt(0);
			switch(menu) {
			case '1':
				System.out.println("====================");
				System.out.println("추가할 단어, 품사와 의미를 입력하세요.");
				word = inputAllWord(scan);
				System.out.println("====================");
				if (insertWord(list, word)) {
					System.out.println("단어를 추가했습니다.");
				} else {
					System.out.println("단어를 추가하지 못했습니다.");
				}
				System.out.println("====================");
				break;
			case '2':
				System.out.println("====================");
				System.out.println("수정할 단어, 품사와 의미를 입력하세요.");
				word = inputAllWord(scan);
				System.out.println("====================");
				if (modifyWord(list, word)) {
					System.out.println("단어를 수정했습니다.");
				} else {
					System.out.println("단어를 수정하지 못했습니다.");
				}
				System.out.println("====================");
				break;
			case '3':
				System.out.println("====================");
				System.out.println("삭제할 단어, 품사와 의미를 입력하세요.");
				word = inputAllWord(scan);
				System.out.println("====================");
				if (deleteWord(list, word)) {
					System.out.println("단어를 삭제했습니다.");
				} else {
					System.out.println("단어를 삭제하지 못했습니다.");
				}
				System.out.println("====================");
				break;
			case '4':
				System.out.println("====================");
				System.out.println("검색할 단어, 품사와 의미를 입력하세요.");
				word = inputAllWord(scan);
				System.out.println("====================");
				Word tmp = searchWord(list, word);
				if (tmp!=null) {
					System.out.println(word);
				} else {
					System.out.println("단어장에 " +word.word+"를(을) 찾지 못했습니다.");
				}
				System.out.println("====================");
				break;
			case '5':
				System.out.println("프로그램 종료");
				break;
			default:
				
			}
		} while(menu!=5);
		scan.close();
		
	
	}

	/* 기능: 단어장(리스트)에 단어를 추가하는 메소드로 단어장에 추가하면 true, 그렇지 않으면 false;
	 * 매개변수: List<Word> list, Word Word
	 * 리턴타입: boolean
	 * 메소드명: insertWord 
	 * */
	public static boolean insertWord (List<Word> list, Word word) {
		
		
		if(list == null || word== null || list.contains(word)) {
			return false;
		}
		list.add(word);
		return true;
	}
	
	/* 기능 : 단어, 품사, 뜻을 입력받아 단어를 만들어 변환하는 메소드
	 * 매개변수: Scanner scan, 
	 * 리턴타입: 단어 = Word
	 * 메소드명: inputAllWord
	 * */
	
	public static Word inputAllWord(Scanner scan) {
		
		Word word = new Word();
		
		char menu = 'y';
		String tmp = "";
		System.out.println("단어 : ");
		word.word = scan.next();
		
		do {
			System.out.println("품사 : ");
			
			while( (tmp = scan.nextLine()).trim().length()==0);
			word.wordClass.add(tmp);
			System.out.println("뜻 : ");
			while( (tmp = scan.nextLine()).trim().length()==0);
			word.meaning.add(tmp);
			System.out.println("품사와 의미를 더 입력하시겠습니까?(y/n) : ");
			menu = scan.next().charAt(0);
		} while(menu=='y' || menu=='Y');
		
		return word;
	}
	
	/* 기능: 단어장에 해당 단어가 있으면 검색해서 단어를 반환하고 없으면 null을 반환하는 메소드
	 * 매개변수 : 단어장, 검색단어 => List<Word> list, Word word
	 * 리턴타입 : 검색된 단어 = > Word
	 * 메소드명 : searchWord*/
	
	public static Word searchWord(List<Word> list, Word word) {
		if(list == null || word== null) {
			return null;
		}
		
		// 향상된 for문으로 list에 있는 단어들을 하나씩 가져와서 tmp에 연결
		for(Word tmp : list) {
			//단어장에서 꺼내온 단어 tmp와 검색 단어 word를 비교하여 같으면 단어장에서 꺼내온 단어를 반환 
			if(tmp.equals(word)) {
				return tmp;
			}
		}
		//단어장을 다 확인했는데 없으면 null 반환
		return null;
	}
	
	/* 기능 : 스캐너를 통해 검색어를 입력하여 검색어를 단어로 변환하여 반환하는 메소드
	 * 매개변수 : 스캐너 => Scanner
	 * 리턴타입 : 검색어로 만들어진 단어 => Word
	 * 메소드명 : inputSearchWord
	 * */
	
	public static Word inputSearchWord(Scanner scan) {
		
		System.out.print("단어 : ");
		return new Word(scan.next(),null,null);
	}
	
	/* 기능 : 단어장에 삭제하려는 단어가 있으면 삭제하고 true로 변환, 없으면 false를 반환하는 메소드
	 * 매개변수 : list,삭제하려는 단어 => List<Word> list, Word word
	 * 리턴타입 : boolean
	 * 메소드명 : deleteWord */
	
	public static boolean deleteWord (List<Word> list, Word word) {
		if(list == null || word== null) {
			return false;
		} else {
			return list.remove(word);
		}
	}
	
	public static boolean modifyWord(List<Word> list, Word word) {
		if(list == null || word== null || list.contains(word)){
			return false;
		} else {
			list.remove(word);
			
			list.add(word);
		}
		
		return true;
	}
	
	public static void printMenu() {
		
		System.out.println("-----번호를 입력하세요------");
		System.out.println("1.영어 단어 등록");
		System.out.println("2.영어 단어 수정");
		System.out.println("3.영어 단어 삭제");
		System.out.println("4.영어 단어 검색");
		System.out.println("5.종료");
		System.out.println("-----------------------");
		
	}
	
}
class Word {
	
	String word;
	List<String> meaning = new ArrayList<String>();
	List<String> wordClass = new ArrayList<String>();

	
	@Override // 단어를 기준으로 같은 단어를 입력하면 중복처리
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
	
	@Override
	public String toString() {
		String str = "단어 : " + word + "\n";
		for(int i = 0; i< meaning.size(); i++) {
			str += (i+1)+". "+wordClass.get(i)+" "+meaning.get(i)+"\n";
		}
		return str;
	}
	public Word() {}
	public Word(String word, List<String> meaning, List<String> wordClass) {
		super();
		this.word = word;
		this.meaning = meaning;
		this.wordClass = wordClass;
	}
	
	
	
}