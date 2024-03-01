//Q.3 Write a Program to find Simple Interest for given data?
class simpleinterest
{
	public static void main(String args[])
			{
				int p=Integer.parseInt(args[0]);
				int q=Integer.parseInt(args[1]);
				int r=Integer.parseInt(args[2]);
				int interest=(p*q*r/100);
				System.out.println("Your Simple Interest is:"+interest);
			}
}
