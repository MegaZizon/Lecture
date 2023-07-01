#include <stdio.h>
/*
** 자연수  n과 m이 주어질  때 m이상 n이하의  자연수 중 
** 소수인 것을  모두 골라  이들 소수의 합을 출력하는 프로그램 작성
** m: 2, n: 10 일 때, 결과는 17
*/
int primesum(int m,int n);

void main(){
	int m,n;
	
	printf("자연수 m, n (1 ~ 100)을 입력하시오:");
	scanf("%d %d",&m,&n);
	
	printf("%d",primesum(m,n));
}

int primesum(int m,int n){
	
	int i,j, num,sum=0;
	int TF; //참/거짓  
	num=m;
	
	for(i=m; i<=n; i++){			// m ~ n 까지  반복 
		TF=1;			  		
		for(j=2; j<=num/2; j++){ 	// num값이 소수인지 확인하기 위해 쓰임 2~num/2까지 반복 
									//num/2인 이유: 처음에 2로 나누어봤기때문에 그이상으로 나누어떨어지는 경우는 없음 
			if(num%j==0){		// 나누어 떨어지는 수가 있다면 반복문 종료 
				TF=0; 			// 거짓 
				break;
			}
		}
		
		if(TF==1){		//반복문이 끝까지 수행됬다면
			//printf("%d ",num);	
			sum+=num;  	//그 값은 소수이므로 Sum에 더함 
		}
		num++;			//num값 증가 
		
	}
	return sum;
}

