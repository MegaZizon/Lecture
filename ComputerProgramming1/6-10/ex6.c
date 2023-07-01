#include <stdio.h>

int main()
{
	int i, month;
	printf("월을 입력하시오.");
	scanf("%d",&month);
	//.
	if(month<3||month==12){
		printf("%d에 해당하는 계절은 겨울입니다.",month);
	}
	else if(3<=month&&month<6){
		printf("%d에 해당하는 계절은 봄입니다.",month);
	}
	else if(6<=month&&month<9){
		printf("%d에 해당하는 계절은 여름입니다.",month);
	}
	else if(9<=month&&month<12){
		printf("%d에 해당하는 계절은 가을입니다.",month);
	}
	//.
	/*switch(month){
		case 1:
		case 2:
		case 12:
			printf("%d에 해당하는 계절은 겨울입니다.",month);		
			break;
		case 3:
		case 4:
		case 5:
			printf("%d에 해당하는 계절은 봄입니다.",month);
			break;
			
		case 6:
		case 7:
		case 8:
			printf("%d에 해당하는을 계절은 여름입니다.",month);
			break;
		case 9:
		case 10:
		case 11:
			printf("%d에 해당하는 계절은 가을입니다.",month);
			break;
	}*/
	
}
