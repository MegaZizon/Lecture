#include <stdio.h>
#define ARR_SIZE 8

void Selection_Sort(int numbers[],int len);

void main(){
	int numbers1[ARR_SIZE] = {9,2,5,7,4,1,1,3};
	int numbers2[ARR_SIZE] = {2,4,9,1,4,3,5,4};
	
	Selection_Sort(numbers1,ARR_SIZE);
	Selection_Sort(numbers2,ARR_SIZE);
}

void Selection_Sort(int numbers[],int len){
	int i , j , temp;
	
	int min;
	/*for(i=0; i<len; i++){		   //앞부터 정렬 
		min=i;					   //min 인덱스 값 저장 
		for(j=i+1; j<len; j++){    //i+1인 이유: i번 index 까지는 모두 정렬되었기 때문 
			if(numbers[j]<numbers[min]){  
				min=j; 				//어떤 수가 num[min]보다 작다면 min 변경 
			}
		}
		temp=numbers[i];			//바꾸려는 수와 (i)차례대로 위치를 변경해준다. 따라서 i까지는 정렬된 데이터 
		numbers[i]=numbers[min];
		numbers[min]=temp;
	}*/
	
	
	int max;
	for(i=len-1; i>=0; i--){     	//뒤부터 정렬  
		max=i;						//min 인덱스 값 저장 
		for(j=i-1; j>=0; j--){      //i-1인 이유: 끝에서 i-1번 index 까지는 모두 정렬되었기 때문 
			if(numbers[j]>numbers[max]){
				max=j;         		//어떤수가 num[max]보다 크면 max변경 
			}
		}
		temp=numbers[i];			//바꾸려는 수와 (i)내림차순대로 위치를 변경해준다. 따라서 끝~i까지는 정렬된 데이터 
		numbers[i]=numbers[max];
		numbers[max]=temp;
	}
	
	for(i=0; i<len; i++){
		printf("%d ",numbers[i]);
	}
	printf("\n");
}
