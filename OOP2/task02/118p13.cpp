#include <iostream>

using namespace std;

int main(){
	
	int d1=0,d2=1,temp;
	int input;
	
	cout << "몇 항까지 구할까요:";
	cin >> input;
	
	for(int i=1; i<=input; i++){
		cout << d1 << " " ;
		temp=d1+d2;
		d1=d2;
		d2=temp;
	}
	
	return 0;
}
