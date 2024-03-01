/*class student
{
	
int a;
int b;
}
class marks extends student
{
	void dis()
	{
a=10;
b=12;
	}
}**/

class student 
{
	int a;
	int b;
	student()
	{
		a=12;
		b=13;
	}
	void dis()
	{
		System.out.println("this super"+a+b);
		
	}
}


class marks extends student
{
	int c;
	int d;
	marks()
	{
		super();
		c=12;
		d=49;
	}
	void show()
	{
		System.out.println("this is progrrrrrrrrrrrram"+c+" " +d+super.a+b);
		
	}
	
}
class super4
{
	
	public static void main(String args[])
	{
		marks m=new marks();
		//m.dis();
		m.show();
		
		
	}
	
}