#include <stdio.h>
/*
�ڿ��� n�� �Է¹��� �� 1���� n������ �ڿ����� ������
 1�� �� ������ ���ϴ� ���α׷� �ۼ�
[����]   
 n = 4 �� ��, ����� 1�� (1, 2, 3, 4 �� 1�� 1��) 
 n = 13 �� ��, ����� 6�� (1 ~ 13 �� 1�� 6��)
*/
int countone(int n);

void main(){
	int i,n,sum=0,count;
	printf("�ڿ���(1 ~ 1000)�� �Է��Ͻÿ�:");
	scanf_s("%d",&n);
	
	for(i=1; i<=n; i++){
		sum+=countone(i);
	}
	
	printf("%d��",sum);
}

int countone(int n){
	int array[10]={0,};
	int count=0,i;
	int length=0,temp=n;
	
	while(temp!=0){ //n �� ���ڸ������� length�� ���� 
		temp/=10;    
		length++;
	}
	
	for(i=0; i<length; i++){   //n�� �� �ڸ����� �迭 array�� ����  <�迭 �ʱ�ȭ>
		array[i]=n%10;        //10���γ��� ������ (1���ڸ�) ���� ex) 987%10 = 7 , 321%10 = 1             
		n/=10;   
	}
	
	for(i=0; i<length; i++){   //array���� 1�� ����� ����  
		if(array[i]==1)
			count++;
	}
	
	return count; //���� ���� 
	
}
