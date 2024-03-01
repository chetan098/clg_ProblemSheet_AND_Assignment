//Q.19 Write a Program to arrange the different students names in name wise 
// increasing order?
import java.util.*;
class studentlist
{
public static void main(String args[])
{
int n;
String temp;
Scanner st=new Scanner(System.in);
System.out.println("Enter the number of Names you would like to enter:");
n=st.nextInt();
String names[]=new String[n];
Scanner str=new Scanner(System.in);
System.out.println("Enter the Names:");
for(int i=0;i<n;i++)
{
names[i]=str.nextLine();
}
for(int i=0;i<n;i++)
{
for(int j=1;j<n;j++)
{
if(names[j-1].compareTo(names[j])>0)
{
temp=names[j-1];
names[j-1]=names[j];
names[j]=temp;
}
}
}
System.out.println("Names in sorted order.");
for(int i=0;i<=n;i++)
{
System.out.print(names[i]+",");
}
}
}
