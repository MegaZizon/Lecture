#include <stdio.h>

int main()
{
	int i, month;
	printf("���� �Է��Ͻÿ�.");
	scanf("%d",&month);
	//.
	if(month<3||month==12){
		printf("%d�� �ش��ϴ� ������ �ܿ��Դϴ�.",month);
	}
	else if(3<=month&&month<6){
		printf("%d�� �ش��ϴ� ������ ���Դϴ�.",month);
	}
	else if(6<=month&&month<9){
		printf("%d�� �ش��ϴ� ������ �����Դϴ�.",month);
	}
	else if(9<=month&&month<12){
		printf("%d�� �ش��ϴ� ������ �����Դϴ�.",month);
	}
	//.
	/*switch(month){
		case 1:
		case 2:
		case 12:
			printf("%d�� �ش��ϴ� ������ �ܿ��Դϴ�.",month);		
			break;
		case 3:
		case 4:
		case 5:
			printf("%d�� �ش��ϴ� ������ ���Դϴ�.",month);
			break;
			
		case 6:
		case 7:
		case 8:
			printf("%d�� �ش��ϴ��� ������ �����Դϴ�.",month);
			break;
		case 9:
		case 10:
		case 11:
			printf("%d�� �ش��ϴ� ������ �����Դϴ�.",month);
			break;
	}*/
	
}
