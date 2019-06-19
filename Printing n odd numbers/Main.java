#include <stdio.h>
int main()
{
	int n,i,j;
  scanf("%d",&n);
  for(i=1,j=1;j<=n;j++,i=i+2)
  {
    printf("%d\n",i);
  }
	return 0;
}