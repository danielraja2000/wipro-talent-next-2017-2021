import java.util.*;
import java.io.*;
public class PrintNumFrom0to100
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        for(int i=0;i<=100;i++)
        {
            System.out.print(i);
            System.out.print(" ");
            i=i+1;
        }
    }

}