/*Q.20 Write a java program to demonstrate the 4 difference 
way to method implementation. 
(1. No Passing No returning 2. No Passing and returning 
3. Passing Something and Returning 4. Passing Something and Not returning)*/
import java.util.Scanner;
class Method{
 void display()
 {
 Scanner obj= new Scanner(System.in);
 int a;
 System.out.println("Enter the number");
 a=obj.nextInt();
 System.out.println("Your number is "+a);
 }
 int show()
 {
 Scanner obj= new Scanner(System.in);
 int a;
 System.out.println("Enter the number");
 a=obj.nextInt();
 return a;
 }
 int hello(int a)
 {
 Scanner obj= new Scanner(System.in);
 int b;
 System.out.println("Enter the number");
 b=obj.nextInt();
 return a+b;
 }
 void world(int a)
 {
 Scanner obj= new Scanner(System.in);
 int b;
 System.out.println("Enter the number");
 b=obj.nextInt();
 System.out.println(a+b);
 }
}
class pr20 {
 public static void main(String args[])
 {
 Method a= new Method();
 a.display();
 a.show();
 a.hello(12);
 a.world(12);
 }
}
