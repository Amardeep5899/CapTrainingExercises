package com.assignment5.exercise6;

public class FinalClass  {
	public static void main(String ar[]) throws UserDefineException {
		Employee ec=new Employee("amar",1000f);
		Employee ec1=new Employee("deep",6000f);
		try {
			
			ec.SalaryDetails();
			
		} catch (UserDefineException e) {
			System.out.println("caught  "+e);
			ec1.SalaryDetails();
        }

}

}