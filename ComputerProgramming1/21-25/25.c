#include <stdio.h>

/*
** 0����  9������  ����  ��  �Ϻΰ�  ����ִ�  ����  �迭  numbers��  �Ű�������  �־�����.
** numbers����  ã��  ��  ����  0����  9������  ���ڸ�  ���  ã��  ����  ����  ��ȯ�ϵ���
** �Լ� sum_numbers�� �ϼ��Ͻÿ�. 
*/

int sum_numbers(int numbers[], int numbers_len);
void main(){
	
	int i,n,temp,numbers_len=0;
	int numbers[10];
	
	printf("�ڿ���(100~10000000)�� �Է��Ͻÿ�");
	scanf("%d",&n);
	
	temp=n;
	
	while(temp!=0){ //N �� �ڸ����� ����� (numbers_len) �� ���� 
		temp/=10;
		numbers_len++;
	}
	
	for(i=0; i<numbers_len; i++){ //n�ǰ��� �ɰ��� numbers�� ����  
		numbers[i]=n%10;
		n/=10;
	}
	
	printf("%d ",sum_numbers(numbers,numbers_len));
	
}

int sum_numbers(int numbers[], int numbers_len) {
	
	int i,j,sum=0;
	int check[10]={0,}; // 0~9 ������ ���� �ִ��� ������ üũ�ϴ� �迭 
	
	for(i=0; i<10; i++){
		for(j=0; j<numbers_len; j++){	 
			if(numbers[j]==i)			//number���� i(0~9)�� ���ٸ� 
				check[i]=1;				//check�迭�� �ش��ε����� 1�� ����(1=true) 
		}
	}
	
	for(i=0; i<10; i++){	
		if(check[i]==0){	// check�迭�� �ش��ε����� 0 �̶�� 
			sum+=i;			// �ε��� ���� sum�� ���� 
		}
	}
	
	return sum;
	
}


