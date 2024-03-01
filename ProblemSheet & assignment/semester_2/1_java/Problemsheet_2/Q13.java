import java.io.*;
class Q13
{
public static void main(String args[])
{
try
{
FileInputStream s=new FileInputStream("file.txt");
int i;
while((i=s.read())!=-1)
{
System.out.print((char)i);
}
s.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
