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
		cout << "�Ҹ��� ȣ��\n";
	}
	print(){
		cout <<"x: "<< x << endl<<"y: "<<y<<endl; 
	}
};

/* Ŭ���� �ܺο� ���� 
Point::Point(int a,int b){
	x=a;
	y=b;
}
Point::~Point(){
	cout << "�Ҹ��� ȣ��\n";
}
*/


int main(){
	Point p1(100,200);
	p1.print();
}
