#include <stdio.h>
//1부터 입력한 정수 n (1~100)까지 하나씩 증가시켜 출력하는 
//프로그램을 작성하되 3의 배수 인 경우는 출력하지 않도록 프로그램 작성
//입력값  10 15 
int main(){
	int n,i;
	printf("정수 한개를 입력하시오.");
	scanf("%d",&n);
	
	for(i=0; i<=n; i++){
		if(i%3==0)
			continue;
		printf("%d ",i);
	}
}
