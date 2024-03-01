class A
{
int a=12;
int b=13;
}
class B extends A
{
int c=12;
int d=12;
}
class Caa extends B
{
int e=12;
void show()
{
System.out.println("this is super class"+a+b+c+d+e);

}
}
class super5
{
	public static void main(String args[])
	{
		Caa c=new Caa();
		c.show();
		System.out.println("this is super class"+c.a+c.b+c.c+c.d+c.e);
	}
}