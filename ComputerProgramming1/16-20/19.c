#include <stdio.h>
/*
자연수  n을  입력받은  후 입력값이  0~5까지의  숫자가
모두  한  번씩 사용된  것인지  확인하는 프로그램 작성
[예시]    
1256 → FALSE (0, 3, 4가 사용되지 않음) 
12360 → FALSE (4, 5가 사용되지 않음) 
123450 → TRUE
1350824 → TRUE
*/
void checkone(int n);

void main(){
	
	int n;
	printf("자연수(1000~9999999)를 입력하시오:");
	scanf_s("%d",&n);
	
	checkone(n);
}

void checkone(int n){
	
	int array[10],i,j,length=0;
	int temp=n;
	int check[6]={0,}; //체크 배열 모든값 0으로 초기화 
	
	
	while(temp!=0){ //n 이 몇자리수인지 length에 저장 
		temp/=10;    
		length++;
	}
	
	for(i=0; i<length; i++){   //n의 각 자리수를 배열 array에 저장 <배열 초기화> 
		array[i]=n%10;        //10으로나눈 나머지 (1의자리) 저장 ex) 987%10 = 7 , 321%10 = 1             
		n/=10;   
	}
	
	for(i=0; i<length; i++){  //배열의 모든 원소를 체크하며 같다면 해당 값을 1로 변경 
		for(j=0; j<6; j++){ 
			if(array[i]==j){  //array[i]의 값이 J와 같다면 
				check[j]=1;   //check[j]는 1로 변경, 이후 같을 일은 없으니 마지막 반복문 종료 
				break; 
			}
		}
	}
	
	for(i=0; i<6; i++){
		if(check[i]==0){
			printf("FALSE");  //배열 check의 원소중 하나라도 0이 있다면  false출력 후 함수종료 
			return;
		}
	}
	printf("TRUE"); //위에 검사를 통과하면 TRUE 출력  
		
	
}




