#include <stdio.h>
void str_cpy(char* destination, const char* source);

void main(){
	char source[64];
	char destination[32];
	
	printf("Enter a source string:");
	gets(source);
	str_cpy(destination, source);
	
}

void str_cpy(char* destination, const char* source) {
	
	int cnt=0;
	char *p = destination; //destination�� ����Ű�� ���ڿ��� ù��° �ּ� p�� ����. 
	
	while(*source != '\0'){	//��� ����Ű�� ���� '\0'�� �ƴ� ������ 
		
		if(cnt==32){
			printf("CAN'T COPY THE STRING");
			return ;
		}
		
		*destination++ = *source++; //source�� ����Ű�� �ּҿ� �ִ� ���� ������ ��������
									//destination�� ����Ű�� �迭(destination)�� ���� , �ּҰ� ���� 		
		cnt++;
	}
	
	*destination='\0';		//���� �ι��� ���� 
	printf("%s",p);
	
}
