#include <stdio.h>
int main()
{  
    int num, temp, firstDigit, lastDigit;  
    scanf("%d", &num);  
    temp = num;   
    lastDigit = num %10;   
    while(num > 10){    
        num = num/10;
    } 
    firstDigit = num;
    printf("%d", firstDigit+lastDigit);  
    return 0;  
}