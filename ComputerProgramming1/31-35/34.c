#include <stdio.h>

int recur_cool(unsigned int n);

void main(){
	int n;
	
	printf("Enter a integer number n:");
	scanf("%d",&n);
	
	printf("%d",recur_cool(n));
}

int recur_cool(unsigned int n) {
	
	if(n==0){
		return 1;
	}
	else if(n%2){
		return recur_cool(n-1) *2-1;
		
	}
	else{
		return recur_cool(n-2) +3;
	}
	
}
