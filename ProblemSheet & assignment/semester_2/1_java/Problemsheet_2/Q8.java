import java.lang.Exception;
import java.util.Scanner;
class MyException extends Exception
{
    		MyException( String message)
{
        		super(message);
}
}
public class Q8 {
   		 public static void main(String[] args) {
       		 Scanner sc = new Scanner(System.in);   
        		int a;
       		 System.out.println("Enter your marks");
       		 a= sc.nextInt();
        		try{
        		if(a<1 || a>100)
 {
           		 throw new MyException("Invalid marks entered");
 }
        		else
{
            	System.out.println("your marks is "+ a);
 }
 }
        		catch(MyException e){
            	System.out.println("exception");
           		System.out.println(e.getMessage());
}
} 
}
