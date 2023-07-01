#include <iostream>
#include <string>

using namespace std;
int NO=0;

class Airplane {
private:
	string name;
	int capacity,speed,number;
public:
	Airplane() {
		number=++NO;
		name = "";
		capacity = 0;
		speed = 0;
	}
	Airplane( string n, int c, int s) {
		number=++NO;
		name = n;
		capacity = c;
		speed = s;
	}
	string getName() { return name; }
	int getCapacity() { return capacity; }
	int getSpeed() { return speed; }
	void setName(string n) { name = n; }
	void setCapacity(int c) { capacity = c; }
	void setSpeed(int s) { speed = s; }

	void print() {
		cout << "����� #" << number << endl;
		cout << "������� �̸�: " << name << endl;
		cout << "������� �뷮: " << capacity << endl;
		cout << "������� �ӵ�: " << speed << " Km/h" << endl;
	}
};

int main()
{
	Airplane airplane1( "���� 787", 900, 300 );
	Airplane airplane2( "������� 350", 400, 1000 );
	airplane1.print();
	cout << endl;
	airplane2.print();

}
