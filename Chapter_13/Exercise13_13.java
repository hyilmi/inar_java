package chapter13;

public class Exercise13_13 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Course java101 = new Course("Introduction to Java Programming");
		
		java101.addStudent("Hilmi");
		java101.addStudent("Hamza");
		
		Course clone = (Course) java101.clone();
		
		System.out.println("Original students:");
		for (String string : java101.getStudents()) {
			if (string != null) {
				System.out.println(string);
			}
		}
		
		System.out.println("Clones:");
		for (String string : clone.getStudents()) {
			if (string != null) {
				System.out.println(string);
			}
		}
		
		

	}

}

class Course implements Cloneable{

	private String courseName = "";
	private String[] students = new String[10];
	private int numberOfStudents = 0;

	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Course clone = (Course)super.clone();
		clone.students = students.clone();
		return clone;
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
