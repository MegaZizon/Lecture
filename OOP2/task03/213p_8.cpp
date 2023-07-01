#include <iostream>
#include <string>
#include <stdlib.h>
#include <time.h>

using namespace std;

class Complex{
	
public:
	
	double r,i;
	
	void init(double a,double b){
		r=a;
		i=b;
	}
	void print(){
		cout <<r ;
		if(i>0){
			cout <<" + ";
		}
		else{
			cout <<" - ";
			i=-i;
		}
		
		cout << i<<"i"<<endl;
	}
};


int main(){
	
	Complex c1,c2;
	c1.init(5,3);
	c2.init(3,-4);
	c1.print();
	c2.print();
}
