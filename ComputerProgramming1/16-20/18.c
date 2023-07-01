#include <stdio.h>

/* 자연수 n이 입력되면 n의 각 자릿수의 합이 한 자리가 
 될 때까지 계산하여 출력하는 프로그 램 작성 
 (1234567 → 1+2+3+4+5+6+7 = 28 → 2+8 = 10 → 1+0 = 1) */
void onedigit(int n);

void main(){
	int n;
	
	printf("자연수(10~9999999)를 입력하시오:");
	scanf_s("%d",&n);
	
	printf("%d",n);
	onedigit(n);
} 


void onedigit(int n){
	int temp=n;
	int i,length=0,sum=0;
	int array[10];
	
	if(n/10==0){ //한자리수라면 종료 
		return;
	}
	
	
	else{        //한자리수가 아니라면 출력 후 sum값 재귀 
		
		printf(" → ");
		
		while(temp!=0){ //n 이 몇자리수인지 length에 저장 
			temp/=10;    
			length++;
		}
		
		for(i=length-1; i>=0; i--){  //n의 각 자리수 배열 array에 저장   <배열 초기화>
			array[i]=n%10;         //10으로나눈 나머지 (1의자리) 저장 ex) 987%10 = 7 , 321%10 = 1  
			n/=10;					//10으로 n을 나눔                 ex) 987/10 = 98, 321/10 = 32
			sum+=array[i];          //저장값 더함 
		}
		
		for(i=0; i<length; i++){		//배열 원소 출력 
			printf("%d",array[i]);   
			if(i<length-1)
				printf("+");
		}
		printf("=%d ",sum);
		
		onedigit(sum);  //sum값 다시 입력 
	}
}

