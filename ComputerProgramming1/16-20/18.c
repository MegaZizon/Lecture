#include <stdio.h>

/* �ڿ��� n�� �ԷµǸ� n�� �� �ڸ����� ���� �� �ڸ��� 
 �� ������ ����Ͽ� ����ϴ� ���α� �� �ۼ� 
 (1234567 �� 1+2+3+4+5+6+7 = 28 �� 2+8 = 10 �� 1+0 = 1) */
void onedigit(int n);

void main(){
	int n;
	
	printf("�ڿ���(10~9999999)�� �Է��Ͻÿ�:");
	scanf_s("%d",&n);
	
	printf("%d",n);
	onedigit(n);
} 


void onedigit(int n){
	int temp=n;
	int i,length=0,sum=0;
	int array[10];
	
	if(n/10==0){ //���ڸ������ ���� 
		return;
	}
	
	
	else{        //���ڸ����� �ƴ϶�� ��� �� sum�� ��� 
		
		printf(" �� ");
		
		while(temp!=0){ //n �� ���ڸ������� length�� ���� 
			temp/=10;    
			length++;
		}
		
		for(i=length-1; i>=0; i--){  //n�� �� �ڸ��� �迭 array�� ����   <�迭 �ʱ�ȭ>
			array[i]=n%10;         //10���γ��� ������ (1���ڸ�) ���� ex) 987%10 = 7 , 321%10 = 1  
			n/=10;					//10���� n�� ����                 ex) 987/10 = 98, 321/10 = 32
			sum+=array[i];          //���尪 ���� 
		}
		
		for(i=0; i<length; i++){		//�迭 ���� ��� 
			printf("%d",array[i]);   
			if(i<length-1)
				printf("+");
		}
		printf("=%d ",sum);
		
		onedigit(sum);  //sum�� �ٽ� �Է� 
	}
}

