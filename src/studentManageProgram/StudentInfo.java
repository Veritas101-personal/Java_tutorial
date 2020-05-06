package studentManageProgram;

class StudentInfo {
	
	private String name;
	private int grade;
	private int section;
	private int studentNum;
	private Subject score[];
	
	
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


	public int getStudentNum() {
		return studentNum;
	}


	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}


	public boolean equal(int grade, int section, int studentNum, String name) {
		if(this.grade !=grade) return false;
		if(this.section !=section) return false;
		if(this.studentNum !=studentNum) return false;
		if(!this.name.equals(name)) return false;
		
		return true;
		
	}
	
	
	public void AddStudent (String name, int grade, int section, int studentNum) {
		
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
}
