#include <iostream>
using namespace std;

class Person{
private:
	string name;
	int snumber;
	int age;
public:
	Person(){
		name="ȫ�浿";
		snumber=0;
		age=0;
	}
	Person(string n,int s,int a){
		name=n;
		snumber=s;
		age=a;
	}
	//�ʱ�ȭ ����Ʈ 
	// Person(string n,int s,int a) : name(n), snumber(s), age(a){}
	~Person(){
		cout << "�Ҹ��� ȣ��\n";
	}
	print(){
		cout << "�̸�: "<<name << endl<<"�ֹι�ȣ: "<<snumber<<endl<<"����: "<<age<<endl; 
	}
};

int main(){
	Person p2("��ö��",990101,24);
	p2.print();
}
