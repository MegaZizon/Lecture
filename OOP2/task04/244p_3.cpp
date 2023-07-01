#include <iostream>
using namespace std;

class BankAccount{
private:
	int balance;
	double rate;
public:
	BankAccount(){
		balance=0;
		rate=0.05;
	}
	BankAccount(int b,double r){
		balance=b;
		rate=r;
	}
	
	void disposit(int money){
		balance+=money;
	}
	void withdraw(int money){
		balance-=money;
	}
	void print(){
		cout << "현재잔고:" << balance <<"원\n이율"<<rate<<endl<<endl; 
	}
};



int main(){
	BankAccount b1;
	BankAccount b2(100,0.1);
	b1.print();
	b2.print();
}
