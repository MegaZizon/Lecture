#include <stdio.h>
/*
** �ڿ���  n�� m�� �־���  �� m�̻� n������  �ڿ��� �� 
** �Ҽ��� ����  ��� ���  �̵� �Ҽ��� ���� ����ϴ� ���α׷� �ۼ�
** m: 2, n: 10 �� ��, ����� 17
*/
int primesum(int m,int n);

void main(){
	int m,n;
	
	printf("�ڿ��� m, n (1 ~ 100)�� �Է��Ͻÿ�:");
	scanf("%d %d",&m,&n);
	
	printf("%d",primesum(m,n));
}

int primesum(int m,int n){
	
	int i,j, num,sum=0;
	int TF; //��/����  
	num=m;
	
	for(i=m; i<=n; i++){			// m ~ n ����  �ݺ� 
		TF=1;			  		
		for(j=2; j<=num/2; j++){ 	// num���� �Ҽ����� Ȯ���ϱ� ���� ���� 2~num/2���� �ݺ� 
									//num/2�� ����: ó���� 2�� ������ñ⶧���� ���̻����� ����������� ���� ���� 
			if(num%j==0){		// ������ �������� ���� �ִٸ� �ݺ��� ���� 
				TF=0; 			// ���� 
				break;
			}
		}
		
		if(TF==1){		//�ݺ����� ������ ������ٸ�
			//printf("%d ",num);	
			sum+=num;  	//�� ���� �Ҽ��̹Ƿ� Sum�� ���� 
		}
		num++;			//num�� ���� 
		
	}
	return sum;
}

