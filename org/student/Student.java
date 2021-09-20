package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName(String name) {
		System.out.println("Student Name: " +name);}
public void studentDept(String dept) {
	System.out.println("Student Department: " +dept);
}
public void studentId(long id) {
	System.out.println("Student id: " +id);
}


public static void main(String[] args) {
	Student obj1=new Student();
	obj1.collegeName("Anna University Chennai");
	obj1.collegeCode(1100100);
	obj1.collegeRank(3);
	obj1.deptName("Computer Science Engineering");
	obj1.studentName("Flossy Margret");
	obj1.studentDept("Civil Engineering");
	obj1.studentId(356985426);
}
}
//Package   :org.college
//Class     :College
//Methods   :collegeName(),collegeCode(),collegeRank()
//
//Package   :org.department
//Class        :Department
//Methods   :deptName()
//
//Package   :org.student
//Class        :Student
//Methods   :studentName(),studentDept(),studentId()
//
//Description:
//create above 3 class and call all your class methods into the Student using multilevel inheritance.
