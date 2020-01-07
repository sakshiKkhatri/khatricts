  
package comm.example;

public class MyArray {
	private char[] s;
	private char[] tempArray;
	
	{
		s=new char[26];
	}
	
	public char[] createArray()
	{
		for(int i=0;i<s.length;i++)
		{
			s[i]=(char)('A'+i);
		}
		return s;
	}
	
	public void displayArray()
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+",");
		}
	}
	
	public void convertStringToArray(String str)
	{
		tempArray=str.toCharArray();//converts string to char array
		
		
	}
	public void displayConvertedArray()
	{
		//enhanched for loop
		for(char ch:tempArray)
		{
			System.out.println(ch);
		}
	}

}

