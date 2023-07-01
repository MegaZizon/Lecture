#include <iostream>
#include <string>

using namespace std;

class Employee{
private:
	string name;
	int age,salary,years;
public:
	string getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	int getSalary(){
		return salary;
	}
	int getYears(){
		return years;
	}
	
	void setName(string n){
		name=n;
	}
	void setAge(int a){
		age=a;
	}
	void setSalary(int s){
		salary=s;
	}
	void setYears(int y){
		years=y;
	}
};


int main(){
	Employee e;
	e.setName("홍길동");
	e.setAge(26);
	e.setSalary(1000000);
	e.setYears(1);
	
	cout << "이름:"<<e.getName()<<endl;
	cout << "나이:"<<e.getAge()<<endl;
	cout << "급여:"<<e.getSalary()<<endl;
	cout << "년차:"<<e.getYears()<<endl;
	
}
