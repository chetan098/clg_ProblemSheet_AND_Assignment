//Q.16 Write a Program that will Calculate multiplication of two 3X3 matrix?
import java.util.*;
class matrix
{
public static void main(String args[])
{
int m,n,p,q,sum=0,c,d,k;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of rows and columns of 1st Matrix:");
m=s.nextInt();
n=s.nextInt();
int first[][]=new int[m][n];
System.out.println("Enter the Elements of 1st Matrix:");
for(c=0;c<m;c++)
for(d=0;d<n;d++)
first[c][d]=s.nextInt();
System.out.println("Enter the number of rows and columns of 2nd Matrix:");
p=s.nextInt();
q=s.nextInt();
if(n!=p)
System.out.println("The Matrix cannot be multiplied.");
else
{
int second[][]=new int[p][q];
int multiply[][]=new int[m][q];
System.out.println("Enter the Elements of 2nd Matrix");
for(c=0;c<p;c++)
for(d=0;d<q;d++)
second[c][d]=s.nextInt();
for (c=0;c<m;c++)
{
for(d=0;d<q;d++)
{
for(k=0;k<p;k++)
{
sum=sum+first[c][k]*second[k][d];
}
multiply[c][d]=sum;
sum=0;
}
}
System.out.println("Product of the Matrix");
for(c=0;c<m;c++)
{
for(d=0;d<q;d++)
System.out.print(multiply[c][d]+"\t");
System.out.print("\n");
}
}
}
}
