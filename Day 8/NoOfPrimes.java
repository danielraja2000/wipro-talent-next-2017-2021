import java.io.*;
import  java.util.*;
Class NoOfPrimes
{
	public int countPrime(int input1,int input2)
	{
		int c=0,i,j;
		for(  i=input1;i<=input2;i++)
  		{
   			for( j=2;j<i;j++)
			{
				if(i%j==0)	
				{
					break;
				}
			}
			if(i==j)
			{
				c++;
				
			}
		}
		return c;		
      
		
	}
}