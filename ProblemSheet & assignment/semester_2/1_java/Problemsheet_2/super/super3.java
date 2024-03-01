class student
{
int a;
int b;
student()
{
a=10;
b=20;
}
void display()
{
System.out.println("the marks of a and b"+a+b);
}
}
class marks extends student
{
int java;
int os;
marks()
{
	super();
java=30;
os=25;

}

void displays()
{


System.out.println("marks os javav and os"+java+os);
}
}

class super3
{
public static void main(String args[])
{
marks s=new marks();
s.display();
s.displays();
}
}