#include <stdio.h>
int last(int jungsu,int n,int sum){
	
	sum +=n;
	
	if (sum>=jungsu)
		return n;
		
	last(jungsu,n+1,sum);
}

int main()
{
	int jungsu;
	printf("���� �� ���� �Է��Ͻÿ�.");
	scanf("%d",&jungsu);
	
	printf("���:%d",last(jungsu,1,0));
}
