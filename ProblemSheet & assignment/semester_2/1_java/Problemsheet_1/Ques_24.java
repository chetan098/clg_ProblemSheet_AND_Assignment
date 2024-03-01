//Q.24 Write a Program to make a result card?
import java.io.*;
import java.util.*;
class Student
{
Scanner sc=new Scanner(System.in);
int regno,total=0,subjects;
String name;
int marks[];
Student()
{
System.out.println("Enter Registration No:");
regno=sc.nextInt();
System.out.println("Enter Student Name:");
name=sc.next();
GetMarks();
}
public void GetMarks()
{
marks=new int[3];
System.out.println("Enter marks of OOP:");
marks[0]=sc.nextInt();
System.out.println("Enter marks of OS:");
marks[1]=sc.nextInt();
System.out.println("Enter marks of DBMS:");
marks[2]=sc.nextInt();
for(int i=0;i<3;i++)
{
total+=marks[i];
}
System.out.println("Total Marks Of Students:" +name+ ":" +total);
}
}
class result
{
public static void main(String args[])
{
Student s[]=new Student[2];
for(int i=0;i<2;i++)
s[i]=new Student();
}
}
