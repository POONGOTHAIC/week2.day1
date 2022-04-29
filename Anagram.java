package week2.day1.assignment;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		//length of the strings are same
		int i = text1.length();
		int j = text2.length();
		System.out.println(i == j);
		//Convert both Strings in to characters
		char[] text1arr = text1.toCharArray();
		char[] text2arr = text2.toCharArray();
		//Sort arryas
		Arrays.sort(text1arr);
		Arrays.sort(text2arr);
		String sortedText1 = new String(text1arr);
		String sortedText2 = new String(text2arr);
		System.out.println(sortedText1);
		System.out.println(sortedText2);
		
		//both the arrays has equal value
		 if(sortedText1.equals(sortedText2))
			 System.out.println(" string is equal ");
		 else
			 System.out.println(" string is not equal ");
	}

}
