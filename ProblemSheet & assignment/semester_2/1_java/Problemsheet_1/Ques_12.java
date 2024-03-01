//Q.12 Write a Program to find Armstrong no btw 100 and 1000?
import java.util.*;
class armstrong
	{
	public static void main(String args[])
		{
		int m,s;
		Scanner f=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		m=f.nextInt();
		System.out.println("Enter the Second Number:");
		s=f.nextInt();
		for(int i=m;i<s;i++)
			{
			int n,b,sum=0;
			n=i;
			while(n>0)
				{
				b=n%10;
				sum=sum+(b*b*b);
				n=n/10;
				}
			if(sum==i)
				{
				System.out.println(""+i+" is a Armstrong number.");
				}
			}
		}
	}
