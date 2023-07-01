#include<stdio.h>
/*
** 자연수  n의  자릿수의  값들이  등차수열을  이룬다면  그  수를  
** ‘멋진  수’라고  하자.  예를  들어, 246, 12345와 같은 수가 ‘멋진 수’이다. 
** 100보다 큰 n이 주어졌을 때, 100보다 크거나 같고, n보다 작거나 같은 
** ‘멋진 수’와 총 개수를 출력하는 프로그램을 작성하시오. 
*/
int is_arithmeticsequence(int x);

int main(){
	int i,n,count=0;
	
	printf("자연수(101 ~ 10000000)을 입력하시오:");
	scanf("%d",&n);
	
	for(i=100; i<=n; i++){ 	//100부터 N사이의 수 조건에 참이면 출력 
		if(is_arithmeticsequence(i)==1){
			printf("%d ",i);
			count++;	//조건에 맞다면 count 해주기 
		}
	}
	
	printf("[%d]",count);
	
}


int is_arithmeticsequence(int x){
	
	int array[10],length=0,i,cha;
	int temp=x;
	
	while(temp!=0){ //X 의 자리수가 몇개인지 length에 저장 
		temp/=10;    
		length++;
	}
	
	for(i=0;i<length; i++){ // X의 각자리수를 배열에 나누어 저장 ex) 2468->[2,4,6,8]
		array[i]=x%10;
		x/=10;
	}
	
	cha=array[1]-array[0]; //공차 설정 
	
	for(i=1;i<length; i++){
		if(array[i]-array[i-1]!=cha){ //공차가 다르면 0 리턴 
			return 0;
		}
	}
	
	return 1;  //위 조건 통과했다면 1 리턴 
}


