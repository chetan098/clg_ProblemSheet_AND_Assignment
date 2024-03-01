//write a program to display sum of 1 + x2 + x3 + x4 …..+xn 

#include< "studio.h">
#include <"math.h">

	int main(void) 
	{
		int i = 0, limit = 4;
		double sum = 0, x = 0;
		printf(“enter the number:-”);
		scanf("%lf", &x);

		for(i = 0; i <= limit; i++)
		{
			sum += pow(-x, i);
		}

		printf("sum is %0.0f\n", sum);
		return 0;
	}
