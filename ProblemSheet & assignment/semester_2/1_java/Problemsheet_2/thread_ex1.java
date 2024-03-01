class A extends Thread
{
	public void run()
	{
	System.out.println("thread has been started");	
	}
}
class thread_ex1
{
	public static void main(String s[])
	{
		A a=new A();
		a.start();
		
	}
}