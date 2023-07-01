#include <iostream>
#include <stdbool.h>

using namespace std;

class Rect{
	int width,height;
	
public:
	Rect(int w=0,int h=0):width(w),height(h){}
	int getArea ()const{return width*height;}
	int getPerimeter ()const{return (width+height)*2;}
	void print(){
		cout << width,height;
	}

};

bool is_equal (Rect r1, Rect r2){
	if(r1.getArea()==r2.getArea()){
		cout << "equal"<<endl;
		return true;
	}
	cout<< "Not equal" << endl;
	return false;
}
	
bool is_equal2 (Rect &c1, Rect &c2) {
	if(c1.getArea()==c2.getArea()){
		cout << "equal"<<endl;
		return true;
	}
	cout<< "Not equal" << endl;
	return false;
}

int main(){
	Rect *p = new Rect;
	
	Rect r1(10,20);
	Rect r2(10,20);
	
	is_equal(r1,r2);
	
	Rect c1(10,20);
	Rect c2(10,30);
	
	is_equal2(c1,c2);
	return 0;
}
