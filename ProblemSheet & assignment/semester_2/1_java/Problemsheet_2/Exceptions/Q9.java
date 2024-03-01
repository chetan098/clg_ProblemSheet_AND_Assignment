import java.lang.Exception;
class myexp extends Exception
{
	myexp(String msg)
	{	
	super(msg);
	}
}
pu                                                                                             blic class Q9 
{
	public static void main(String[] args)
	{ 
	float a=5f;
	float b=1000f;
		try
		{
			float z=a/b;
				if(z<0.01)		
				{
					throw new myexp("number is too small");
					
				}
		}
		catch(myexp e)
		{
			System.out.println("this is a expection");
			System.out.println(e.getMessage());
		}
	}	 
}
