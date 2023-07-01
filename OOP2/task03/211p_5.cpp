#include <iostream>
#include <string>
#include <stdlib.h>
#include <time.h>

using namespace std;

class Dice{
	int face;
	
public:
	void roll(){
		face=(int)(rand()%6 +1);
	}
	void print(){
		cout <<"주사위 값="<<face<<endl;
	}
};


int main(){
	Dice d;
	
	srand((unsigned int)time(NULL));
	
	d.roll();
	d.print();
	d.roll();
	d.print();
}
