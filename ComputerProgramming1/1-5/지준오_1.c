#include <stdio.h>

int main(){
	int a,b,c,min;
	printf("�� ������ �Է��Ͻÿ�.");
	scanf("%d %d %d",&a,&b,&c);
	
	min= (a<b ? a:b) < c ? (a<b ? a:b) : c;
	
	printf("\n�� ���� �� ���� ���� ���� %d �Դϴ�.",min);
}
