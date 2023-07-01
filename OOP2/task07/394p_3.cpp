#include <iostream>
#include <string.h>

using namespace std;

class MyClass{
	public:
		MyClass( const char* str);
		~MyClass();
		MyClass( const MyClass& other);
		void print();
	private:
		char* stored;
};

MyClass::MyClass(const char* str){
	stored = new char[strlen(str)+1];
	strcpy(stored,str);
	cout << "일반생성자 호출"<< endl;
}

MyClass::~MyClass(){
	cout << "소멸자 호출"<< endl;
	delete[] stored;
}

MyClass::MyClass(const MyClass& other){
	this->stored = new char[strlen(other.stored)+1];
	for(int i=0; i<strlen(other.stored)+1; i++){
		this->stored[i]= other.stored[i];
	}
	
	cout << "복사생성자 호출 "<< endl;
}
void MyClass::print(void){
	cout<< this->stored<<endl;
}

int main(){
	MyClass mc1("Hello World!");
	MyClass mc2 = mc1;
	mc2.~MyClass();
	mc1.print();
}
