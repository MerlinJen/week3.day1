package org.system;

public class Desktop extends Computer{
	public int desktopSize(int inch,int length, int breadth) {
		System.out.println("In inches: " +inch);
		System.out.println("Resolution: " +length+ "x" +breadth);
		return 0;
		
	}

public static void main(String[] args) {
	Computer obj1=new Computer();
	obj1.computerModel("Dell", 35000, 1500.98);
	Desktop obj2=new Desktop();
	obj2.desktopSize(19, 1920, 1080);
}}