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
		cout << "��ȭ��ȣ : " << tel ;
	}
};

int main()
{
	vector<Contact> vec;
	string name;
	string tel;

	for (int i = 0; i < 3; i++) {
		cout << "�̸��� �Է��Ͻÿ� : ";
		cin >> name;
		cout << "��ȭ��ȣ�� �Է��Ͻÿ� : ";
		cin >> tel;

		vec.push_back(Contact(name, tel));
	}
	cout << "Ž���ϰ� ���� �̸��� �Է��Ͻÿ� : ";
	cin >> name;
	for (auto& i : vec) {
		if (i.getName() == name)
			i.print();
	}

}
