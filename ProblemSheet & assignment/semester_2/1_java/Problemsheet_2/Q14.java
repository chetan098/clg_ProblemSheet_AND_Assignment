import java.io.*;
class Q14
{
public static void main(String args[])
{
try
{
FileInputStream s=new FileInputStream("file.txt");
FileOutputStream o=new FileOutputStream("output.txt");
int i;
while((i=s.read())!=-1)
{
o.write((char)i);
}
s.close();
o.close();
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("DONE Byte program Run Sucessfully");
}
}
