package week3.day1;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I am working with Java8 ";
		System.out.println(sentence);
		System.out.println(sentence.replace('8', '1'));
		String substring = sentence.substring(0,sentence.length()-1)+1;
		System.out.println(substring);
		System.out.println(substring.replace('8', '1'));
		for (int i = 5; i < 15; i++) {
			System.out.print(sentence.charAt(i));
		}

	}
}

//Write a Java program to replace a specified character with another character and add # to the given string.
//
//String sentence = "I am working with Java8"
//replace 8 to 11 
//Print the characters from 5 to 14