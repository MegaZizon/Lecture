#include <iostream>

using namespace std;

class Line{
public:
	int getLength(void);
	Line(int len);
	~Line();
	Line(const Line& other);
	
private:
	int *ptr;
};

Line::Line(int len){
	cout <<"일반 생성자" << endl;
	ptr = new int;
	*ptr = len;
}

Line::getLength(){
	cout << "선의 길이: " <<*ptr<<endl;
}

Line::~Line(){
	if(ptr!=NULL)
		delete[] this->ptr;
	this->ptr=NULL;
}

Line::Line(const Line& other){

	this->ptr=new int[1];
	this->ptr[0]=other.ptr[0];
	cout << "복사 생성자"<<endl;
}

int main(){
	Line l1(10);
	Line l2=l1;
	Line l3=l1;
	l1.getLength();
	Line l4=l1;
	l4.getLength();
	
}
