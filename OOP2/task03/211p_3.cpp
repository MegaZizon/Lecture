#include <iostream>
#include <string>

using namespace std;

class Sum{
	int n1,n2;
	
public:
	void init(int x,int y){
		n1=x;
		n2=y;
	}
	int add(){
		return n1+n2;	
	}
};


int main(){
	Sum s;
	
	s.init(10,20);
	
	cout << "ù ��° ����: 10"<<endl;
	cout << "�� ��° ����: 20"<<endl;
	cout << "���� ��� : "<<s.add();
}
