#include <stdio.h>

void main(){
	int i,linecnt;
	int spacecnt=5,starcnt=1;
	//��Ģ : ����5 ��1 > ��4 ��3 > ��3 ��5 
	//���� 7���� ���� ���� 
	for(linecnt=1; linecnt<=11; linecnt++){  //11�� ��� 
		
		if(linecnt<6){  
		
			if(starcnt==7){  //���� 7���� ���� ��� ���� 
				spacecnt--;  
				starcnt+=2;
			}
			else{            //�׿� ���� ��� 
				for(i=1; i<=spacecnt; i++)
					printf(" ");
		
				for(i=1; i<=starcnt; i++)
					printf("*");
				printf("\n");
				
				spacecnt--;  //������ 1���� �ٰ� 
				starcnt+=2;  //���� 2���� �þ��  
			}
		}
		
		else{
			if(starcnt==7){
				spacecnt++;  //������ 1���� �ð� 
				starcnt-=2;  //���� 2����  �پ��� 
			}
			else{
				for(i=1; i<=spacecnt; i++)
					printf(" ");
		
				for(i=1; i<=starcnt; i++)
					printf("*");
				printf("\n");
				spacecnt++;
				starcnt-=2;
			}
		}
	}
}

