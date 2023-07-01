#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Contact {
	string name;
	string tel;
public:
	Contact() :name{ "" }, tel{ "" } {}
	Contact(string n, string t) :name{ n }, tel{ t } {}
	string getName() { return name; }

	void print() {
		cout << "전화번호 : " << tel ;
	}
};

int main()
{
	vector<Contact> vec;
	string name;
	string tel;

	for (int i = 0; i < 3; i++) {
		cout << "이름을 입력하시오 : ";
		cin >> name;
		cout << "전화번호를 입력하시오 : ";
		cin >> tel;

		vec.push_back(Contact(name, tel));
	}
	cout << "탐색하고 싶은 이름을 입력하시오 : ";
	cin >> name;
	for (auto& i : vec) {
		if (i.getName() == name)
			i.print();
	}

}
