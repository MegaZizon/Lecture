#include <stdio.h>

int recur_evennum(unsigned int a, unsigned int b);

void main(){
	int a,b;
	
	printf("Enter a integer number a & b:");
	scanf("%d %d",&a,&b);
	
	printf("The even numbers between a and b:");
	recur_evennum(a+1,b);	//a���� Ŀ���ϱ⶧���� a+1 
}

int recur_evennum(unsigned int a, unsigned int b){
	
	if(a<b){						//a<b �϶����� 
		if(a%2==0){					//¦����� ��� 
			printf("%d ",a);
			recur_evennum(a+2,b);   //a+2���� ��� 
		}
		else{						//Ȧ����� a+1���� �־��ش�. 
			recur_evennum(a+1,b);
		}
	}
	else{
		return ;
	}
	
}

