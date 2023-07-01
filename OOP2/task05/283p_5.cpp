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
	vec.push_back(Student("±è¿µÈñ",3.8));
	vec.push_back(Student("±èÃ¶¼ö",3.9));
	vec.push_back(Student("ÃÖÀÚ¿µ",4.3));
	
	sort(vec.begin(), vec.end(), compare);
	
	for (auto& i : vec) {
		i.print();
	}
}
