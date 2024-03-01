class A extends Runnable
{
	public void run()
	{
		System.out.println("the A thread start here");
		for(int i=0;i<5;i++)
		{
			System.out.println(i)
		}
		System.out.println("the thread ended here");
		
	}
}
class ex3
{
	public static void main(String s[])
	{
		A a=new A();
		Thread t=new Thread(a);
		t.start();
		
	
	}
}
