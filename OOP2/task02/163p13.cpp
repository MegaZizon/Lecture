#include <iostream>
#include <string>
using namespace std;

bool Big(string str)
{
	for (int i=0; i<str.length(); i++){
		if (str[i]>='A' && str[i]<='Z')
			return true;
	}
	return false;
}

bool Small(string str)
{
	for (int i=0; i<str.length(); i++){
		if (str[i]>='a' && str[i]<='z')
			return true;
	}
	return false;
}

bool Number(string str)
{
	for (int i=0; i<str.length(); i++){
		if (str[i]>='0' && str[i]<='9')
			return true;
	}
	return false;
}

int main()
{
	string password;
	cout << "��ȣ�� �Է��Ͻÿ�: ";
	cin >> password;

	if (Big(password) && Small(password) && Number(password))
		cout << "�����մϴ�." << endl;
	else
		cout << "�������� �ʽ��ϴ�." ;

	return 0;
}
