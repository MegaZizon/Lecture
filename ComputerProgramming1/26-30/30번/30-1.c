#include<stdio.h>

void main(){
	
	char c[] = "ABC";
	
	const char *cp=c;
	
	*cp='X';
	
	printf("%s",c);
	
}
