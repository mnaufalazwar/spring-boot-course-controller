package creatingmavenproject.model;

public class Student {

	private int studentNumber;
	private String name;
	
	public Student() {
		
	}
	
	public Student(int studentNumber, String name) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
	}
	
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStudentNumber() {
		return this.studentNumber;
	}
	
	public String getName() {
		return this.name;
	}
}
