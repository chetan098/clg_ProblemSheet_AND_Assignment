class shape
{
//int a;
int b=13;
String a="Chetan";
}

class square extends shape
{
	//void get()
	//{
	//super.a=12;
	//super.b;
	System.out.println("this is super class program"+a+"  "+b);
	//}
}

class main2
{
	public static void main(String args[])
	{
	square s=new square();
		s.get();
		
		
	}
}