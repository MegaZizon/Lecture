#include <stdio.h>
//�� �ڿ��� �Է¹޾� �ִ����� �ּҰ���� ��� 
int gcd(int *n, int *m);
int lcm(int *n, int *m);

void main(){
	int n,m;
	int tmpn,tmpm;
	
	printf("�� �ڿ���(1~1000)�� �Է��Ͻÿ�:");
	scanf_s("%d %d",&n,&m);
	tmpn=n;
	tmpm=m;
	
	printf("%d�� %d�� �ִ������� %d\n",tmpn,tmpm,gcd(&n,&m));
	n=tmpn;
	m=tmpm;
	printf("%d�� %d�� �ּҰ������ %d\n",tmpn,tmpm,lcm(&n,&m));
}

int gcd(int *n,int *m){
	int temp;
	
	if(*n<*m){  //m�� n���� ũ�� ��ġ ���� �ؿ��� ������ �����ϱ� ���ؼ� 
		temp=*m;
		*m=*n;
		n=&temp;
	}
	
	if(*n%*m==0){ //n�� m���� �������� 0�̸� m�� �ִ����� �̹Ƿ� �������ش� 
		return *m;
	}
	/*	��Ŭ����ȣ����: ��2���� �ڿ��� a,b(a>b)�� ���ؼ� a�� b�� ���� �������� r�� ��, 
	a�� b�� �ִ������� b�� r�� �ִ������� ����.��*/
	*n=*n%*m; //��� �ϱ����� n���ٰ� n�� m���� ���� ������ �� ���� ���⼭ n��a, m��b 

	gcd(m,n); //������ n�� R�� ���������� �Ű������� m(b) n(r) ���� �Է� �� ��� 
	
}

int lcm(int *n,int *m){
	int temp;
	
	if(*n<*m){  //m�� n���� ũ�� ��ġ ����
		temp=*m;
		*m=*n;
		n=&temp;
	}
	//��a�� b�� �ּҰ������ a�� b�� ���� a�� b�� �ִ������� ���� �Ͱ� ����.��
	return (*n*(*m))/gcd(n,m);
}







//�����ͷ� �� ����: ��� �Ϸ��� R �� ���� �Ű������� �޾ƾ� �ϴµ�, �������� ������ �Ű������� 2���̱� ���� 
