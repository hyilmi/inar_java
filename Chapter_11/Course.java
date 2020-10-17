package chapter11;

import java.util.ArrayList;

class Course {

	private String courseName = "";
	private ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents = students.size();
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void addStudent(String student) {
		students.add(student);
	}
	
	public void dropStudent(String student) {
		students.remove(student);
	}
	
	public ArrayList<String> getStudents() {
		return this.students;
	}
	
	public int getNumberOfStudents() {
		return this.numberOfStudents;
	}
}
