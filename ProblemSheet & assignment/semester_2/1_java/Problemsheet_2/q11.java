
import java.lang.Exception;
import java.util.Scanner;
class MyException extends Exception
{
    		MyException( String message)
{
        		super(message);
}
}
public class q11 
{
    		public static void main(String[] args) {
        		Scanner s = new Scanner(System.in);   
        		int balanceAmount=5001,a;
        		System.out.println("Enter your withdrawal amount");
        		a= s.nextInt();
        		try{
        		if(balanceAmount <=a)
  {
            	throw new MyException("Invalid Transaction");
  }
        		else{
           		 System.out.println("Thanks for Withdrawan money \n your curent balance is : "+(balanceAmount-a)+"rs");
  }
 }
        		catch(MyException e){
            	System.out.println("exception");
            	System.out.println(e.getMessage());
 }
} 
}
