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
	
	while(*destination++ != '\0'){}		//포인터 변수 destination 이 "These "의 끝을 가르키게함 
	
	destination--;						//널문자를 가르키고 ++했으니까다시 널문자 위치로--; 
	
	while(*source!='\0'){				//문자열의 끝까지 반복 
		*destination++=*source++;		//배열destination에 source 문자열 추가 
	}
	
	*destination='\0';					//배열 destination끝에 널 추가 
}
