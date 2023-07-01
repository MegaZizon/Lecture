#include <stdio.h>

/*
** 0부터  9까지의  숫자  중  일부가  들어있는  정부  배열  numbers가  매개변수로  주어진다.
** numbers에서  찾을  수  없는  0부터  9까지의  숫자를  모두  찾아  더한  수를  반환하도록
** 함수 sum_numbers를 완성하시오. 
*/

int sum_numbers(int numbers[], int numbers_len);
void main(){
	
	int i,n,temp,numbers_len=0;
	int numbers[10];
	
	printf("자연수(100~10000000)를 입력하시오");
	scanf("%d",&n);
	
	temp=n;
	
	while(temp!=0){ //N 의 자리수가 몇개인지 (numbers_len) 에 저장 
		temp/=10;
		numbers_len++;
	}
	
	for(i=0; i<numbers_len; i++){ //n의값을 쪼개서 numbers에 저장  
		numbers[i]=n%10;
		n/=10;
	}
	
	printf("%d ",sum_numbers(numbers,numbers_len));
	
}

int sum_numbers(int numbers[], int numbers_len) {
	
	int i,j,sum=0;
	int check[10]={0,}; // 0~9 사이의 값이 있는지 없는지 체크하는 배열 
	
	for(i=0; i<10; i++){
		for(j=0; j<numbers_len; j++){	 
			if(numbers[j]==i)			//number값이 i(0~9)와 같다면 
				check[i]=1;				//check배열의 해당인덱스를 1로 설정(1=true) 
		}
	}
	
	for(i=0; i<10; i++){	
		if(check[i]==0){	// check배열의 해당인덱스가 0 이라면 
			sum+=i;			// 인덱스 값을 sum에 더함 
		}
	}
	
	return sum;
	
}


