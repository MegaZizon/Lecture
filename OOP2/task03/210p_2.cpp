#include <iostream>
#include <string>

using namespace std;

class Computer{
	string name;
	int RAM;
	double cpu_speed;
	
public:
	void setComputer(string n,int r,double c){
		name=n;
		RAM=r;
		cpu_speed=c;
	}
	void print(){
		cout << "�̸�: " <<name<<endl;
		cout << "RAM : " <<RAM<<endl;
		cout << "CPU �ӵ� : " <<cpu_speed<<endl;
	}
};


int main(){
	Computer c;
	
	c.setComputer("���ǽ���ǻ��",8,4.2);
	c.print();
}
