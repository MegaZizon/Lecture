#include <stdio.h>

unsigned int str_len(const char* str);

void main() {
	char str[256]; printf("Enter a string: ");
	
	gets(str);
	
	printf("The string entered is %u characters long.\n", str_len(str));
	
}


unsigned int str_len(const char* str) {
	int count=0;
	
	char* temp=str;
	
	while(*temp++!=NULL){
		count++;
	}
	
	return count;
}
