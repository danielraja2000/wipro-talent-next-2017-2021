import java.io.*;
import java.util.*;
Class UniqueDigit
{
	public int uniqueCount(int input1)
	{
		int i=0,j,k;
    		int n=input1;
   		int count=0,check,c2=0;
    		while(n>0)
    		{

		        n=n/10;
        		        c2++;
    		}
    		int arr[c2];
    		n=input1;
    		while(n>0)
    		{
        			arr[i]=n%10;
        			n=n/10;
        			i++;

    		}
    		for(j=0;j<c2;j++)
    		{
        			check=0;

        			for(k=0;k<c2;k++)
        			{
            				if(j!=k)
            				{
                					if(arr[j]==arr[k])
                					{
                    					check++;
                					}
            				} 

        			}

        			if(check==0)
        			{
            				count++;
        			}
    		} 
   		 return ++count; 

    
	}
}
