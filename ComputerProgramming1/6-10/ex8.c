#include <stdio.h>

int main()
{
	char alpabet,a='a';
	printf("영문 소문자 한 개를 입력하시오.");
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
