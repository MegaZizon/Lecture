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
	cout << "암호를 입력하시오: ";
	cin >> password;

	if (Big(password) && Small(password) && Number(password))
		cout << "안전합니다." << endl;
	else
		cout << "안전하지 않습니다." ;

	return 0;
}
