#include <stdio.h>

void judge(int i){
	if(i%2==0)
		printf("even\n");
	else
		printf("odd\n");
	
}

int main(){
	int a,b,c;
	printf("�� ������ �Է��Ͻÿ�:");
	scanf("%d %d %d",&a,&b,&c); 
	judge(a);
	judge(b);
	judge(c);
	
}
