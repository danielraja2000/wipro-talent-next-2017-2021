import java.io.*;
import java.util.*;
Class SumOddDigits
{
	public int EvenSum(int input1)
	{
		int r,sumodd=0;
    		while(input1!=0)
    		{
       			 r=input1%10;
        			input1=input1/10;
        			if(r%2!=0)
        			{
           				 sumodd=sumodd+r;
       			}
   		 }
    		return sumodd
	}
}