#include <iostream>
#include <string>
#include <stdlib.h>
#include <time.h>

using namespace std;

class BankAccount{
	
public:
	
	string number;
	int balance;
	
	
	void init(string n, int b){
		number = n;
		balance = b;
		cout << "ÇöÀç ÀÜ¾×: " << balance << endl;
	}
	
	void deposit(int amount){
		balance+=amount;
		cout << "after deposit(" << amount << ") ";
		cout << "ÇöÀç ÀÜ¾×: " << balance << endl;
	}
	void withdraw(int amount){
		balance-=amount;
		cout << "after withdraw(" << amount << ") ";
		cout << "ÇöÀç ÀÜ¾×: " << balance << endl;
	}
};


int main(){
	BankAccount b;

	b.init("123456789", 1000000);
	b.deposit(1000000);
	b.withdraw(1000000);
}
