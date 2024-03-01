//write a program check whether the inputted character is uppercase, lowercase, digit, blank space or special character and print the appropriate result ?
#include<stdio.h>
#include<conio.h>
	void main()
	{
			charch[50];
			inti;
			int upper=0,lower=0,num=0,special=0;
			clrscr();
			printf("enter your name");
			scanf("%s",ch);
		for(i=0;ch[i] !='\0';i++)
		{
		if(ch[i]>=’A’ && CH[i]<=’Z’)
			{
				upper++;
			}
			elseif(ch[i]>='a' &&ch[i]<='z')
			{
				lower++;
			}
			else if(ch[i]>='1' &&ch[i]<='9')
			{
				num++;
			}
			else
			{
				special++;
			}
		}
			printf("\n %d lowercase letters",lower);
			printf("\n %d numbers",num);
			printf("\n %d special character",special);
		getch();
	}
