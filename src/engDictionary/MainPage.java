package engDictionary;

import java.util.*;


public class MainPage {

	public static void main(String[] args) {
		
		ArrayList<Definition> meaning = new ArrayList<Definition>();
		HashMap <String, Definition> syntax = new HashMap<String, Definition>();
		HashMap <String, HashMap <String, Definition>> vocab = new HashMap <String,HashMap <String, Definition>>();
	
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		
		
		while (a!=5) {
			
			System.out.println("-----번호를 입력하세요------");
			System.out.println("1.영어 단어 등록");
			System.out.println("2.영어 단어 수정");
			System.out.println("3.영어 단어 삭제");
			System.out.println("4.영어 단어 검색");
			System.out.println("5.종료");
			System.out.println("-----------------------");
			
			a = scan.nextInt();
			System.out.println();
			
				if (a==1) {
					addVocab(vocab,syntax,meaning,scan);
				} else if (a==2) {
					modifyVocab(vocab,syntax,meaning,scan);
				} else if (a==3) {
					deleteVocab(vocab,syntax,meaning,scan);
				} else if (a==4) {
					searchVocab(vocab,syntax,meaning,scan);
				} else if (a==5) {
					System.out.println("프로그램 종료");
					break;
				} else {
					System.out.println("허용되지 않은 입력!");
					a = scan.nextInt();
				}
		}
		
	}
	


	public static void addVocab (HashMap <String, HashMap <String, Definition>> vocab, HashMap <String, Definition> syntax ,ArrayList<Definition> meaning,Scanner scan) {
		
		Definition var = new Definition();
		
		System.out.println("등록하실 단어를 입력하세요.");
		String word = scan.next();
	
		if(vocab.containsKey(word)) {
			
			System.out.println("이미 등록된 단어입니다.");
			System.out.println("단어의 품사,뜻을 추가하시겠습니까?");
			
			char choice = scan.next().charAt(0);
				if (choice=='Y' || choice=='y') {
					
					System.out.println("품사를 입력하세요.");
					String syntax1 = scan.next();
						if (syntax.containsKey(syntax1)) {
							scan.nextLine();
							System.out.println("뜻을 입력하세요.");
							var.setMeaning(scan.nextLine());
								if (meaning.contains(var)) {
									System.out.println("이미 존재하는 뜻입니다.");
								} else {
									meaning.add(var);
									
								}
						} else {
							
						}
						
					scan.nextLine();
					System.out.println("뜻을 입력하세요.");
					var.setMeaning(scan.nextLine());
						if (meaning.contains(var.getMeaning())) {
							
						}
					meaning.add(var);
					
					
				} else if (choice=='N' || choice=='n') {
					
				} else {
					System.out.println("허용되지 않은 입력!");
					choice = scan.next().charAt(0);
				}
				
		} else {
			
			
						
			System.out.print("품사를 입력하세요. : ");
			String syntax1 = scan.next();
			scan.nextLine();
			System.out.println("뜻을 입력하세요.");
			var.setMeaning(scan.nextLine());
			meaning.add(var);
		
			vocab.put(word,meaning);
			
				
			System.out.println("등록 완료.");
			
			
		}
		
		
		
	}
	
	public static void modifyVocab (HashMap <String, HashMap <String, Definition>> vocab,HashMap <String, Definition> syntax ,ArrayList<Definition> meaning,Scanner scan) {
		
		
	}
	
	public static void deleteVocab (HashMap <String, HashMap <String, Definition>> vocab,HashMap <String, Definition> syntax,ArrayList<Definition> meaning,Scanner scan) {
		
		
		Definition var = new Definition();
		
		System.out.println("삭제하실 단어를 입력하세요.");
		String word = scan.next();
		
		if(vocab.containsKey(word)) {
		
			System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
			
			char choice = scan.next().charAt(0);
				if (choice=='Y' || choice=='y') {
					vocab.remove(word);
					meaning.clear();
					
				} else if (choice=='N' || choice=='n') {
					
				} else {
					System.out.println("허용되지 않은 입력!");
					choice = scan.next().charAt(0);
				}
				
		} else {
			System.out.println("해당 단어는 등록되지 않았습니다.");
		}
	}
	
	public static void searchVocab (HashMap<String, HashMap<String, Definition>> vocab,HashMap <String, Definition> syntax,ArrayList<Definition> meaning,Scanner scan) {
		
		Definition var = new Definition();
		
		System.out.println("검색할 단어를 입력하세요.");
		String word = scan.next();
		
	
		if(vocab.containsKey(word)) {
			
			System.out.println(vocab.get(word));
			
		} else {
			System.out.println("해당 단어는 존재하지 않습니다.");
		}

		
	}
	
}

class Definition {
	
	String meaning;

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	@Override
	public String toString() {
		return "Definition [meaning=" + meaning + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meaning == null) ? 0 : meaning.hashCode());
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
		Definition other = (Definition) obj;
		if (meaning == null) {
			if (other.meaning != null)
				return false;
		} else if (!meaning.equals(other.meaning))
			return false;
		return true;
	}
	
	
	
	
}

