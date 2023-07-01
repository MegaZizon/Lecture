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
	char *p = destination; //destination이 가르키는 문자열의 첫번째 주소 p에 대입. 
	
	while(*source != '\0'){	//쏘스가 가르키는 값이 '\0'이 아닐 때까지 
		
		if(cnt==32){
			printf("CAN'T COPY THE STRING");
			return ;
		}
		
		*destination++ = *source++; //source가 가르키는 주소에 있는 값을 포인터 지역변수
									//destination이 가르키는 배열(destination)에 대입 , 주소값 증가 		
		cnt++;
	}
	
	*destination='\0';		//끝에 널문자 삽입 
	printf("%s",p);
	
}
