#include <stdio.h>

//<규 칙> n → n / 2, n이 짝수 n → 2n + 2, n이 홀수
//입력값 13 20 5
int odd(int n){
	return 2*n+2;
}
int even(int n){
	return n/2;
}

void main(){
	int n,cnt=0;
	 
	printf("자연수를 입력하시오.");
	scanf("%d",&n);
	printf("결과: %d ",n);
	
	while(n!=1){ 
		if(n%2==0){
			n=even(n);
			printf("→%d ",n);
		}
		else{
			n=odd(n);
			printf("→%d ",n);
		}
		cnt++;
	}
	printf("(길이:%d)",cnt+1);
} 
