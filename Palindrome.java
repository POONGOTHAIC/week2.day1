package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		String text = "madam";
		String reverse = "";
		int i;
		
		for(i=text.length()-1; i >= 0; i--) 
		
		reverse=reverse+text.charAt(i);
		
		//.equalsIgnoreCase
		
		if(text.equalsIgnoreCase(reverse)) 
		
			System.out.println(text + " is a palindrome ");  
		
		else 
			
			System.out.println(text + " is not a palindrome ");
		
			
	}
	

}
