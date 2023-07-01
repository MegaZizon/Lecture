#include <stdio.h>

int main(){
	int n;
	printf("주민번호 앞 6자리를 입력하시오");
	scanf("%d",&n); 
	if(35<=n/10000){
		printf("young");
	}
	else{
		printf("old");
	}
}
