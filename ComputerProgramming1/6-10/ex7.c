#include <stdio.h>

int main()
{
	int count;
	printf("정수를 입력하시오.");
	scanf("%d",&count);	
	
	printf("%d부터 카운트다운.\n",count);
	/*
	while(count!=0){
		printf("%d\n",count);
		count--;
	}
	*/
	
	int i;
	for(i=count; i>0; i--){
		printf("%d\n",i);
	}
	
}
