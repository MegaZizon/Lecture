#include <stdio.h>
#define ARR_SIZE 8
void bubble_sort(int numbers[],int len);

void main(){
	int numbers1[ARR_SIZE] = {9,2,5,7,4,1,1,3};
	int numbers2[ARR_SIZE] = {2,4,9,1,4,3,5,4};
	
	bubble_sort(numbers1, ARR_SIZE);
	bubble_sort(numbers2, ARR_SIZE);
}

void bubble_sort(int numbers[], int len){
	
	int i , j , temp;
	
	
	/*for(i=1; i<len; i++){		   		//앞부터 정렬 
		for(j=len-1; j>i-1; j--){     	//맨뒤의 배열인덱스 부터 정렬되어있는 인덱스까지만 실행 
			if(numbers[j]<numbers[j-1]){ 	//뒤에있는 값이 앞에있는 값보다 작다면 
				temp=numbers[j];	   		//위치변경 
				numbers[j]=numbers[j-1];
				numbers[j-1]=temp;
			}
		}
	}*/
	
	for(i=len-1; i>0; i--){			//뒤부터 정렬 
		for(j=0; j<i; j++){			//0부터 정렬된 인덱스 (i)까지만 실행 
			if(numbers[j]>numbers[j+1]){ 	//앞에있는값이 뒤에있는값보다 크다면 
				temp=numbers[j];	   		//위치변경 
				numbers[j]=numbers[j+1];
				numbers[j+1]=temp;
			}
		}
	}
	
	for(i=0; i<len; i++){
		printf("%d ",numbers[i]);
	}
	printf("\n");
}


