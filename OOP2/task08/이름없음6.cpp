#include <iostream>
#include <string>

using namespace std;

class Employee{
		string name;
		int salary;
	public:
		Employee(string name,int salary){
			this->name=name;
			this->salary=salary;
		}
		string getName(){return name;}
		int getSalary(){return salary;}
		void setName(string name){this->name = name;}
		void setSalary(int salary){this->salary = salary;}
		
		int computeSalary(){
			return getSalary();
		}
		
};

class Manager : public Employee{
		int bonus;
	public:	
		Manager(string name,int salary, int bonus) : Employee(name,salary){
			this->bonus=bonus;
		}
		int getBonus(){return bonus;}
		void setBonus(int bonus){this->bonus = bonus;}
		int computeSalary(){return getSalary()+getBonus();}
}; 


int main(){
	
	Manager m("��ö��",200,100);
	
	cout << "�̸�: "<<m.getName() <<endl;
	cout << "����: "<<m.getSalary() <<endl;
	cout << "���ʽ�: "<<m.getBonus() <<endl;
	cout << "��ü�޿�: "<<m.computeSalary() <<endl;
}
