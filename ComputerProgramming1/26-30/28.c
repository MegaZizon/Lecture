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
	
	//�պ��� ���� 
	for(i=1; i<len; i++){		    
	
		temp=numbers[i];	//i�� �ε����� Temp�� ���� 
		
		for(j=i; j>0 && numbers[j-1]>temp; j--){ //j�� i�� �ε������� 1���� �ٿ����� ,�������� ������ ���� �þ�Ƿ� �ݺ�Ƚ���� ������
												 //temp���� num[j-1](�� �տ��ִ� �ε���)������������ �ڽ��� ��ġ�̹Ƿ� ����
			numbers[j]=numbers[j-1];			 //�������� �ڸ��� �������ϱ� ������ �ϳ��� �ڷ� �о������. 
		}
		
		numbers[j]=temp;	//j--�߱� ������ ������ ���� �װ��� ���� 
		
	}
	
	
	/*
	for(i=len-2; i>=0; i--){			//�ں��� ����
		
		temp=numbers[i];				//i�� �ε����� temp�� ���� 
		
		for(j=i; j<len-1 && numbers[j+1]<temp; j++){//j�� i�� �ε������� 1�����÷����� ,�������� ������ ���� �þ�Ƿ� �ݺ�Ƚ���� ������  
													//temp���� num[j+1](�� �ڿ��ִ� �ε���)���� Ŭ���� �ڽ��� ��ġ�̹Ƿ� ���� 
			numbers[j]=numbers[j+1];				//�������� �ڸ��� ������ �ϱ� ������ �ϳ��� ������ �о������. 
		}
		numbers[j]=temp;
	}*/
	
	for(i=0; i<len; i++){
		printf("%d ",numbers[i]);
	}
	printf("\n");
}


