#include <stdio.h>
//정수 n (1000~9999)을 입력받은 후 원래 값을 거꾸로 뒤집어 출력하는 프로그램 작성
//입력값 3572 4321 1000 3333
int main(){
	int n,i,j=1;
	int sum=0;
	
	printf("정수(1000~9999)한개를 입력하시오.");
	scanf("%d",&n);
	
	for(i=1000; i>=1; i=i/10){

		sum=sum+(n/i)*j; //  n/i를 하는 이유는 "2345"에서 맨 앞자리 값인 "2"를 얻기 위함 
						 //  j를 곱하는 이유는 자리수를 맞추기 위함 
						 //  sum에 리버스된 숫자를 저장 ex)(+2) 2 ->(+30) 32 ->(+400) 432 -> (+5000) 5432
		j=j*10;          //  j에 10을곱해서 다음 자리수를 sum에 저장할 수 있게 함 
		n=n-(n/i)*i;     // "2345"에서 "345"를 남기기 위해서는 끝 자리인 2000을 빼야함 
	}
	printf("결과:%d",sum);
	
}
