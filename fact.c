#include <stdio.h>
long int Numbers(int n);

int main()
{
    int n;
    printf("Enter a positive integer: ");
    scanf("%d", &n);
    printf("Factorial of %d = %ld", n, Numbers(n));
    return 0;
}
long int Numbers(int n)
{
    if (n >= 1)
        return n*Numbers(n-1);
    else
        return 1;
}
