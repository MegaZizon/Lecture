#include <iostream>
using namespace std;

class Complex{
	double r,i;
public:
	Complex(){
		r = 0;
		i = 0;
	}
	Complex(double a, double b) {
		r = a;
		i = b;
	}
	double getR() { return r; }
	double getI() { return i; }
	void setR(double a) { r = a; }
	void setI(double b) { i = b; }
	
	void print() {
		cout << "(" << r;
		if (i >= 0)
			cout << " + " << i << "i)";
		else
			cout << " - " << -i << "i)";
	}
	

};

Complex add(Complex a, Complex b){
	Complex temp;

	temp.setR(a.getR() + b.getR());
	temp.setI(a.getI() + b.getI());
	
	return temp;
}
int main(){
	Complex A( 5, 3 );
	Complex B( 3, -4 );
	Complex result;

	A.print();
	cout << "+";
	B.print();
	cout << "=";
	add(A, B).print();
	cout << endl;
}
