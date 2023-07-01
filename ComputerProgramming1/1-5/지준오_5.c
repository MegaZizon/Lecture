#include <stdio.h>

int main(){
	printf("알파벳 한 개를 입력하시오:");
	char alpa;
	scanf("%c",&alpa);
	if(alpa<97)
		printf("당신이 입력한 알파벳은 대문자입니다.");
	else if(alpa>=97)
		printf("당신이 입력한 알파벳은 소문자입니다.");
}

