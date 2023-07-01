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
	
	cout << "첫 번째 정수: 10"<<endl;
	cout << "두 번째 정수: 20"<<endl;
	cout << "연산 결과 : "<<s.add();
}
