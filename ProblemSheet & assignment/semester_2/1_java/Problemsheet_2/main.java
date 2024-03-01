class shape
{
int a;
int b;
String a="Chetan";
}

class square extends shape
{
	super.a=12;
	super.b=12;
}

class main2
{
	public static void main(String args[])
	{
	shape s=new shape();
		System.out.println("this is super class program"+s.a+s.b);
		
		
	}
}