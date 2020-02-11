package com.assignment1.exercise1;

import java.util.Scanner;

public class FinalClass {
	public static void main(String ar[])
		{
		int naturalNumber;
		Scanner sc=new Scanner(System.in);
		naturalNumber=sc.nextInt();
		SumClass sum=new SumClass(naturalNumber);
		int Sum=(int) sum.calculateSum();
		System.out.println(Sum);
		
		}

}

