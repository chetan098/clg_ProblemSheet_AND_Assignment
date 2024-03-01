/*Q.9 Write a Program to display addition,substraction,multiplication,division 
of two integers by command line?*/
class command
	{
			public static void main(String args[])
			{
				int a=Integer.parseInt(args[0]);
				int b=Integer.parseInt(args[1]);
				int sum=a+b;
					System.out.println("Sum="+sum);
				int substraction=a-b;
					System.out.println("Substraction="+substraction);
				int multiplication=a*b;
					System.out.println("Multiplication="+multiplication);
				int division=a/b;
					System.out.println("Division="+division);
			}
	}
