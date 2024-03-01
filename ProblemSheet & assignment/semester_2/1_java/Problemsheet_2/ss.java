class student
{
	int roll=110;
	String name="chetan";
	int cls=1;
	
}
class mark extends student
{
	int java=101;
	int os=101;
	void display()
	{
	System.out.println("this is super class program"+roll+"  "+name+"  "+cls+"  "+java+"  "+ os);	
	}
}
class ss
{
	public static void main(String args[])
	{
	mark m=new mark();
	m.display();
	}
	
}