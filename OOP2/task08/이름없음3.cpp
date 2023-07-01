#include <iostream>

using namespace std;

class Box{
	
	private:
		double length;
		double width;
		double height;
	
	public:
		Box(int l=0, int w=0, int h=0):length(l),width(w),height(h) {}
		
		double getVolume(void){
			return length * width * height;
		}
		
		bool operator<(Box& b2){
			return ( this->getVolume() < b2.getVolume() );
			
		}
		void print(){
			cout << "상자의 길이: "<< length <<endl;
			cout << "상자의 너비: "<< width  <<endl;
			cout << "상자의 높이: "<< height <<endl;
			cout << "상자의 부피: "<< getVolume() << endl<<endl;
		}
	
};

int main(){
	Box a(10,10,10),b(20,20,20);
	
	cout.setf(cout.boolalpha);
	
	cout << "상자#1" <<endl;
	a.print();
	cout << "상자#2" <<endl;
	b.print();
	
	cout << (a<b);
}
