//write a program to interchange value of two variables
#include<stdio.h>
#include<conio.h>
	int main()
		{
			clrscr();
			inta,b;

			printf("enter the value of a:",a);
			scanf("%d",&a);
			printf("enter the value of b:",b);
			scanf("%d",&b);

			a=a+b;
			b=a-b;
			a=a-b;
			printf("your interchange value a=%d b=%d",a,b);
			getch();
		}
