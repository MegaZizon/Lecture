#include <iostream>
#include <string>

using namespace std;

class Account{
private:
	string name;
	double money;
	static const double interest=1.05;
	
public:
	void setName(string n){
		name=n;
	}
	void getMoney(double m){
		money=money-m;
	}
	
	void putMoney(double m){
		money=money+m;
	}
	string getName(){
		return name;
	}
	double showMoney(){
		return money;
	}
	void interest_(){
		money*=interest;
	}
};


int main(){
	Account ac;
	ac.setName("ȫ�浿");
	ac.putMoney(100);
	
	cout << "����:"<<ac.getName()<<endl;
	ac.interest_();
	cout << "����(5%) ���� �� �ݾ�:"<<ac.showMoney()<<endl;
	ac.getMoney(5);
	cout << "5�� ����  �� �ݾ�:"<<ac.showMoney()<<endl;
	
}
