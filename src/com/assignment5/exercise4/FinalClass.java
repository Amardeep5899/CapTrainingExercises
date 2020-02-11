package com.assignment5.exercise4;

import java.util.Scanner;

import com.assignment5.exercise5.UserDefineException;

public class FinalClass {
	public static void main(String ar[])
	{
		String firstName="amar";
		String lastName="deep";
		/*Scanner sc=new Scanner(System.in);
		firstName=sc.next();
		lastName=sc.next();*/
		EmployeeClass ec=new EmployeeClass(firstName,lastName);
	    try {
			ec.employeeName();
		} catch (com.assignment5.exercise4.UserDefineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

