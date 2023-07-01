#include <stdio.h>
/*
임의의  정수(1~100)  x,  y,  z를  입력받은  후  
오름차순으로  정렬한  다음  가장  작은  값부터  
x, y, z에 차례대로 다시 저장하는 프로그램 작성
*/
void swap(int **a, int **b){    // a와 b의 값을 뒤바뀌게 해줌 
		//포인터 변수의 주소값을 받아와
		// 그 전에 있던 주소에있는 (Main 함수의 x,y,z)값을 변경
	int temp;
	
	temp=**b;
	**b=**a;
	**a=temp;
}


void sort(int *x, int *y, int *z) { //x,y,z 주소값을 받아와 정렬 
			  //정렬 예시) 30,20,10
	if(*x>*y)          
		swap(&x,&y);    // 20,30,10
	
	if(*x>*z)
		swap(&x,&z);    // 10,30,20
	
	if(*y>*z)
		swap(&y,&z);    // 10,20,3
	
}

void main(){
	int x,y,z;
	printf("정수 세 개를 입력하시오:");
	scanf_s("%d %d %d",&x,&y,&z);
	
	sort(&x,&y,&z);
	
	printf("정렬결과:\nx:%d y:%d z:%d",x,y,z);
	
}
