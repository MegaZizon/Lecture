#include<stdio.h>
/*
** �ڿ���  n��  �ڸ�����  ������  ����������  �̷�ٸ�  ��  ����  
** ������  �������  ����.  ����  ���, 246, 12345�� ���� ���� ������ �����̴�. 
** 100���� ū n�� �־����� ��, 100���� ũ�ų� ����, n���� �۰ų� ���� 
** ������ ������ �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
*/
int is_arithmeticsequence(int x);

int main(){
	int i,n,count=0;
	
	printf("�ڿ���(101 ~ 10000000)�� �Է��Ͻÿ�:");
	scanf("%d",&n);
	
	for(i=100; i<=n; i++){ 	//100���� N������ �� ���ǿ� ���̸� ��� 
		if(is_arithmeticsequence(i)==1){
			printf("%d ",i);
			count++;	//���ǿ� �´ٸ� count ���ֱ� 
		}
	}
	
	printf("[%d]",count);
	
}


int is_arithmeticsequence(int x){
	
	int array[10],length=0,i,cha;
	int temp=x;
	
	while(temp!=0){ //X �� �ڸ����� ����� length�� ���� 
		temp/=10;    
		length++;
	}
	
	for(i=0;i<length; i++){ // X�� ���ڸ����� �迭�� ������ ���� ex) 2468->[2,4,6,8]
		array[i]=x%10;
		x/=10;
	}
	
	cha=array[1]-array[0]; //���� ���� 
	
	for(i=1;i<length; i++){
		if(array[i]-array[i-1]!=cha){ //������ �ٸ��� 0 ���� 
			return 0;
		}
	}
	
	return 1;  //�� ���� ����ߴٸ� 1 ���� 
}


