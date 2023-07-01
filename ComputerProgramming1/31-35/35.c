#include <stdio.h>

int recur_evennum(unsigned int a, unsigned int b);

void main(){
	int a,b;
	
	printf("Enter a integer number a & b:");
	scanf("%d %d",&a,&b);
	
	printf("The even numbers between a and b:");
	recur_evennum(a+1,b);	//a보다 커야하기때문에 a+1 
}

int recur_evennum(unsigned int a, unsigned int b){
	
	if(a<b){						//a<b 일때까지 
		if(a%2==0){					//짝수라면 출력 
			printf("%d ",a);
			recur_evennum(a+2,b);   //a+2값을 재귀 
		}
		else{						//홀수라면 a+1값을 넣어준다. 
			recur_evennum(a+1,b);
		}
	}
	else{
		return ;
	}
	
}

