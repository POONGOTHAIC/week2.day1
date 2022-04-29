package week2day1;

public class ReverseEvenWords {
	public static void main(String[]args) {
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		String test = "I am a software tester";
		//split the words and have it in an array
  		String[] splitArr=test.split(" ");
			String c=" ";
			String e=" ";
         for(int i=0;i<splitArr.length;i++)
  		{
  			if((i+1)%2==0)
  			{
  		//split the words and have it in an array
  			String ch=splitArr[i];
  			char[] array=ch.toCharArray();
  			for(int j=array.length-1;j>=0;j--)
  			{
  				c=c+array[j];
  			}
  			}
  			else
  			{
  				e=splitArr[i];
  				System.out.print(c+" "+e);
  			
  			
  			}
  		}
	}

}
