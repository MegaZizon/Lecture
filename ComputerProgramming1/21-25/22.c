#include <stdio.h>
/*
**  ����ڰ� �Է� �� �� n�� �μ����� ��� ����ϴ� ���α׷� �ۼ�
**  [����] n: 35 �� ��, ����� 5, 7 // n: 24 �� ��, ����� 2, 3, 4, 6, 8, 12
*/

void factors(int n);

void main(){
	
	int n;
	
	printf("�ڿ��� n (1 ~ 10000)�� �Է��Ͻÿ�:");
	scanf("%d",&n);
	
	factors(n);
}


void factors(int n){
	int i,count=0;
	for(i=2; i<n; i++){
		
		if(n%i==0){ //����������ٸ� 
			
			if(count!=0){ //�̹� �ѹ� ���ٸ� , ��� 
				printf(", %d",i);
			}
			else{
				printf("%d" ,i);
			}
			
			count++;
			
		}
	}
}


