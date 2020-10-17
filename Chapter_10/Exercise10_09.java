package chapter10;


public class Exercise10_09 {

	public static void main(String[] args) {

	}

}

class Course {

	private String courseName = "";
	private String[] students = new String[10];
	private int numberOfStudents = 0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void addStudent(String student) {
		if (numberOfStudents == students.length) {
			String[] temp = new String[students.length + 1];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = students[i];
			}
			
			this.students = temp;
		}
		
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				students[i] = null;
				break;
			}
		}
		String[] temp = new String[students.length - 1];
		for (int i = 0; i < students.length; i++) {
			if (!students[i].equals(null)) {
				temp[i] = students[i];
			}
		}
		
		this.students = temp;
		numberOfStudents--;
		
	}
	
	public void clear() {
		students = new String[10];
		numberOfStudents = 0;
	}
	
	public String[] getStudents() {
		return this.students;
	}
	
	public int getNumberOfStudents() {
		return this.numberOfStudents;
	}
}
