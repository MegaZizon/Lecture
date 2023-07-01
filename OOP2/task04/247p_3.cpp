#include <iostream>

using namespace std;
int NO=0;

class Box {
private:
	int number,length,width,height,volume;
	bool empty;
public:
	Box() {
		number=++NO;
		length = 0;
		width = 0;
		height = 0;
		empty = true;
	}
	Box( int l, int w, int h) : length(l),width(w)
	,height(h),empty(true){number=++NO;}

	int getLength() { return length; }
	int getWidth() { return width; }
	int getHeight() { return height; }
	void getVolume() { volume = length * width * height; }
	bool getEmpty() { return empty; }
	void setLength(int l) { length = l; }
	void setWidth(int w) { width = w; }
	void setHeight(int h) { height = h; }
	void Empty(){
		if(empty==true){ cout<< "�ڽ��� �������\n"	;}
		else{ cout <<" �ڽ��� ������� ����\n"		;}
	}
	
	void print() {
		cout << "���� #" << number << endl;
		cout << "������ ����: " << length << endl;
		cout << "������ �ʺ�: " << width << endl;
		cout << "������ ����: " << height << endl;
		cout << "������ ����: " << volume << endl;
	}
};

int main()
{
	Box b1;
	b1.getVolume();
	b1.print();

	cout << endl;

	Box b2( 3, 2, 4 );
	b2.getVolume();
	b2.print();

}
