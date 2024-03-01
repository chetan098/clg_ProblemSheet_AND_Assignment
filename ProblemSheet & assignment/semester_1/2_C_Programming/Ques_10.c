/*write a menu driven program for following
a. write a program to display the reverse number fo given 4 digit positive integer ?
b. write a program to display the sum of positive integer ?( 153 – 1+5+3=9)
c. exit. */


// CODE OF QUES. A
include <stdio.h>
include<conio.h>
int main() {
int n, rev = 0, remainder;
printf("Enter an integer: ");
scanf("%d", &n);
while (n != 0) {
remainder = n % 10;
rev = rev * 10 + remainder;
n /= 10;
}
printf("Reversed number = %d”,rev);
return 0;
}



//CODE OF QUES B
int main()
{
int n,i,num,sum=0;
printf("Enter number of numbers to sum:");
scanf("%d",&n);
i=0;
printf("Enter %d numbers to sum:",n);
while(i<n)
{
scanf("%d",&num);
if(num>=0)
{
sum=sum+num;
}
i++;

}
printf("The Sum is: %d",sum);
 0;
}
