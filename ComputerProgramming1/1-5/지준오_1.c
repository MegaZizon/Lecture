#include <stdio.h>

int main(){
	int a,b,c,min;
	printf("세 정수를 입력하시오.");
	scanf("%d %d %d",&a,&b,&c);
	
	min= (a<b ? a:b) < c ? (a<b ? a:b) : c;
	
	printf("\n세 정수 중 가장 작은 값은 %d 입니다.",min);
}
