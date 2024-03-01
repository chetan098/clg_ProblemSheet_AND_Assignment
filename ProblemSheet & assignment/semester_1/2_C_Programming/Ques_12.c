/*Ques-12 : write a program to display the positive integer is palindrom not..(121 -121) ? */

#include <stdio.h>
#include <conio.h>
int main() {
int n, reversed = 0, remainder, original;
printf("Enter an integer: ");
scanf("%d", &n);
original = n;
while (n != 0) {
remainder = n % 10;
reversed = reversed * 10 + remainder;
n /= 10;
}
if (original == reversed)
printf("%d is a palindrome.", original);
else
printf("%d is not a palindrome.", original);
return 0;
}
