#include <stdio.h>

int main()
{
	char alpabet,a='a';
	printf("���� �ҹ��� �� ���� �Է��Ͻÿ�.");
	scanf("%c",&alpabet);
	
	
	while(a!=alpabet+1){
		printf("%c ",a);
		a++;
	}
	
	/*
	char i;
	for(i='a'; i!=alpabet+1; i++){
		printf("%c ",i);
	}*/
	
}
