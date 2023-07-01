#include <stdio.h>
/*
자연수 n을 입력받은 후 1부터 n까지의 자연수에 나오는
 1의 총 개수를 구하는 프로그램 작성
[예시]   
 n = 4 일 때, 결과는 1개 (1, 2, 3, 4 중 1은 1개) 
 n = 13 일 때, 결과는 6개 (1 ~ 13 중 1은 6개)
*/
int countone(int n);

void main(){
	int i,n,sum=0,count;
	printf("자연수(1 ~ 1000)를 입력하시오:");
	scanf_s("%d",&n);
	
	for(i=1; i<=n; i++){
		sum+=countone(i);
	}
	
	printf("%d개",sum);
}

int countone(int n){
	int array[10]={0,};
	int count=0,i;
	int length=0,temp=n;
	
	while(temp!=0){ //n 이 몇자리수인지 length에 저장 
		temp/=10;    
		length++;
	}
	
	for(i=0; i<length; i++){   //n의 각 자리수를 배열 array에 저장  <배열 초기화>
		array[i]=n%10;        //10으로나눈 나머지 (1의자리) 저장 ex) 987%10 = 7 , 321%10 = 1             
		n/=10;   
	}
	
	for(i=0; i<length; i++){   //array에서 1이 몇개인지 센다  
		if(array[i]==1)
			count++;
	}
	
	return count; //센값 리턴 
	
}
