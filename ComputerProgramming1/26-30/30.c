#include <stdio.h> 
char* str_chr(const char* str, char c);
void main() {
	char str[] = "This is a sample string"; 
	char input;
	
	printf("Please enter the character: "); 
	scanf("%c", &input);
	
	if(!str_chr(str, input))
		printf("Character \'%c\' does not exist in a given string, \"%s\" \n", input, str); 
	else
		printf("Character \'%c\' does exist in a given string, \"%s\" \n", input, str); 
}

char* str_chr(const char* str, char c) {
	
	while(*str!='\0'){		//�ι��ڰ��ƴҶ����� 
		if(*str==c)	//str�� ����Ű�°��� c��� �����Ѵ� 
			return (char*)str;
		str++;
	}
	//������ ����ƴٸ� ���°��̹Ƿ� ���������Ѵ� 
	return NULL;
	
}
