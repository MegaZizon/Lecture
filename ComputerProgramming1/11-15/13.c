#include <stdio.h>

/*�ڿ��� n(10 <= n <= 99999)�� �Է¹޾Ƽ� �� �ڸ��� ������ ������ ������ ���� ���ϴ� �� �α׷� �ۼ�.
 ���� ��� �ڿ��� 1425�� �ԷµǸ� ����� 425+125+145+142 = 837 �� ��.  */
// �Է°� 1425 111 10 63572
int tenmultiple(int a){ //10�� N���� ���� �������ִ� �Լ� 
	int i,j=1;
	
	for(i=0; i<a-1; i++){
		j*=10;
	}
	return j;
}

void main(){
	int num,temp,count=0;
	int j,i=0,sum=0,hap=0; 
	
	printf("�ڿ����� �Է��Ͻÿ�:");
	scanf("%d",&num);
	printf("���:");
	
	temp=num;
	
	while(temp!=0){ // num�� ���ڸ������� ���� ex) 4321 �̸� 4�ڸ� 
		temp/=10;
		count++;
	}
	
	int ten=tenmultiple(count); //ten�� 10�� count���� ���� �Է� ex)4321�϶� 4�ڸ��̹Ƿ� 1000 
	int array[count],array2[count]; //count���� �迭�� ���� 
	
	for(i=0; i<count; i++){			//�迭 "array"�� �� �ڸ����� �Է� ex)4321�ϋ� 4,3,2,1 
		array[i]=num/ten;            
		num=num-array[i]*ten;        //4321 - (4x1000) = 321 
		ten/=10;
	}
	
	for(i=0; i<count; i++){  //�� �ڸ��� ������ ������ ������ �迭"array2"�� �Է��ϸ�
							 //�� ���� hap�� ������Ŵ  
		
		ten=tenmultiple(count-1);  //-1���ϴ� ����:"4321" "4"�ڸ������� 
		                           //���ϴ� ���ڵ�(321+421...)�� -1�� "3"�ڸ��̱⶧�� 
		sum=0;
		
		for(j=0; j<count; j++){
			if(j==i) continue;    //4321���� �� �ڸ��� �������� �ʱ� ���� 
			sum=sum+array[j]*ten; //321�� ������ ����(300+20+1)
			ten/=10;              
		}
		
		array2[i]=sum;            //321�� �迭"array2"�� �Է�  
		hap+=array2[i];           //array2�� ��� ���ҵ��� �� 
		
		printf("%d",array2[i]);
		if(i<count-1)			  //�������� �ƴϸ� + ���  
			printf("+");
		else                      //�������̸� ��� 
			printf(" = %d",hap);
	}
}
