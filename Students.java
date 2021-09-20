package week3.day1;

public class Students {
	public void getStudentInfo(int a) {
		System.out.println("College Id: "+a);
	}
	public void getStudentInfo(int b,String c) {
		System.out.println("Student Id1: "+b);
		System.out.println("Name1: "+c);
	}
	public void getStudentInfo(String d,long n) {
		System.out.println("Email: "+d);
		System.out.println("Phone Number: "+n);
	}


public static void main(String[] args) {
	Students j=new Students();
	j.getStudentInfo(812013);
	j.getStudentInfo(215, "Luke Jerome");
	j.getStudentInfo("lukejerome257@gmail.com", 9845361522L);
}}

//Class: Students
//Methods: getStudentInfo()
//
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber