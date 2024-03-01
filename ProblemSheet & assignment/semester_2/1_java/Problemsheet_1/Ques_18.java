//Q.18 Write a Program to read a string and rewrite it alphabetical 
// Eg. COMPUTER be written like CEMOPRTU
import java.util.*;
class computer
{
public static void main(String args[])
{
char temp=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the String:");
String str=s.nextLine();
char[]chars=str.toCharArray();
for(int i=0;i<chars.length;i++)
{
for(int j=0;j<chars.length;j++)
{
if(chars[j]>chars[i])
{
temp=chars[i];
chars[i]=chars[j];
chars[j]=temp;
}
}
}
for(int i=0;i<chars.length;i++)
{
System.out.print(chars[i]);
}
}
}