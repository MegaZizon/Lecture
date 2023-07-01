#include <stdio.h>
unsigned int recur_exp(unsigned int a, unsigned int n);

void main(){
	unsigned int a,n;
	printf("Enter integer numbers a & n:");
	scanf("%d %d",&a,&n);
	
	printf("%d",recur_exp(a,n));
}

unsigned int recur_exp(unsigned int a, unsigned int n) {
	if(n!=0){
		return recur_exp(a,n-1)*a;
	}
	else{
		return 1;
	}
}
