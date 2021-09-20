package week3.day1;

public class StringJustify {
	public static void main(String[] args) {
	String str3 = new String("Kutty");
	 String str4 = new String("Kutty");
	
	 if(str3==str4) {
		 System.out.println(" Same text");
	 }
	 else
		 System.out.println("Diff text");
	 
	 System.out.println("*****");
}
}

//Justification:
//Double equals operator actually compares objects references. 
//When using new keyword it gets stored in different reference.
//hence str3==str4 turns to be false.