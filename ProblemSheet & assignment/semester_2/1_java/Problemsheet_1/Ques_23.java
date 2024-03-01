//Q.23 Write a Program to invoke constructor using "SUPER" keyword?
class student4
{
int sid;
String sname;
student4()
{
sid=101;
sname="Fame";
}
void get()
{
System.out.println("Sid="+sid);
System.out.println("Sname="+sname);
}
}
class teacherr extends student4
{
int tid;
String tname;
teacherr()
{
super();
tid=101;
tname="Mahipal";
}
void display()
{
super.get();
System.out.println("Tname="+tname);
System.out.println("Tid="+tid);
}
}
class super2
{
public static void main(String args[])
{
teacherr t=new teacherr();
t.display();
}
}