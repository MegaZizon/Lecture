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
	/*for(i=0; i<len; i++){		   //�պ��� ���� 
		min=i;					   //min �ε��� �� ���� 
		for(j=i+1; j<len; j++){    //i+1�� ����: i�� index ������ ��� ���ĵǾ��� ���� 
			if(numbers[j]<numbers[min]){  
				min=j; 				//� ���� num[min]���� �۴ٸ� min ���� 
			}
		}
		temp=numbers[i];			//�ٲٷ��� ���� (i)���ʴ�� ��ġ�� �������ش�. ���� i������ ���ĵ� ������ 
		numbers[i]=numbers[min];
		numbers[min]=temp;
	}*/
	
	
	int max;
	for(i=len-1; i>=0; i--){     	//�ں��� ����  
		max=i;						//min �ε��� �� ���� 
		for(j=i-1; j>=0; j--){      //i-1�� ����: ������ i-1�� index ������ ��� ���ĵǾ��� ���� 
			if(numbers[j]>numbers[max]){
				max=j;         		//����� num[max]���� ũ�� max���� 
			}
		}
		temp=numbers[i];			//�ٲٷ��� ���� (i)����������� ��ġ�� �������ش�. ���� ��~i������ ���ĵ� ������ 
		numbers[i]=numbers[max];
		numbers[max]=temp;
	}
	
	for(i=0; i<len; i++){
		printf("%d ",numbers[i]);
	}
	printf("\n");
}
