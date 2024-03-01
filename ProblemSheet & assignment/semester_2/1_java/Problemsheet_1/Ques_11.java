//Q.11 Write a Program to print the Pascal Triangle?
import java.util.*;
class pascal
	{
	public static void main(String args[])
		{
		int rows,c=1,blank,i,j;
		System.out.println("Enter number of rows:");
		Scanner s=new Scanner(System.in);
		rows=s.nextInt();
		for(i=0;i<rows;i++)
			{
			for(blank=1;blank<=rows-i;blank++)
			System.out.print("");
			for(j=0;j<=i;j++)
				{
					if(j==0||i==0)
					c=1;
					else
					c=c*(i-j+1)/j;
					System.out.print(""+c);
				}
			System.out.print("\n");
			}
		}
	}