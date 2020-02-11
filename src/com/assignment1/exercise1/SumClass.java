package com.assignment1.exercise1;

public class SumClass {
	int naturalNumberRange;
	int RangeLoop = 0;
	int sum=0;
	SumClass(int Range)
	{
		naturalNumberRange=Range;
	}
	public int calculateSum()
	{
		 for ( RangeLoop = 0; RangeLoop<naturalNumberRange; RangeLoop++){
	          if(RangeLoop%3==0||RangeLoop%5==0)
	          {
	        	  sum+=RangeLoop;
	          }
	       }
		return sum;
		 
	}

}

