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
	
	while(*str!='\0'){		//널문자가아닐때까지 
		if(*str==c)	//str이 가르키는값이 c라면 리턴한다 
			return (char*)str;
		str++;
	}
	//끝까지 실행됐다면 없는것이므로 널을리턴한다 
	return NULL;
	
}
