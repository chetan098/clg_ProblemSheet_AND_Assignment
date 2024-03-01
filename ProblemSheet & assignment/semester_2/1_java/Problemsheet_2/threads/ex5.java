class A extends Thread
{
	public void run()
	{
		System.out.println("the A thread start here");
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"A");
			System.out.println("");
		}
		System.out.println("the A thread ended here");
		
	}
}
class B extends Thread
{
	public void run()
	{
		System.out.println("the B thread start here");
		for(int j=0;j<5;j++)
		{
			System.out.println(j+"  "+"b");
			System.out.println("");
		}
		System.out.println("the B thread ended here");
		
	}
}

class C extends Thread
{
	public void run()
	{
		System.out.println("the c thread start here");
		for(int k=0;k<5;k++)
		{
			System.out.println(k+"  "+"b");
			System.out.println("");
		}
		System.out.println("the c thread ended here");
		
	}
}
class ex5
{
	public static void main(String s[])
	{
		A a=new A();		
		B b=new B();
		C c=new C();
		//a.setPriority(Thread.MIN_PRIORITY);
		//b.setPriority(10);
		//c.setPriority(1);
		
		//System.out.println("we have priority miniumum priority is :---"+a.getPriority());
		//System.out.println("we have set priority of maximum of :--" +b.getPriority());
		//System.out.println("we have set priority of maximum of :--" +c.getPriority());
		a.start();
		b.start();
		c.start();
	}
}
