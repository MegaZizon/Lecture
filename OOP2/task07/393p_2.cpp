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
	cout <<"�Ϲ� ������" << endl;
	ptr = new int;
	*ptr = len;
}

Line::getLength(){
	cout << "���� ����: " <<*ptr<<endl;
}

Line::~Line(){
	if(ptr!=NULL)
		delete[] this->ptr;
	this->ptr=NULL;
}

Line::Line(const Line& other){

	this->ptr=new int[1];
	this->ptr[0]=other.ptr[0];
	cout << "���� ������"<<endl;
}

int main(){
	Line l1(10);
	Line l2=l1;
	Line l3=l1;
	l1.getLength();
	Line l4=l1;
	l4.getLength();
	
}
