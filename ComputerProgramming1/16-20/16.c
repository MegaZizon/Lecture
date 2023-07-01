#include <stdio.h>
/*
������  ����(1~100)  x,  y,  z��  �Է¹���  ��  
������������  ������  ����  ����  ����  ������  
x, y, z�� ���ʴ�� �ٽ� �����ϴ� ���α׷� �ۼ�
*/
void swap(int **a, int **b){    // a�� b�� ���� �ڹٲ�� ���� 
		//������ ������ �ּҰ��� �޾ƿ�
		// �� ���� �ִ� �ּҿ��ִ� (Main �Լ��� x,y,z)���� ����
	int temp;
	
	temp=**b;
	**b=**a;
	**a=temp;
}


void sort(int *x, int *y, int *z) { //x,y,z �ּҰ��� �޾ƿ� ���� 
			  //���� ����) 30,20,10
	if(*x>*y)          
		swap(&x,&y);    // 20,30,10
	
	if(*x>*z)
		swap(&x,&z);    // 10,30,20
	
	if(*y>*z)
		swap(&y,&z);    // 10,20,3
	
}

void main(){
	int x,y,z;
	printf("���� �� ���� �Է��Ͻÿ�:");
	scanf_s("%d %d %d",&x,&y,&z);
	
	sort(&x,&y,&z);
	
	printf("���İ��:\nx:%d y:%d z:%d",x,y,z);
	
}
