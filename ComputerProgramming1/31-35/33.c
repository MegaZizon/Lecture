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
	
	for(count=0; *string2!='\0'; count++){		// �迭 str2�� ���ڿ�string2�� ���� 
		str2[count]=*string2++;
	}
	
	str2[count]='\0';
	
	while(*string1 !='\0'){		
		
		for(count=0; str2[count]!='\0'; count++){	//string1�� �迭str2�� ���� ���ϰ� ���ٸ� �迭�� �ִ� ���� X�� ���� 
			if(str2[count]==*string1 && str2[count]!='X'){
				str2[count]='X';
				break;
			}
		}

		string1++;
	}
	
	for(count=0; str2[count]!='\0'; count++){ //�迭�� �ִ� �����Ұ� X��� ���� �ƴϸ� �ٸ��� 
		if(str2[count]!='X'){
			printf("NOT SAME");
			return ;
		}
	}
	
	printf("SAME");
	
		
}
