#include <iostream>
using namespace std;

int main(){
	int speed=60;
	double time=2.5;
	
	double distance=speed*time;
	
	cout << "시속 "<<speed<<"km/h" <<" 로 "<<time<< "시간을 주행했을경우 ";
	cout << "이동거리는 " <<distance<<"km 입니다.";
}
