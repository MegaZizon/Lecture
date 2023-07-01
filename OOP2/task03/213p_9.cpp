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
		cout << "밑변이 " << b << "이고 높이가 "<< h <<"인 삼각형의 면적: "<< extend <<endl; 
	}
};


int main(){
	Triangle t;
	t.init(3,4);
	t.area();
}
