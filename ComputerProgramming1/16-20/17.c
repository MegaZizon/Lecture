#include <stdio.h>
//두 자연수 입력받아 최대공약수 최소공배수 출력 
int gcd(int *n, int *m);
int lcm(int *n, int *m);

void main(){
	int n,m;
	int tmpn,tmpm;
	
	printf("두 자연수(1~1000)를 입력하시오:");
	scanf_s("%d %d",&n,&m);
	tmpn=n;
	tmpm=m;
	
	printf("%d와 %d의 최대공약수는 %d\n",tmpn,tmpm,gcd(&n,&m));
	n=tmpn;
	m=tmpm;
	printf("%d와 %d의 최소공배수는 %d\n",tmpn,tmpm,lcm(&n,&m));
}

int gcd(int *n,int *m){
	int temp;
	
	if(*n<*m){  //m이 n보다 크면 위치 변경 밑에서 나머지 연산하기 위해서 
		temp=*m;
		*m=*n;
		n=&temp;
	}
	
	if(*n%*m==0){ //n을 m으로 나눈값이 0이면 m이 최대공약수 이므로 리턴해준다 
		return *m;
	}
	/*	유클리드호제법: “2개의 자연수 a,b(a>b)에 대해서 a를 b로 나눈 나머지가 r일 때, 
	a와 b의 최대공약수는 b와 r의 최대공약수와 같다.”*/
	*n=*n%*m; //재귀 하기위해 n에다가 n을 m으로 나눈 나머지 값 설정 여기서 n은a, m은b 

	gcd(m,n); //위에서 n을 R로 설정했으니 매개변수를 m(b) n(r) 으로 입력 후 재귀 
	
}

int lcm(int *n,int *m){
	int temp;
	
	if(*n<*m){  //m이 n보다 크면 위치 변경
		temp=*m;
		*m=*n;
		n=&temp;
	}
	//“a와 b의 최소공배수는 a와 b의 곱을 a와 b의 최대공약수로 나눈 것과 같다.”
	return (*n*(*m))/gcd(n,m);
}







//포인터로 한 이유: 재귀 하려면 R 값 또한 매개변수로 받아야 하는데, 문제에서 제시한 매개변수는 2개이기 때문 
