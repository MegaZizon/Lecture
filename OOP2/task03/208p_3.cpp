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
	e.setName("ȫ�浿");
	e.setAge(26);
	e.setSalary(1000000);
	e.setYears(1);
	
	cout << "�̸�:"<<e.getName()<<endl;
	cout << "����:"<<e.getAge()<<endl;
	cout << "�޿�:"<<e.getSalary()<<endl;
	cout << "����:"<<e.getYears()<<endl;
	
}
