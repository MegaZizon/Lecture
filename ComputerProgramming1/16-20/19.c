#include <stdio.h>
/*
�ڿ���  n��  �Է¹���  �� �Է°���  0~5������  ���ڰ�
���  ��  ���� ����  ������  Ȯ���ϴ� ���α׷� �ۼ�
[����]    
1256 �� FALSE (0, 3, 4�� ������ ����) 
12360 �� FALSE (4, 5�� ������ ����) 
123450 �� TRUE
1350824 �� TRUE
*/
void checkone(int n);

void main(){
	
	int n;
	printf("�ڿ���(1000~9999999)�� �Է��Ͻÿ�:");
	scanf_s("%d",&n);
	
	checkone(n);
}

void checkone(int n){
	
	int array[10],i,j,length=0;
	int temp=n;
	int check[6]={0,}; //üũ �迭 ��簪 0���� �ʱ�ȭ 
	
	
	while(temp!=0){ //n �� ���ڸ������� length�� ���� 
		temp/=10;    
		length++;
	}
	
	for(i=0; i<length; i++){   //n�� �� �ڸ����� �迭 array�� ���� <�迭 �ʱ�ȭ> 
		array[i]=n%10;        //10���γ��� ������ (1���ڸ�) ���� ex) 987%10 = 7 , 321%10 = 1             
		n/=10;   
	}
	
	for(i=0; i<length; i++){  //�迭�� ��� ���Ҹ� üũ�ϸ� ���ٸ� �ش� ���� 1�� ���� 
		for(j=0; j<6; j++){ 
			if(array[i]==j){  //array[i]�� ���� J�� ���ٸ� 
				check[j]=1;   //check[j]�� 1�� ����, ���� ���� ���� ������ ������ �ݺ��� ���� 
				break; 
			}
		}
	}
	
	for(i=0; i<6; i++){
		if(check[i]==0){
			printf("FALSE");  //�迭 check�� ������ �ϳ��� 0�� �ִٸ�  false��� �� �Լ����� 
			return;
		}
	}
	printf("TRUE"); //���� �˻縦 ����ϸ� TRUE ���  
		
	
}




