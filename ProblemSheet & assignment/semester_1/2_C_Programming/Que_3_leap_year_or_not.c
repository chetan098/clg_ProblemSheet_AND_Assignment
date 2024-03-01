//write a program to check whether the inputted year is leap year or not ?

#include<stdio.h>
#include<conio.h>
	void main()
	{
		int a;
		clrscr();
			printf("enter the value a:");
			scanf("%d",&a);
			if(a % 4 == 0 )
			printf("leap year");
			else
			printf("not leap year");

			getch();
	}
