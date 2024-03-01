import java.io.*;
class Q15
{
public static void main(String args[])
{
try
{
FileInputStream in=new FileInputStream("file.txt");
FileOutputStream ot=new FileOutputStream("output2.txt");
int ch;
while((ch=in.read())!=-1)
{
ot.write(ch);
}
in.close();
ot.close();
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("DONE Copying Bytes sucessfully");
}
}
