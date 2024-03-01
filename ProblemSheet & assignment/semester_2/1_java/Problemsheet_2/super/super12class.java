class student
{
int a;
int os;
	student()
	{
		a=100;
		os=100;
	}
	void display()
	{
		System.out.println("A  "+a);
		System.out.println("os  "+os);
	}
}

class marks extends student
{
	int java;
	marks()
	{
		super();
		java=103;
	}
	void get()
	{
		System.out.println("java "+java);
		System.out.println("os2  "+os);
	}
}
class super2
{
	
	public static void main(String[] s)
	{
		marks t=new marks();
	//	marks t=new marks();
		t.get();
		
	}
	
}
