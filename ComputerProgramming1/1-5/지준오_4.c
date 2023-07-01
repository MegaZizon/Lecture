#include <stdio.h>
char rt(int score){
	char scoreC;
	if(score<60)
		scoreC='F';
	else if(score<70)
		scoreC='D';
	else if(score<80)
		scoreC='C';
	else if(score<90)
		scoreC='B';
	else if(score<101)
		scoreC='A';
	return scoreC;
}

int main(){
	printf("점수를 입력하시오.:");
	int score;
	scanf("%d",&score);	
	
	printf("당신의 학점은 %c 입니다.",rt(score));
}
