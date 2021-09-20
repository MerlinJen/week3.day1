package week3.day1;

public class GetAtStringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Java Exercise";
		System.out.println(text.charAt(8));
		System.out.println(text.indexOf('E'));
		System.out.println((text.indexOf('s')));
		char[] txt=text.toCharArray();
		int length=txt.length;
		System.out.println("The character at the index 8 is:");
		for (int i = 0; i < length; i++) {
			if(i==8)
			System.out.println(txt[i]);}
		System.out.println("Index of 'E' and 's' are: ");
		for (int i = 0; i < length; i++) {
			if(txt[i]=='E'||txt[i]=='s') {
				System.out.println(i);
			}
		}
		
		}
}

//1. Write a Java program to get the character at the given index within the String. 
//String text = Java Exercise 
//  Index for character E and s     