#include <iostream>
#include <string>

using namespace std;

class Human{
		string name;
		int age;
	public:
		Human(string name,int age){
			this->name=name;
			this->age=age;
			cout << "Human ������ ȣ��" <<endl;
		}
		string getName(){return name;}
		int getAge(){return age;}
		void setName(string name){this->name = name;}
		void setAge(int age){this->age = age;}
		
		
};

class Student : public Human{
		string major;
	public:	
		Student(string name,int age, string major) : Human(name,age){
			this->major=major;
			cout << "Student ������ ȣ��" <<endl;	
		}
		string getMajor(){return major;}
}; 

void print(Human h){
	cout << h.getName() << " : " << h.getAge() << "��" << endl;
}
void print(Student s){
	cout << s.getName() << " : " << s.getAge() << "�� " << "���� : "<< s.getMajor()<< endl;
}

int main(){
	Human a("����",18);
	Human b("����",21);
	Human c("���",50);
	Student d("�浿",30,"����");
	
	print(a);
	print(b);
	print(c);
	print(d);
	
}
