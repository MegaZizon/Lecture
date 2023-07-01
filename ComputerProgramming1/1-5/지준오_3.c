#include <stdio.h>

void judge(int i){
	if(i%2==0)
		printf("even\n");
	else
		printf("odd\n");
	
}

int main(){
	int a,b,c;
	printf("세 정수를 입력하시오:");
	scanf("%d %d %d",&a,&b,&c); 
	judge(a);
	judge(b);
	judge(c);
	
}
