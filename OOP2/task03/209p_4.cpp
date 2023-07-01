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
	ac.setName("홍길동");
	ac.putMoney(100);
	
	cout << "고객명:"<<ac.getName()<<endl;
	ac.interest_();
	cout << "이자(5%) 지급 후 금액:"<<ac.showMoney()<<endl;
	ac.getMoney(5);
	cout << "5원 인출  후 금액:"<<ac.showMoney()<<endl;
	
}
