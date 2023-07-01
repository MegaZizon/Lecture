#include <stdio.h>
int last(int jungsu,int n,int sum){
	
	sum +=n;
	
	if (sum>=jungsu)
		return n;
		
	last(jungsu,n+1,sum);
}

int main()
{
	int jungsu;
	printf("정수 한 개를 입력하시오.");
	scanf("%d",&jungsu);
	
	printf("결과:%d",last(jungsu,1,0));
}
