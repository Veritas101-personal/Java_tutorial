package studentManageProgram;

public class StudentInfo {
	
	private String name;
	private int grade;
	private int section;
	private String studentNum;
	private Subject score[];
	


	public StudentInfo(String name, int grade, int section, String i) {
		 AddStudent (name,  grade,  section,  i);
	}


	public StudentInfo() {
		
	}


	public boolean equal(int grade, int section, String studentNum, String name) {
		if(this.grade !=grade) return false;
		if(this.section !=section) return false;
		if(this.studentNum !=studentNum) return false;
		if(!this.name.equals(name)) return false;
		
		return true;
		
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getSection() {
		return section;
	}


	public void setSection(int section) {
		this.section = section;
	}


	public String getStudentNum() {
		return studentNum;
	}


	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	
	public void AddStudent (String name, int grade, int section, String studentNum) {
		
		this.name = name;
		this.grade = grade;
		this.section = section;
		this.studentNum = studentNum;
		
	
	}
	
	
	public static void BasicInfo () {
		
	}

	public void setScore(Subject...score) {
		this.score = new Subject[score.length];
		for(int i = 0 ; i < score.length;  i++) {
			this.score[i] = new Subject(score[i]);
		}
	}
	public void printScore() {
		for(Subject tmp : score) {
			tmp.print();
		}
	}
	
	public void printStuInfo() {
		System.out.println("이름: " + name);
		System.out.println("학년: " + grade);
		System.out.println("반: " + section);
		System.out.println("번호: " + studentNum);
	}
}
