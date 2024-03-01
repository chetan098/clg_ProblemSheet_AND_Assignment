//write a program to convert & print distance in meters,centimeters,feet and inches. The distance between two cities(in km)is input through keybord ?
#include<stdio.h>
#include<conio.h>

	void main()
	{
		floatkm,m,cm,feet,inch;
		clrscr();
		printf("enter the distance in kilomiters");
		scanf("%f",&km);

					   m=1000*km;
					   cm=1000*100*km;
						feet=3280.84*km;
						inch=39370.80*km;

			printf("the distance in feet%f",feet);
			printf("the distance in m%f",m);
			printf("the distance in cm%f",cm);
			printf("the distance in inch%f",inch);
			getch();
	}
