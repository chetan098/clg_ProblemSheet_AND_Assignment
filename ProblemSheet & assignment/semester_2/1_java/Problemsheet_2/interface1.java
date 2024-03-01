interface A
{
		void show();
}
class B extends A
{
	int a=12;
	public void show()
	{
		System.out.println("this is interface class"+this.a);	
	}
}

class interface1
{
	public static void main(String args[])
	{
		B b=new B();
		b.show();
	}
	
}