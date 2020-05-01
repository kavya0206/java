package org.acc.test.college;

public class Student extends Hostel {
	public void studentName() {
		System.out.println("Student Name: XXX");
	}

	public void studentDept() {
		System.out.println("Student Dept: CSE");
	}

	public void studentId() {
		System.out.println("Student ID: 2018503051");
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.hostelName();
	}
}
