//import java.lang.*;
import java.io.*;
class a
{
public static void main(String args[]) 
{
try
{
FileInputStream in=new FileInputStream("in.txt");
FileOutputStream ot=new FileOutputStream("output2.txt");
int i;
while((i=in.read())!=-1)
{
	ot.write(i);
}
in.close();
ot.close();
}
catch(Exception e)
{
System.out.println(e);
}
	System.out.println("done2");
}
}