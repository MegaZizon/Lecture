#include <iostream>
#include <string>

using namespace std;

class Shape{
		int x,y;
		string color;
	public:
		Shape(int x,int y,string color){
			this->x=x;
			this->y=y;
			this->color=color;
		}
		
		int getX(){return x;}
		int getY(){return y;}
		string getColor(){return color;}
		
		void setX(int x){this->x = x;}
		void setY(int y){this->y = y;}
		void setColor(string color){this->color = color;}
		
		double getArea(){
			return getX()*getY();
		}
};

class Circle : public Shape{
		int radius;
	public:	
		Circle(int x,int y,string color,double radius) : Shape(x,y,color){
			this->radius=radius;
		}
		int getRadius(){return radius;}
		void setRadius(int radius){this->radius = radius;}
		double getArea(){return getRadius()*getRadius()*3.14 ;}
}; 


int main(){
	
	Circle c(3,3,"red",20);
	
	cout << "원의 면적: "<< c.getArea();
}
