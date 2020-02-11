package com.assignment6.exercise8;

public class CheckString {

	public static  boolean checkPositive(String str)
	{
		Character c=str.charAt(0);
		for(int i=1;i<str.length();i++)
		{
		   if(c>str.charAt(i))
		   {
			   return false;
		   }
		   c=str.charAt(i);
		}
		return true;
	}
	public static void main(String ar[])
	{
		System.out.println(checkPositive("ANT"));
	}
}
