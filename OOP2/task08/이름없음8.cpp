#include <iostream>
#include <cmath>

using namespace std;

class Complex{
	private :
		double real,imag;
	public :
		Complex(double r=0,double i=0) : real(r),imag(i){}
		Complex operator+(const Complex& c2);
		Complex operator-(const Complex& c2);
		Complex operator+=(const Complex& c2);
		Complex operator-=(const Complex& c2);
		bool operator==(const Complex& c2);
		bool operator!=(const Complex& c2);
		void print(){
			cout << real ;
			if (imag >= 0)
				cout << " + " << imag << "i" << endl;
			else
				cout << " - "<< -imag << "i" <<endl ;
		}
};

Complex Complex::operator+(const Complex& c2){
	Complex c;
	c.real=this->real + c2.real;
	c.imag =this->imag + c2.imag;
	
	return c;
}

Complex Complex::operator-(const Complex& c2){
	Complex c;
	c.real=this->real - c2.real;
	c.imag =this->imag - c2.imag;
	
	return c;
}

Complex Complex::operator+=(const Complex& c2){
	
	this->real =this->real + c2.real;
	this->imag =this->imag + c2.imag;
	
	return *this;
}

Complex Complex::operator-=(const Complex& c2){
	
	this->real =this->real - c2.real;
	this->imag =this->imag - c2.imag;
	
	return *this;
}

bool Complex::operator==(const Complex& c2){
	
	return (this->real == c2.real)&&(this->imag == c2.imag);
	
}
bool Complex::operator!=(const Complex& c2){
	
	return (this->real != c2.real)||(this->imag != c2.imag);
	
}


int main(){
	cout.setf(cout.boolalpha);
	
	Complex a(1.0,7.0),b(3.0,8.0),c,d,e;
	c = a+b;
	c = a-b;
	d += a;
	e -= a;
	
	
	a.print();
	b.print();
	c.print();
	d.print();
	e.print();
	cout << (a==b)<<" "<<  (a!=b)<< endl;
	
}
