package chapter11;

public class Exercise11_02 {

	public static void main(String[] args) {
		Person p = new Person("Hilmi", "Eenmeilaan 156", "123321123", "hy@gmail.com");
		Student s = new Student("Akif", "eenmeilaan 156", "12321231231", "auc@gmail.com", 1);

		System.out.println(p.toString());
		System.out.println(s.toString());

	}

	static class Person {
		private String name;
		private String adress;
		private String phoneNumber;
		private String email;

		public Person() {

		}

		public Person(String name, String adress, String phoneNumber, String email) {
			this.name = name;
			this.adress = adress;
			this.phoneNumber = phoneNumber;
			this.email = email;

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAdress() {
			return adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String toString() {
			return "Name: " + name + "\nAdress: " + adress + "\nPhone number: " + phoneNumber + "\nEmail: " + email;
		}

	}

	static class Student extends Person {
		private int classStatus; // 1-4 freshman-senior

		Student() {
			super();
		}

		Student(String name, String adress, String phoneNumber, String email, int classStatus) {
			super(name, adress, phoneNumber, email);
			this.classStatus = classStatus;
		}

		public String getClassStatus() {
			switch (classStatus) {
			case 1:
				return "freshman";
			case 2:
				return "sophomore";
			case 3:
				return "junior";
			case 4:
				return "senior";
			default:
				return "dunno fam";
			}
		}

		public void setClassStatus(int classStatus) {
			this.classStatus = classStatus;
		}

	}

	static class Employee extends Person {
		private String office;
		private double salary;
		private java.util.Date dateHired;

		public Employee() {
			super();
		}

		public Employee(String name, String adress, String phoneNumber, String email, String office, double salary) {
			super(name, adress, phoneNumber, email);
			this.office = office;
			this.salary = salary;
			this.dateHired = new java.util.Date();

		}

		public String getOffice() {
			return office;
		}

		public void setOffice(String office) {
			this.office = office;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public java.util.Date getDateHired() {
			return dateHired;
		}

		public void setDateHired(java.util.Date dateHired) {
			this.dateHired = dateHired;
		}

		public String toString() {
			return super.toString() + "\nOffice: " + office + "\nDate hired: " + dateHired;
		}
	}

	static class Faculty extends Employee {
		private String officeHours;
		private String rank;

		public Faculty() {
			super();
		}

		public Faculty(String name, String adress, String phoneNumber, String email, String office, double salary,
				String officeHours, String rank) {
			super(name, adress, phoneNumber, email, office, salary);
			this.officeHours = officeHours;
			this.rank = rank;
		}

		public String getOfficeHours() {
			return officeHours;
		}

		public void setOfficeHours(String officeHours) {
			this.officeHours = officeHours;
		}

		public String getRank() {
			return rank;
		}

		public void setRank(String rank) {
			this.rank = rank;
		}

		public String toString() {
			return super.toString() + "\nOffice hours: " + officeHours + "\nRank: ";
		}

	}

	static class Staff extends Employee {
		private String title;

		public Staff(String name, String adress, String phoneNumber, String email, String office, double salary,
				String title) {
			super(name, adress, phoneNumber, email, office, salary);
			this.title = title;
		}

	}
}
