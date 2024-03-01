import java.io.*;
class f3
{
	public static void main(String args[]) throws Exception
	{
		File in =new File("A.txt");
		File ot =new File("B.txt");
		
		FileReader ins =new FileReader(in);
		FileWriter ots =new FileWriter(ot);
		
		int ch;
		while((ch=ins.read())!=-1)
		{
			ots.write(ch);
		}
		ins.close();
		ots.close();
		System.out.println("done");
	}
}