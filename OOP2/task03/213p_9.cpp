#include <iostream>
#include <string>
#include <stdlib.h>
#include <time.h>

using namespace std;

class Triangle{
	
public:
	
	int b,h;
	int extend;
	
	void init(int x,int y){
		
		b=x;
		h=y;
		
		extend=(b*h)/2;
	}
	void area(){
		cout << "�غ��� " << b << "�̰� ���̰� "<< h <<"�� �ﰢ���� ����: "<< extend <<endl; 
	}
};


int main(){
	Triangle t;
	t.init(3,4);
	t.area();
}
