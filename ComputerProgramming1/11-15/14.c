#include <stdio.h>

//<�� Ģ> n �� n / 2, n�� ¦�� n �� 2n + 2, n�� Ȧ��
//�Է°� 13 20 5
int odd(int n){
	return 2*n+2;
}
int even(int n){
	return n/2;
}

void main(){
	int n,cnt=0;
	 
	printf("�ڿ����� �Է��Ͻÿ�.");
	scanf("%d",&n);
	printf("���: %d ",n);
	
	while(n!=1){ 
		if(n%2==0){
			n=even(n);
			printf("��%d ",n);
		}
		else{
			n=odd(n);
			printf("��%d ",n);
		}
		cnt++;
	}
	printf("(����:%d)",cnt+1);
} 
