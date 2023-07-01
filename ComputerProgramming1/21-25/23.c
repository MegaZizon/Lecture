#include <stdio.h>

/*자연수 n이 각 자릿수의 합으로 나누어떨어지면 n을 
**‘비투한 수’라고 말한다. 예를 들어, 18 의 각 자릿수 합은 
**1+8=9이고, 18은 9로 나누어떨어지므로 18은 비투한 수이다. 
**비투한 수에 는  10,  12,  18  등이  있다.  자연수  n을  
**입력받아  이  값이  비투한  수인지  아닌지를  판별하는 함수 
**is_bitnum(n)을 작성하시오
*/
void is_bitnum(int n);

void main(){
	int n;
	
	printf("자연수n (10 ~ 1000)을 입력하시오:");
	scanf("%d",&n);
	
	is_bitnum(n);
}


void is_bitnum(int n){
	int sum=0;
	int temp=n;
	
	while(temp!=0){	//각 자리수의 합을 sum 에 저장 
		sum+=temp%10;
		temp/=10;
	}
	
	if(n%sum==0){  //N이 각 자리수의 합으로 나누어 떨어진다면 
		printf("TRUE");
	}
	else{
		printf("FALSE");
	}
}
