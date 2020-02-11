package com.assignment1.exercise2;

public class DifferenceClass {
	int naturalNumberRange;
	int RangeLoop = 0;
	int Sum=0;
	int var1;//sum of square of natural number
	int var2;//sum of natural number and square
	
	public DifferenceClass(int naturalNumber) {
		// TODO Auto-generated constructor stub
		naturalNumberRange= naturalNumber;
	}
	public int calculateDifference() {
		for(RangeLoop=1;RangeLoop<=naturalNumberRange;RangeLoop++)
		{
			var1+=RangeLoop*RangeLoop;
		}
		var2=((naturalNumberRange*(naturalNumberRange+1))/2);
		var2=(int) Math.pow(var2,2);
		
		Sum=var1-var2;
		
		return Sum;
		
	}

}

