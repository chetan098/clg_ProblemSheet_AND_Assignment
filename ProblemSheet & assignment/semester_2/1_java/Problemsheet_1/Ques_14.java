/*Q.14 Write a Program to display addition of the numbers on 
even and odd locations in an array of 10 elements?*/
import java.util.*;
class evenodd 
	{
	 public static void main(String args[])
		 {
			int number,i,even=0,odd=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Please Enter Your Number:");
			number=s.nextInt();
		 for (i = 0; i < number; i++)
			 {
				 if (i % 2 == 0)
				 even = even+i;
				 else
			 odd = odd+i;
			 }
		 System.out.println("Even index positions sum: " + even);
		 System.out.println("Odd index positions sum: " + odd);
		 }
	}
