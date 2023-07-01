#include <iostream>

using namespace std;

class Point{
	private:
		double xval,yval;
	public:
		Point(double x=0.0,double y=0.0) :  xval(x),yval(y){};
		Point(const Point& other){
			this->xval = other.xval;
			this->yval = other.yval;
		}
		
		double getX(){return xval;}
		double getY(){return yval;}
};

void print(Point p){
	cout << "(" << p.getX() << "," << p.getY() << ")"<<  endl;
}

void swap(Point& p1, Point& p2){
	Point temp=p1;
	p1=p2;
	p2=temp;
}

int main(){
	Point p1(1.2,-2.8);
	Point p2(3,6);
	print(p1);
	print(p2);
	swap(p1,p2);
	print(p1);
	print(p2);
}
