#include<stdio.h>
int main()
{
int n,a,b,c,d;
  scanf("%d",&n);
  a=n%10;
  n=n/10;
  b=n%10;
  c=n/10;
  d=a+c;
  printf("%d",d);
  return 0;
}