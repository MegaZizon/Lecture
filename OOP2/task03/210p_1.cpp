#include <iostream>
#include <string>

using namespace std;

class Person{
	string name;
	int age;
public:
	void setPerson(string n,int a){
		name=n;
		age=a;
	}
	void print(){
		cout << "ÀÌ¸§:" <<name<<endl;
		cout << "³ªÀÌ:" <<age<<endl;
	}
};


int main(){
	Person p;
	
	p.setPerson("±èÃ¶¼ö",21);
	p.print();
}
