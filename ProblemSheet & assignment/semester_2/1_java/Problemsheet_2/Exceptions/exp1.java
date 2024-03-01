import java.lang.Exception;
/**class myexp extends Exception
{
	myexp(String msg)
	{
		
		super(msg);
	}
}
**/

class exp1 extends Exception
{
	public static void main(String args[])
	{
		try
		{
		float a=Float.parseFloat(args[0]);
//throws new myexp("my exption");
		}
		catch(Exception e)
		{
		System.out.println("message");
		//System.out.println(e.getMessage());	
		}	
	}
}