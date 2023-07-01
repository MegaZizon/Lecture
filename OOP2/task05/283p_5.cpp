#include <iostream>
#include <vector>
#include <string.h>
#include <algorithm>

using namespace std;

class Student {
	string name;
	double marks;
		
public:
	Student(string n, double m) : name{n},marks{m} {}
	double getMarks();
	void print();
};

double Student::getMarks(){
	return marks;
}

void Student::print(){
	cout << name << marks << endl;
}

bool compare(Student &a,Student &b){
	return a.getMarks() < b.getMarks();
}

int main(){
	
	vector <Student> vec;
	vec.push_back(Student("�迵��",3.8));
	vec.push_back(Student("��ö��",3.9));
	vec.push_back(Student("���ڿ�",4.3));
	
	sort(vec.begin(), vec.end(), compare);
	
	for (auto& i : vec) {
		i.print();
	}
}
