#include <iostream>
using namespace std;

class Point{
private:
	int x,y;
public:
	//Point(int a,int b);
	//~Point();
	Point(){
		x=0;
		y=0;
	}
	
	Point(int a,int b) : x(a), y(b){}
	
	~Point(){
		cout << "소멸자 호출\n";
	}
	print(){
		cout <<"x: "<< x << endl<<"y: "<<y<<endl; 
	}
};

/* 클래스 외부에 정의 
Point::Point(int a,int b){
	x=a;
	y=b;
}
Point::~Point(){
	cout << "소멸자 호출\n";
}
*/


int main(){
	Point p1(100,200);
	p1.print();
}
