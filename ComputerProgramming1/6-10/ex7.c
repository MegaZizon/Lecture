#include <stdio.h>

int main()
{
	int count;
	printf("������ �Է��Ͻÿ�.");
	scanf("%d",&count);	
	
	printf("%d���� ī��Ʈ�ٿ�.\n",count);
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
