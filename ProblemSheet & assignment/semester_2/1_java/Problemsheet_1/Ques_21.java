//Q.21 Write a Program to implement constructor overloading?
import java.util.*;
class Student{ 
 int id; 
 String name; 
 
 Student(){ 
 System.out.println("this a default constructor"); 
 } 
 
 Student(int i, String n){ 
 id = i; 
 name = n; 
 } 
}
class consover {
 public static void main(String[] args) { 
 //object creation 
 Student s = new Student();
 Scanner obj= new Scanner(System.in);
 int a;
 String b;
 System.out.println("Enter your student id");
 a= obj.nextInt(); 
 System.out.println("Enter your name");
 b= obj.next(); 
 Student student = new Student(a, b); 
 System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name); 
 } 
 }