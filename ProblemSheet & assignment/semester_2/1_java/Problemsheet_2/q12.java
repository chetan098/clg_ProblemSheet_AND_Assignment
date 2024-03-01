import java.io.*;
class q12
{
public static void main(String args[])
{
try
{
File in=new File("file.txt");
File ot=new File("output.txt");

FileReader ins=new FileReader(in);
FileWriter ots=new FileWriter(ot);
int ch;
while((ch=ins.read())!=-1)
{
ots.write(ch);
}
ins.close();
ots.close();
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Done!!!!!!! the file copy sucessfully");
}
}
