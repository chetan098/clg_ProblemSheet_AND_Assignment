//Q.25 Write a Program to print Dynamic Dispatch Method?
import java.util.Scanner;
class Animal {
 public void move() {
 Scanner obj= new Scanner(System.in);
 String a;
 System.out.println("What animal do?");
 a=obj.next();
 }
}
class Dog extends Animal {
 public void move() {
 Scanner obj= new Scanner(System.in);
 String a;
 System.out.println("Dogs comes in animal category?");
 a=obj.next();
 }
}
class animals.java {
 public static void main(String args[]) {
 Animal a = new Animal(); 
 Animal b = new Dog(); 
 a.move(); 
 b.move(); 
 }

}
