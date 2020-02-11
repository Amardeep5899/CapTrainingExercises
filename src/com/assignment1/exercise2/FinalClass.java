package com.assignment1.exercise2;
import java.util.Scanner;

import com.assignment1.exercise1.SumClass;

public class FinalClass {
	public static void main(String ar[])
	{
	int naturalNumber;
	Scanner sc=new Scanner(System.in);
	naturalNumber=sc.nextInt();
	DifferenceClass sum=new DifferenceClass(naturalNumber);
	int Sum=(int) sum.calculateDifference();
	System.out.println(Sum);
	
	}

}
