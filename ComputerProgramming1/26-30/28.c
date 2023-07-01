#include <stdio.h>
#define ARR_SIZE 8
void insertion_sort(int numbers[],int len);

void main(){
	int numbers1[ARR_SIZE] = {9,2,5,7,4,1,1,3};
	int numbers2[ARR_SIZE] = {2,4,9,1,4,3,5,4};
	
	insertion_sort(numbers1, ARR_SIZE);
	insertion_sort(numbers2, ARR_SIZE);
}

void insertion_sort(int numbers[], int len){
	
	int i , j , temp;
	
	//앞부터 정렬 
	for(i=1; i<len; i++){		    
	
		temp=numbers[i];	//i번 인덱스를 Temp에 저장 
		
		for(j=i; j>0 && numbers[j-1]>temp; j--){ //j는 i번 인덱스부터 1개씩 줄여나감 ,데이터의 개수가 점점 늘어나므로 반복횟수는 많아짐
												 //temp보다 num[j-1](더 앞에있는 인덱스)값이작을때가 자신의 위치이므로 멈춤
			numbers[j]=numbers[j-1];			 //끼워넣을 자리를 만들어야하기 때문에 하나씩 뒤로 밀어버린다. 
		}
		
		numbers[j]=temp;	//j--했기 때문에 공간이 있음 그곳에 삽입 
		
	}
	
	
	/*
	for(i=len-2; i>=0; i--){			//뒤부터 정렬
		
		temp=numbers[i];				//i번 인덱스를 temp에 저장 
		
		for(j=i; j<len-1 && numbers[j+1]<temp; j++){//j는 i번 인덱스부터 1개씩늘려나감 ,데이터의 개수가 점점 늘어나므로 반복횟수는 많아짐  
													//temp보다 num[j+1](더 뒤에있는 인덱스)값이 클때가 자신의 위치이므로 멈춤 
			numbers[j]=numbers[j+1];				//끼워넣을 자리를 만들어야 하기 때문에 하나씩 앞으로 밀어버린다. 
		}
		numbers[j]=temp;
	}*/
	
	for(i=0; i<len; i++){
		printf("%d ",numbers[i]);
	}
	printf("\n");
}


