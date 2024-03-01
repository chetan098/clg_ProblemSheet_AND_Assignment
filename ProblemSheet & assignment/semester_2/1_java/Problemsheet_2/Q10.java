import java.lang.Exception;
import java.util.Scanner;
class MyException extends Exception
{
   		 MyException( String message)
 {
       		 super(message);
 }
 }
public class Q10 {
    		public static void main(String[] args) {
      		Scanner sc = new Scanner(System.in);   
        		int a;
        		System.out.println("Enter your age");
        		a= sc.nextInt();
        		try{
        		if(a<=18)
 {
            	throw new MyException("Sorry you are not eligible for vote or Invalid age entered");
}
        		else{
            	System.out.println("your age is "+ a+"and You are eligible for voting");
}
}
        		catch(MyException e){
            	System.out.println("exception");
           		 System.out.println(e.getMessage());
}
} 
}
