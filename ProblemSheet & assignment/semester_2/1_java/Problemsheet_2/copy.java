import java.io.*; 
import java.util.*;
class copy
{
	public static void main(String args[])
	{
		try{
	File in=new File("file.txt");
	File ot=new File("files.txt");
	
	FlieWriter ots=new FileWriter(ot);
	FileReader ins=new FileReader(in);
	
		
		int ch;
		//while(ch=ins.read()!=-1)
		while ((ch = ins.read()) != -1)
		{
			
			ots.write(ch);
		}
		ins.close();
		ots.close();
		}
		catch(Exeception e)
		{
			System.out.println("succes");
			
		}
		
	}
}