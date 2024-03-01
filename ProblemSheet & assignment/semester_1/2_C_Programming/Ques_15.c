/*ques-15 : write a program to print the following patterns.

1. 	*****      2.********    3. 101010
	****         *      *        1010          
	***          *      *         101
	**           ********          10
	*
*/


//CODE OF  PATTERNS 1.
#include <stdio.h>
#include <conio.h>
int main() {
int i, j, rows;
printf("Enter the number of rows: ");
scanf("%d", &rows);
for (i = rows; i >= 1; --i) {
for (j = 1; j <= i; ++j) {
printf("%d ", j);
}
printf("\n");
}
return 0;
}

//CODE OF PATTERNS 2
Include<stdio.h>
Include<conio.h>
Void print_square(int n)
{
Int I,j;
For(i=1;i<=n;i++){
For(j=1;j<=n;j++){
If(i==1 || i==n || j==1)
Printf(“*”);
Else
Printf(“”);
}
Printf(“\n”);
}
}
Int main()
{
Int row = 8;
Print_square(rows);
Return 0;
}


//CODE OF PATTERNS 3
#include <stdio.h>
#include <conio.h>

int main() {
int i, j, rows;
printf("Enter the number of rows: ");
scanf("%d", &rows);
for (i = rows; i >= 1; --i) {
for (j = 1; j <= i; ++j) {
printf("%d ", j);
}
printf("\n");
}
return 0;
}
