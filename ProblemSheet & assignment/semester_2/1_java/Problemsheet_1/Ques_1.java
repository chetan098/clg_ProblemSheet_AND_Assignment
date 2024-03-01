/*Q.2 Write a Program to swap the content of two variables without using third variable?*/
class demo
{ 
	public static void main(String args[])
		{ 
			 System.out.println("Before swapping"); 
			 int x = Integer.parseInt(args[0]); 
			 int y = Integer.parseInt(args[1]);
			 System.out.println("value of x:" + x); 
			 System.out.println("value of y:" + y); 
			 System.out.println("After swapping"); 
			 x = x + y; 
			 y = x - y; 
			 x = x - y; 
			 System.out.println("value of x:" + x); 
			 System.out.println("value of y:" + y); 
		} 
} 
