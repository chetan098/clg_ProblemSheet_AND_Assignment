/**import java.io.*;
//import java.lang.*;
class f2
{
	public static void main(String args[])
	{
			try
			{
				File in=new File("input.txt");
				File ot=new File("E:\\sem_2\\java\\fileHandling\\output.txt");
				FileReader ins=new FileReader(in);
				FileWriter ots=new FileWriter(ot);
				
				int i;
				while((i=ins.read())!=-1)
				{
					ots.write(i);
				}
				ins.close();
				ots.close();
			}
			
			catch(Exception e)
			{
				System.out.print("done this is exception"+e);
				
			}
		System.out.println("done");
	}
	
}**/

import java.io.*;
class f2
{
public static void main(String args[])
{
try
{
File in=new File("input.txt");
File ot=new File("output.txt");
FileReader ins=new FileReader(in);
FileWriter ots=new FileWriter(ot);
int ch;
while((ch=ins.read())!=-1)
{
ots.write((char)ch);
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