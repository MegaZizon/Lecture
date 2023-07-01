#include <stdio.h>
/*
**  사용자가 입력 한 수 n의 인수들을 모두 출력하는 프로그램 작성
**  [예시] n: 35 일 때, 결과는 5, 7 // n: 24 일 때, 결과는 2, 3, 4, 6, 8, 12
*/

void factors(int n);

void main(){
	
	int n;
	
	printf("자연수 n (1 ~ 10000)을 입력하시오:");
	scanf("%d",&n);
	
	factors(n);
}


void factors(int n){
	int i,count=0;
	for(i=2; i<n; i++){
		
		if(n%i==0){ //나누어떨어진다면 
			
			if(count!=0){ //이미 한번 출력됬다면 , 출력 
				printf(", %d",i);
			}
			else{
				printf("%d" ,i);
			}
			
			count++;
			
		}
	}
}


