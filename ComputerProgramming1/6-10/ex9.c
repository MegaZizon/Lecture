#include <stdio.h>

int sum(int jungsu){
	
	if(jungsu<=2)
		return jungsu;
		
	return jungsu+sum(jungsu-2);
}

int main()
{
	int jungsu;
	printf("���� �� ���� �Է��Ͻÿ�.");
	scanf("%d",&jungsu);
	
	if(jungsu%2!=0)
		jungsu=jungsu-1;
	
	printf("���:%d",sum(jungsu));
	
}
