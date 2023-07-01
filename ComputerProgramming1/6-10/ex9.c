#include <stdio.h>

int sum(int jungsu){
	
	if(jungsu<=2)
		return jungsu;
		
	return jungsu+sum(jungsu-2);
}

int main()
{
	int jungsu;
	printf("정수 한 개를 입력하시오.");
	scanf("%d",&jungsu);
	
	if(jungsu%2!=0)
		jungsu=jungsu-1;
	
	printf("결과:%d",sum(jungsu));
	
}
