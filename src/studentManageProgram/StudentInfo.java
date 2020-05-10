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
		if(!this.studentNum.equals(studentNum)) return false;
		if(!this.name.equals(name)) return false;
		
		return true;
		
	}
	
	public boolean equal(StudentInfo stu) {
		if(this.grade !=stu.grade) return false;
		if(this.section !=stu.section) return false;
		if(!this.studentNum.equals(stu.studentNum)) return false;
		
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
	
	
	public Subject[] getScore() {
		return score;
	}


	public void setScore(Subject...score) {
		this.score = new Subject[score.length];
		for(int i = 0 ; i < score.length;  i++) {
			this.score[i] = new Subject(score[i]);
		}
	}
	public void printScore() {
		if(score == null) return; // 만약 과목 정보를 입력하지 안았을 경우 그냥 메소드 종료 및 에러 방지
		for(Subject tmp : score) {
			tmp.print();
		}
	}


	public void addScore(Subject[] addscore) {
		int aSize = 0, bSize= 0; // a사이즈는 원래 입력한 과목수. b는 새로 입력할 값들
		if(score !=null) {aSize = score.length;}
		if(addscore !=null) {bSize = addscore.length;}
		
		Subject []tmp = new Subject[aSize + bSize];
		for(int i=0; i < aSize ;i++) {
			tmp[i] = score[i];
		}
		for (int j = 0; j < bSize; j++) {
			tmp[score.length+j] = addscore[j];
		}
		score = tmp;
	}
	
	
}
