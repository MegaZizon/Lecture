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
	
	
	/*for(i=1; i<len; i++){		   		//�պ��� ���� 
		for(j=len-1; j>i-1; j--){     	//�ǵ��� �迭�ε��� ���� ���ĵǾ��ִ� �ε��������� ���� 
			if(numbers[j]<numbers[j-1]){ 	//�ڿ��ִ� ���� �տ��ִ� ������ �۴ٸ� 
				temp=numbers[j];	   		//��ġ���� 
				numbers[j]=numbers[j-1];
				numbers[j-1]=temp;
			}
		}
	}*/
	
	for(i=len-1; i>0; i--){			//�ں��� ���� 
		for(j=0; j<i; j++){			//0���� ���ĵ� �ε��� (i)������ ���� 
			if(numbers[j]>numbers[j+1]){ 	//�տ��ִ°��� �ڿ��ִ°����� ũ�ٸ� 
				temp=numbers[j];	   		//��ġ���� 
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


