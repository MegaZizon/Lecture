#include <iostream>
#include <string>
#include <stdlib.h>
#include <time.h>

using namespace std;

class Employee{
	string name;  
	int age;
	int salary;
	
public:
	void init(string n,int a,int s){
		name=n;
		age=a;
		salary=s;
	}
	void print(){
		cout <<name<<endl;
		cout <<age<<endl;
		cout <<salary<<endl;
	}
};


int main(){
	
	Employee e1;
	e1.init("±èÃ¶¼ö",38,2000000);
	
	cout <<"Employee1:"<<endl;
	e1.print();
}
