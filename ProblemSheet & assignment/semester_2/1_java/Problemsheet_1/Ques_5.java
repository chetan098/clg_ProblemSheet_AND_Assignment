//Q.5 Write a Program to print multiplication table?
class table
	{
	public static void main(String args[])
		{
		int n=Integer.parseInt(args[0]);
			for(int i=1;i<=10;i++)
			{
			System.out.println(n+"*"+i+"="+n*i);
			}
		}
	}
