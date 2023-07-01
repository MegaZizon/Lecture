#include <iostream>

using namespace std;

int main(){
	
	double temp;
	
	for(int i=0; i<100; i=i+10){
		
		temp=(i-32)*5.0/9.0;
		
		cout << i << "    " << temp<<endl;
	}
	
	return 0;
}
