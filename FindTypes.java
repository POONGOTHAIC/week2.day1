package week2day1;

public class FindTypes {
	public static void main(String[]args) {
		// Here is the input
		String str = "$$ Welcome to 2nd Class of Automation $$ ";
		// Here is what the count you need to find
		int letter = 0,space = 0,num = 0,specialchar = 0,i;
		//a) Convert the String to character array
		char[] strArr =str.toCharArray();
		//b) Traverse through each character (using loop)
		for(i=0;i<strArr.length-1;i++)
		{
			if(Character.isLetter(strArr[i]))
				{
				letter++;
				}
				else if(Character.isDigit(strArr[i]))
				{
				num++;
				}
			else if(Character.isSpaceChar(strArr[i]))
				{
				space++;
				}
				else {
				specialchar++;
				}
		}
		// Print the count
		System.out.println("letter :" + letter);
		System.out.println("space :" + space);
		System.out.println("number :" + num);
		System.out.println("special chara :" + specialchar);

		}
		
				
	}

