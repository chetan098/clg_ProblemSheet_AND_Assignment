//Q.4 Write a Program to print the Factorial of a number?
class fact
{
	public static void main(String args[])
	{
		int i,factorial=1;
		int no=Integer.parseInt(args[0]);
			for(i=1;i<=no;i++)
			{
				factorial=factorial*i;
			}
	System.out.println("Factorial of your number:"+factorial+no);
	}
}
