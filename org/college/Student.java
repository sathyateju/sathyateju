package org.college;

public class Student extends Department {
public void studentName() {
	String Name1 = "Sathya";
System.out.println(Name1);
}
public void studentDept() {
	System.out.println("Department = ComputerScience");

}
public void studentId() {
	System.out.println("201020028");

}
public static void main(String[] args) {
	Student stu = new Student();
	stu.collegeName();
	stu.collegeCode();
	stu.collegeRank();
	stu.deptName();
	stu.studentName();
	stu.studentDept();
	stu.studentId();
}
}
