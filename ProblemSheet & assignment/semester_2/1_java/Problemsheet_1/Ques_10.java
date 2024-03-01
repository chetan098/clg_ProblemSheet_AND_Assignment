//Q.10 Write a Program to print whether the number is Palindrome or not?
class palindrome
	{
	public static void main(String args[])
		{
			int r,sum=0,temp;
			int n=Integer.parseInt(args[0]);
			temp=n;
				while(n>0)
				{
					r=n%10;
					sum=(sum*10)+r;
					n=n/10;
				}
			if(temp==sum)
			System.out.println("Palindrome Number.");
			else
			System.out.println(" Not a Palindrome Number.");
		}
	}
