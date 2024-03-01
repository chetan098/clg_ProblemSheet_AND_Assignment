//Q.22 Write a Program to implement the MultiLevel Inheritance?
import java.util.Scanner;
class Animal {
 void eat() {
 Scanner obj= new Scanner(System.in);
 String a;
 System.out.println("What animal do?");
 a=obj.next();
 }
}
class Dog extends Animal {
 void bark() {
 Scanner obj= new Scanner(System.in);
 String a;
 System.out.println("Dogs comes in animal category?");
 a=obj.next();
 }
}
class BabyDog extends Dog {
 void weep() {
 Scanner obj= new Scanner(System.in);
 String a;
 System.out.println("Do baby dogs look cute");
 a=obj.next();
 }
}
class multiinher {
 public static void main(String args[]) {
 BabyDog d = new BabyDog();
 d.eat();
 d.bark();
 d.weep();
 }
}
