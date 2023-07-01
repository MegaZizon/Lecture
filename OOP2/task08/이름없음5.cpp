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
			cout << "Human 생성자 호출" <<endl;
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
			cout << "Student 생성자 호출" <<endl;	
		}
		string getMajor(){return major;}
}; 

void print(Human h){
	cout << h.getName() << " : " << h.getAge() << "세" << endl;
}
void print(Student s){
	cout << s.getName() << " : " << s.getAge() << "세 " << "직업 : "<< s.getMajor()<< endl;
}

int main(){
	Human a("춘향",18);
	Human b("몽룡",21);
	Human c("사또",50);
	Student d("길동",30,"의적");
	
	print(a);
	print(b);
	print(c);
	print(d);
	
}
