#include <stdio.h>
#include <string.h>

void str_org(char* string1, char* string2) ;

void main() {
	char string1[32]; char string2[32];

	printf("Enter the first string: "); 
	gets(string1);

	printf("Enter the second string:");
	gets(string2);

	str_org(string1, string2); 
}

void str_org(char* string1, char* string2) {
	
	char str2[strlen(string2)];
	int count=0;
	
	for(count=0; *string2!='\0'; count++){		// 배열 str2에 문자열string2를 복사 
		str2[count]=*string2++;
	}
	
	str2[count]='\0';
	
	while(*string1 !='\0'){		
		
		for(count=0; str2[count]!='\0'; count++){	//string1과 배열str2의 값을 비교하고 같다면 배열에 있는 값을 X로 변경 
			if(str2[count]==*string1 && str2[count]!='X'){
				str2[count]='X';
				break;
			}
		}

		string1++;
	}
	
	for(count=0; str2[count]!='\0'; count++){ //배열에 있는 모든원소가 X라면 같다 아니면 다르다 
		if(str2[count]!='X'){
			printf("NOT SAME");
			return ;
		}
	}
	
	printf("SAME");
	
		
}
