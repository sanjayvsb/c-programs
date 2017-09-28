#include <stdio.h>
int main()
{
    int n, Number = 0, rem;

    printf("Enter an integer: ");
    scanf("%d", &n);

    while(n != 0)
    {
        rem = n%10;
        Number = Number*10 + rem;
        n /= 10;
    }

    printf("Number = %d",Number);

    return 0;
}
