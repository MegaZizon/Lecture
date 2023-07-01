#include <stdio.h> 

void str_cat(char* destination, const char* source);

void main() {
	char destination[80] = "These ";
	str_cat(destination, "strings ");
	str_cat(destination, "are ");
	str_cat(destination, "all ");
	str_cat(destination, "connected. "); 
	printf("%s\n", destination);
	
}

void str_cat(char* destination, const char* source) {
	
	while(*destination++ != '\0'){}		//������ ���� destination �� "These "�� ���� ����Ű���� 
	
	destination--;						//�ι��ڸ� ����Ű�� ++�����ϱ�ٽ� �ι��� ��ġ��--; 
	
	while(*source!='\0'){				//���ڿ��� ������ �ݺ� 
		*destination++=*source++;		//�迭destination�� source ���ڿ� �߰� 
	}
	
	*destination='\0';					//�迭 destination���� �� �߰� 
}
